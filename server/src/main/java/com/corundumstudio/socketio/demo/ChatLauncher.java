package com.corundumstudio.socketio.demo;

import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.listener.ConnectListener;
import com.corundumstudio.socketio.listener.DataListener;
import com.corundumstudio.socketio.listener.DisconnectListener;
import org.apache.log4j.Logger;

import java.util.*;

public class ChatLauncher {
    private static List<SocketIOClient> clients = new ArrayList<SocketIOClient>();
    private static Logger log = Logger.getLogger(ChatLauncher.class);
    public static int i = 0;
    public static void main(String[] args) throws InterruptedException {
        Configuration config = new Configuration();
        config.setHostname("192.168.100.155");
        config.setPort(9092);

        final SocketIOServer server = new SocketIOServer(config);
        server.addConnectListener(new ConnectListener() {
            @Override
            public void onConnect(SocketIOClient socketIOClient) {
                clients.add(socketIOClient);
                log.info("Client Address："+socketIOClient.getRemoteAddress()+"已连接");
                log.info("Client Id："+socketIOClient.getSessionId().toString().replaceAll("-",""));
            }
        });

        server.addDisconnectListener(new DisconnectListener() {
            @Override
            public void onDisconnect(SocketIOClient socketIOClient) {
                clients.remove(socketIOClient);
                log.info("Client Address："+socketIOClient.getRemoteAddress()+"已下线");
            }
        });
        server.start();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                server.getBroadcastOperations().sendEvent("pvmanage",PvmanageRand.generate());
            }
        },0,3000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                server.getBroadcastOperations().sendEvent("gudao",GudaoRand.generate());
            }
        },0,3000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                server.getBroadcastOperations().sendEvent("emanage",EmanageRand.generate());
            }
        },0,3000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                server.getBroadcastOperations().sendEvent("homepage",HomePageRand.generate());
            }
        },0,3000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                server.getBroadcastOperations().sendEvent("gudaohome",GudaoRand.generateHome());
            }
        },0,5000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                server.getBroadcastOperations().sendEvent("systemview",SystemView.generate());
            }
        },0,3000);

        server.addEventListener("chatevent",Map.class,new DataListener<Map>()       {
            @Override
            public void onData(SocketIOClient client, Map message, AckRequest ackRequest) {
                // broadcast messages to all clients
                server.getBroadcastOperations().sendEvent("string", message);
                log.info(message);
            }
        });



        /*Thread.sleep(Integer.MAX_VALUE);

        server.stop();*/
    }

}
