package com.corundumstudio.socketio.demo;

import net.sf.json.JSONObject;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 用电总用电、光伏总发电、经济收益、节能减排
 * @author WuSong
 * @creat 2017-07-10
 */
public class HomePageRand {
    private static BigDecimal YDZYD = new BigDecimal("21115120.65");
    private static BigDecimal GFZFD = new BigDecimal("22132.12");
    private static BigDecimal JJSY = new BigDecimal("101325.15");
    private static BigDecimal CO2 = new BigDecimal("16213.99");
    public static JSONObject generate(){
        GFZFD = new BigDecimal(0.02+Math.random()*(0.09-0.02)).add(GFZFD);
        String GFZFD2 = GFZFD.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        YDZYD = new BigDecimal(0.50+Math.random()*(2.50-0.50)).add(YDZYD);
        String YDZYD2 = YDZYD.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        JJSY = new BigDecimal(0.1+Math.random()*(1-0.1)).add(JJSY);
        String JJSY2 = JJSY.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        CO2 = new BigDecimal(0.1+Math.random()*(0.8-0.1)).add(CO2);
        String CO22 = CO2.setScale(2,BigDecimal.ROUND_HALF_UP).toString();

        Map map = new HashMap();
        map.put("GFZFD",GFZFD2);
        map.put("YDZYD",YDZYD2);
        map.put("JJSY",JJSY2);
        map.put("CO2",CO22);

        JSONObject json =JSONObject.fromObject(map);
        return json;
    }
}
