package com.corundumstudio.socketio.demo;

import net.sf.json.JSONObject;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @creat 2017-07-14
 */
public class SystemView {
    private static BigDecimal ZYD101 = new BigDecimal("836349.51");
    private static BigDecimal RYD101 = new BigDecimal("1820.77");
    private static BigDecimal ZFD101 = new BigDecimal("109116.87");
    private static BigDecimal RFD101 = new BigDecimal("304.78");
    private static BigDecimal GL101 = new BigDecimal("5037.4");

    private static BigDecimal ZYD104 = new BigDecimal("627186.97");
    private static BigDecimal RYD104 = new BigDecimal("1355.01");
    private static BigDecimal ZYD201 = new BigDecimal("3359728.94");
    private static BigDecimal RYD201 = new BigDecimal("7259.3");
    private static BigDecimal ZYD202 = new BigDecimal("3561778.15");
    private static BigDecimal RYD202 = new BigDecimal("7744.81");

    private static BigDecimal ZYD301 = new BigDecimal("838085.16");
    private static BigDecimal RYD301 = new BigDecimal("1826.27");
    private static BigDecimal ZFD301 = new BigDecimal("272612.76");
    private static BigDecimal RFD301 = new BigDecimal("759.98");
    private static BigDecimal GL301 = new BigDecimal("12771.7");

    private static BigDecimal ZYD302 = new BigDecimal("832084.3");
    private static BigDecimal RYD302 = new BigDecimal("1827.83");
    private static BigDecimal ZFD302 = new BigDecimal("54533.56");
    private static BigDecimal RFD302 = new BigDecimal("151.27");
    private static BigDecimal GL302 = new BigDecimal("2541.48");

    private static BigDecimal ZYD305D = new BigDecimal("3566168.07");
    private static BigDecimal RYD305D = new BigDecimal("7739.04");
    private static BigDecimal ZYD305X = new BigDecimal("3563432.97");
    private static BigDecimal RYD305X = new BigDecimal("7770.20");

    private static BigDecimal ZYD306 = new BigDecimal("839213.65");
    private static BigDecimal RYD306 = new BigDecimal("1817.76");
    private static BigDecimal ZFD306 = new BigDecimal("109147.83");
    private static BigDecimal RFD306 = new BigDecimal("306.32");
    private static BigDecimal GL306 = new BigDecimal("5049.63");

    private static BigDecimal ZYD401 = new BigDecimal("419157.51");
    private static BigDecimal RYD401 = new BigDecimal("905.95");
    private static BigDecimal ZFD401 = new BigDecimal("54476.13");
    private static BigDecimal RFD401 = new BigDecimal("151.35");
    private static BigDecimal GL401 = new BigDecimal("2534.32");
    
   
    public static JSONObject generate(){
        ZYD101 = new BigDecimal(0.02+Math.random()*(0.09-0.02)).add(ZYD101);
        String ZYD101_2 = ZYD101.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        RYD101 = new BigDecimal(0.50+Math.random()*(2.50-0.50)).add(RYD101);
        String RYD101_2 = RYD101.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        ZFD101 = new BigDecimal(0.1+Math.random()*(1-0.1)).add(ZFD101);
        String ZFD101_2 = ZFD101.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        RFD101 = new BigDecimal(0.1+Math.random()*(0.8-0.1)).add(RFD101);
        String RFD101_2 = RFD101.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        GL101 = new BigDecimal(0.02+Math.random()*(0.09-0.02)).add(GL101);
        String GL101_2 = GL101.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        ZYD104 = new BigDecimal(0.50+Math.random()*(2.50-0.50)).add(ZYD104);
        String ZYD104_2 = ZYD104.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        RYD104 = new BigDecimal(0.1+Math.random()*(1-0.1)).add(RYD104);
        String RYD104_2 = RYD104.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        ZYD201 = new BigDecimal(0.1+Math.random()*(0.8-0.1)).add(ZYD201);
        String ZYD201_2 = ZYD201.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        RYD201 = new BigDecimal(0.02+Math.random()*(0.09-0.02)).add(RYD201);
        String RYD201_2 = RYD201.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        ZYD202 = new BigDecimal(0.50+Math.random()*(2.50-0.50)).add(ZYD202);
        String ZYD202_2 = ZYD202.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        RYD202 = new BigDecimal(0.1+Math.random()*(1-0.1)).add(RYD202);
        String RYD202_2 = RYD202.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        ZYD301 = new BigDecimal(0.1+Math.random()*(0.8-0.1)).add(ZYD301);
        String ZYD301_2 = ZYD301.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        RYD301 = new BigDecimal(0.02+Math.random()*(0.09-0.02)).add(RYD301);
        String RYD301_2 = RYD301.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        ZFD301 = new BigDecimal(0.50+Math.random()*(2.50-0.50)).add(ZFD301);
        String ZFD301_2 = ZFD301.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        RFD301 = new BigDecimal(0.1+Math.random()*(1-0.1)).add(RFD301);
        String RFD301_2 = RFD301.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        GL301 = new BigDecimal(0.1+Math.random()*(0.8-0.1)).add(GL301);
        String GL301_2 = GL301.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        ZYD302 = new BigDecimal(0.02+Math.random()*(0.09-0.02)).add(ZYD302);
        String ZYD302_2 = ZYD302.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        RYD302 = new BigDecimal(0.50+Math.random()*(2.50-0.50)).add(RYD302);
        String RYD302_2 = RYD302.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        ZFD302 = new BigDecimal(0.1+Math.random()*(1-0.1)).add(ZFD302);
        String ZFD302_2 = ZFD302.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        RFD302 = new BigDecimal(0.1+Math.random()*(0.8-0.1)).add(RFD302);
        String RFD302_2 = RFD302.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        GL302 = new BigDecimal(0.02+Math.random()*(0.09-0.02)).add(GL302);
        String GL302_2 = GL302.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        ZYD305D = new BigDecimal(0.50+Math.random()*(2.50-0.50)).add(ZYD305D);
        String ZYD305D_2 = ZYD305D.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        RYD305D = new BigDecimal(0.1+Math.random()*(1-0.1)).add(RYD305D);
        String RYD305D_2 = RYD305D.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        ZYD305X = new BigDecimal(0.1+Math.random()*(0.8-0.1)).add(ZYD305X);
        String ZYD305X_2 = ZYD305X.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        RYD305X = new BigDecimal(0.02+Math.random()*(0.09-0.02)).add(RYD305X);
        String RYD305X_2 = RYD305X.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        ZYD306 = new BigDecimal(0.50+Math.random()*(2.50-0.50)).add(ZYD306);
        String ZYD306_2 = ZYD306.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        RYD306 = new BigDecimal(0.1+Math.random()*(1-0.1)).add(RYD306);
        String RYD306_2 = RYD306.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        ZFD306 = new BigDecimal(0.1+Math.random()*(0.8-0.1)).add(ZFD306);
        String ZFD306_2 = ZFD306.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        RFD306 = new BigDecimal(0.02+Math.random()*(0.09-0.02)).add(RFD306);
        String RFD306_2 = RFD306.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        GL306 = new BigDecimal(0.50+Math.random()*(2.50-0.50)).add(GL306);
        String GL306_2 = GL306.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        ZYD401 = new BigDecimal(0.1+Math.random()*(1-0.1)).add(ZYD401);
        String ZYD401_2 = ZYD401.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        RYD401 = new BigDecimal(0.1+Math.random()*(0.8-0.1)).add(RYD401);
        String RYD401_2 = RYD401.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        ZFD401 = new BigDecimal(0.02+Math.random()*(0.09-0.02)).add(ZFD401);
        String ZFD401_2 = ZFD401.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        RFD401 = new BigDecimal(0.50+Math.random()*(2.50-0.50)).add(RFD401);
        String RFD401_2 = RFD401.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        GL401 = new BigDecimal(0.1+Math.random()*(1-0.1)).add(GL401);
        String GL401_2 = GL401.setScale(2,BigDecimal.ROUND_HALF_UP).toString();


        Map map = new HashMap();
        map.put("ZYD101",ZYD101_2);
        map.put("RYD101",RYD101_2);
        map.put("ZFD101",ZFD101_2);
        map.put("RFD101",RFD101_2);
        map.put("GL101",GL101_2);
        map.put("ZYD104",ZYD104_2);
        map.put("RYD104",RYD104_2);
        map.put("ZYD201",ZYD201_2);
        map.put("RYD201",RYD201_2);
        map.put("ZYD202",ZYD202_2);
        map.put("RYD202",RYD202_2);
        map.put("ZYD301",ZYD301_2);
        map.put("RYD301",RYD301_2);
        map.put("ZFD301",ZFD301_2);
        map.put("RFD301",RFD301_2);
        map.put("GL301",GL301_2);
        map.put("ZYD302",ZYD302_2);
        map.put("RYD302",RYD302_2);
        map.put("ZFD302",ZFD302_2);
        map.put("RFD302",RFD302_2);
        map.put("GL302",GL302_2);
        map.put("ZYD305D",ZYD305D_2);
        map.put("RYD305D",RYD305D_2);
        map.put("ZYD305X",ZYD305X_2);
        map.put("RYD305X",RYD305X_2);
        map.put("ZYD306",ZYD306_2);
        map.put("RYD306",RYD306_2);
        map.put("ZFD306",ZFD306_2);
        map.put("RFD306",RFD306_2);
        map.put("GL306",GL306_2);
        map.put("ZYD401",ZYD401_2);
        map.put("RYD401",RYD401_2);
        map.put("ZFD401",ZFD401_2);
        map.put("RFD401",RFD401_2);
        map.put("GL401",GL401_2);


        JSONObject json =JSONObject.fromObject(map);
        return json;
    }
}
