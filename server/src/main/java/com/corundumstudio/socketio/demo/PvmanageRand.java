package com.corundumstudio.socketio.demo;

import net.sf.json.JSONObject;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author WuSong
 * @creat 2017-07-10
 */
public class PvmanageRand {

    public static JSONObject generate(){
        String WIND_SPEED = new BigDecimal(0.9+Math.random()*(2.3-0.9)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SUN_STRENGTH = new BigDecimal(1600+Math.random()*(4000-1600)).setScale(0,BigDecimal.ROUND_HALF_UP).toString();
        String AMBIEN_TEMP = new BigDecimal(31+Math.random()*(32-31)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String WIND_DIREC = new BigDecimal(40+Math.random()*(45-40)).setScale(0,BigDecimal.ROUND_HALF_UP).toString();
        String RATED_P = new BigDecimal(38500).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String OUTPUT_P = new BigDecimal(35000+Math.random()*(38500-35000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String CONNECT_P = new BigDecimal(35000+Math.random()*(38500-35000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        Map map = new HashMap();
        map.put("WIND_SPEED",WIND_SPEED);
        map.put("SUN_STRENGTH",SUN_STRENGTH);
        map.put("AMBIEN_TEMP",AMBIEN_TEMP);
        map.put("WIND_DIREC",WIND_DIREC);
        map.put("RATED_P",RATED_P);
        map.put("OUTPUT_P",OUTPUT_P);
        map.put("CONNECT_P",CONNECT_P);
        JSONObject json =JSONObject.fromObject(map);
        return json;
    }
}
