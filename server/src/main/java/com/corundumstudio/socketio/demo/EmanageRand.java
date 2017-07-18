package com.corundumstudio.socketio.demo;

import net.sf.json.JSONObject;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author WuSong
 * @creat 2017-07-10
 */
public class EmanageRand {
    public static JSONObject generate(){
        BigDecimal POWER1 = new BigDecimal(80+Math.random()*(180-80)).setScale(1,BigDecimal.ROUND_HALF_UP);
        BigDecimal POWER2 = new BigDecimal(220+Math.random()*(270-220)).setScale(1,BigDecimal.ROUND_HALF_UP);
        BigDecimal POWER3 = new BigDecimal(280+Math.random()*(500-280)).setScale(1,BigDecimal.ROUND_HALF_UP);
        BigDecimal POWER4 = new BigDecimal(1230+Math.random()*(1480-1230)).setScale(1,BigDecimal.ROUND_HALF_UP);
        BigDecimal POWER5 = new BigDecimal(1230+Math.random()*(1480-1230)).setScale(1,BigDecimal.ROUND_HALF_UP);
        BigDecimal POWER6 = new BigDecimal(310+Math.random()*(350-310)).setScale(1,BigDecimal.ROUND_HALF_UP);
        BigDecimal POWER7 = new BigDecimal(310+Math.random()*(350-310)).setScale(1,BigDecimal.ROUND_HALF_UP);
        BigDecimal POWER8 = new BigDecimal(1230+Math.random()*(1480-1230)).setScale(1,BigDecimal.ROUND_HALF_UP);
        BigDecimal POWER9 = new BigDecimal(1230+Math.random()*(1480-1230)).setScale(1,BigDecimal.ROUND_HALF_UP);
        BigDecimal POWER10 = new BigDecimal(280+Math.random()*(500-280)).setScale(1,BigDecimal.ROUND_HALF_UP);
        BigDecimal POWER11 = new BigDecimal(80+Math.random()*(180-80)).setScale(1,BigDecimal.ROUND_HALF_UP);
        BigDecimal POWERTOTAL = POWER1.add(POWER2).add(POWER3).add(POWER4).add(POWER5).add(POWER6).add(POWER7).add(POWER8).add(POWER9).add(POWER10).add(POWER11);

        Map map = new HashMap();
        map.put("401",POWER1);
        map.put("104",POWER2);
        map.put("306",POWER3);
        map.put("201",POWER4);
        map.put("202",POWER5);
        map.put("302",POWER6);
        map.put("301",POWER7);
        map.put("305栋东",POWER8);
        map.put("305栋西",POWER9);
        map.put("101",POWER10);
        map.put("303",POWER11);
        map.put("303",POWER11);
        map.put("POWERTOTAL",POWERTOTAL);

        JSONObject json =JSONObject.fromObject(map);
        return json;
    }
}
