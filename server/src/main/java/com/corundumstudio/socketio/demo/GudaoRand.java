package com.corundumstudio.socketio.demo;

import net.sf.json.JSONObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WuSong
 * @creat 2017-07-10
 */
public class GudaoRand {
    private static BigDecimal DAY = new BigDecimal("1578.17");
    public static JSONObject generate(){
        //三相电压电流、有功无功功率、功率因素
        String SDIA = new BigDecimal(10+Math.random()*(25-10)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SDIB = new BigDecimal(10+Math.random()*(25-10)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SDIC = new BigDecimal(10+Math.random()*(25-10)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SDUA = new BigDecimal(375+Math.random()*(390-375)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SDUB = new BigDecimal(375+Math.random()*(390-375)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SDUC = new BigDecimal(375+Math.random()*(390-375)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SDPY = new BigDecimal(15+Math.random()*(35-15)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SDPW = new BigDecimal(0.01+Math.random()*(1-0.01)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SDPG = new BigDecimal(0.85+Math.random()*(0.90-0.85)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();

        String GFIA = new BigDecimal(10+Math.random()*(25-10)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String GFIB = new BigDecimal(10+Math.random()*(25-10)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String GFIC = new BigDecimal(10+Math.random()*(25-10)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String GFPY = new BigDecimal(15+Math.random()*(35-15)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String GFPW = new BigDecimal(0.01+Math.random()*(1-0.01)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String GFPG = new BigDecimal(0.85+Math.random()*(0.90-0.85)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();

        String DCIA = new BigDecimal(10+Math.random()*(25-10)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String DCIB = new BigDecimal(10+Math.random()*(25-10)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String DCIC = new BigDecimal(10+Math.random()*(25-10)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String DCPY = new BigDecimal(15+Math.random()*(35-15)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String DCPW = new BigDecimal(0.01+Math.random()*(1-0.01)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String DCPG = new BigDecimal(0.85+Math.random()*(0.90-0.85)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();

        String FHIA = new BigDecimal(10+Math.random()*(25-10)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String FHIB = new BigDecimal(10+Math.random()*(25-10)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String FHIC = new BigDecimal(10+Math.random()*(25-10)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String FHPY = new BigDecimal(15+Math.random()*(35-15)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String FHPW = new BigDecimal(0.01+Math.random()*(1-0.01)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String FHPG = new BigDecimal(0.85+Math.random()*(0.90-0.85)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();

        Map map = new HashMap();
        map.put("SDIA",SDIA);
        map.put("SDIB",SDIB);
        map.put("SDIC",SDIC);
        map.put("SDUA",SDUA);
        map.put("SDUB",SDUB);
        map.put("SDUC",SDUC);
        map.put("SDPY",SDPY);
        map.put("SDPW",SDPW);
        map.put("SDPG",SDPG);
        map.put("GFIA",GFIA);
        map.put("GFIB",GFIB);
        map.put("GFIC",GFIC);
        map.put("GFPY",GFPY);
        map.put("GFPW",GFPW);
        map.put("GFPG",GFPG);
        map.put("DCIA",DCIA);
        map.put("DCIB",DCIB);
        map.put("DCIC",DCIC);
        map.put("DCPY",DCPY);
        map.put("DCPW",DCPW);
        map.put("DCPG",DCPG);
        map.put("FHIA",FHIA);
        map.put("FHIB",FHIB);
        map.put("FHIC",FHIC);
        map.put("FHPY",FHPY);
        map.put("FHPW",FHPW);
        map.put("FHPG",FHPG);

        JSONObject json =JSONObject.fromObject(map);
        return json;
    }

    public static JSONObject generateHome(){
        //实时功率、实时电价
        String FDGL = new BigDecimal(35000+Math.random()*(38500-35000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String FHGL = new BigDecimal(35900+Math.random()*(36900-35900)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        DAY = new BigDecimal(0.01+Math.random()*(1-0.01)).add(DAY);
        String DAY2 = DAY.setScale(2,BigDecimal.ROUND_HALF_UP).toString();

        String GFGL = FDGL;
        String GFDJ = new BigDecimal(0.60+Math.random()*(0.65-0.60)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String DCGL = new BigDecimal(11000+Math.random()*(12000-11000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String DCDJ = new BigDecimal(0.30+Math.random()*(0.50-0.30)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String SDGL = new BigDecimal(38000+Math.random()*(40000-38000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SDDJ = new BigDecimal(0.75+Math.random()*(1-0.75)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();

        //功率与电价曲线
        List list = new ArrayList();
        Map mapCurve = new HashMap();
        String GF1_1 = new BigDecimal(35000+Math.random()*(38500-35000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String GF1_2 = new BigDecimal(35000+Math.random()*(38500-35000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String GF1_3 = new BigDecimal(35000+Math.random()*(38500-35000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String GF1_4 = new BigDecimal(35000+Math.random()*(38500-35000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String GF1_5 = new BigDecimal(35000+Math.random()*(38500-35000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String GF1_6 = new BigDecimal(35000+Math.random()*(38500-35000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String GF1_7 = new BigDecimal(35000+Math.random()*(38500-35000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String GF1_8 = new BigDecimal(35000+Math.random()*(38500-35000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String GF1_9 = new BigDecimal(35000+Math.random()*(38500-35000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String GF1_10 = new BigDecimal(35000+Math.random()*(38500-35000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String GF2_1 = new BigDecimal(0.60+Math.random()*(0.65-0.60)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String GF2_2 = new BigDecimal(0.60+Math.random()*(0.65-0.60)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String GF2_3 = new BigDecimal(0.60+Math.random()*(0.65-0.60)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String GF2_4 = new BigDecimal(0.60+Math.random()*(0.65-0.60)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String GF2_5 = new BigDecimal(0.60+Math.random()*(0.65-0.60)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String GF2_6 = new BigDecimal(0.60+Math.random()*(0.65-0.60)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String GF2_7 = new BigDecimal(0.60+Math.random()*(0.65-0.60)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String GF2_8 = new BigDecimal(0.60+Math.random()*(0.65-0.60)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String GF2_9 = new BigDecimal(0.60+Math.random()*(0.65-0.60)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String GF2_10 = new BigDecimal(0.60+Math.random()*(0.65-0.60)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        mapCurve.put("GF1_1",GF1_1);
        mapCurve.put("GF1_2",GF1_2);
        mapCurve.put("GF1_3",GF1_3);
        mapCurve.put("GF1_4",GF1_4);
        mapCurve.put("GF1_5",GF1_5);
        mapCurve.put("GF1_6",GF1_6);
        mapCurve.put("GF1_7",GF1_7);
        mapCurve.put("GF1_8",GF1_8);
        mapCurve.put("GF1_9",GF1_9);
        mapCurve.put("GF1_10",GF1_10);
        mapCurve.put("GF2_1",GF2_1);
        mapCurve.put("GF2_2",GF2_2);
        mapCurve.put("GF2_3",GF2_3);
        mapCurve.put("GF2_4",GF2_4);
        mapCurve.put("GF2_5",GF2_5);
        mapCurve.put("GF2_6",GF2_6);
        mapCurve.put("GF2_7",GF2_7);
        mapCurve.put("GF2_8",GF2_8);
        mapCurve.put("GF2_9",GF2_9);
        mapCurve.put("GF2_10",GF2_10);
        list.add(mapCurve);

        String DC1_1 = new BigDecimal(11000+Math.random()*(12000-11000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String DC1_2 = new BigDecimal(11000+Math.random()*(12000-11000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String DC1_3 = new BigDecimal(11000+Math.random()*(12000-11000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String DC1_4 = new BigDecimal(11000+Math.random()*(12000-11000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String DC1_5 = new BigDecimal(11000+Math.random()*(12000-11000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String DC1_6 = new BigDecimal(11000+Math.random()*(12000-11000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String DC1_7 = new BigDecimal(11000+Math.random()*(12000-11000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String DC1_8 = new BigDecimal(11000+Math.random()*(12000-11000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String DC1_9 = new BigDecimal(11000+Math.random()*(12000-11000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String DC1_10 = new BigDecimal(11000+Math.random()*(12000-11000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String DC2_1 = new BigDecimal(0.30+Math.random()*(0.50-0.30)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String DC2_2 = new BigDecimal(0.30+Math.random()*(0.50-0.30)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String DC2_3 = new BigDecimal(0.30+Math.random()*(0.50-0.30)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String DC2_4 = new BigDecimal(0.30+Math.random()*(0.50-0.30)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String DC2_5 = new BigDecimal(0.30+Math.random()*(0.50-0.30)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String DC2_6 = new BigDecimal(0.30+Math.random()*(0.50-0.30)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String DC2_7 = new BigDecimal(0.30+Math.random()*(0.50-0.30)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String DC2_8 = new BigDecimal(0.30+Math.random()*(0.50-0.30)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String DC2_9 = new BigDecimal(0.30+Math.random()*(0.50-0.30)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String DC2_10 = new BigDecimal(0.30+Math.random()*(0.50-0.30)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        mapCurve = new HashMap();
        mapCurve.put("DC1_1",DC1_1);
        mapCurve.put("DC1_2",DC1_2);
        mapCurve.put("DC1_3",DC1_3);
        mapCurve.put("DC1_4",DC1_4);
        mapCurve.put("DC1_5",DC1_5);
        mapCurve.put("DC1_6",DC1_6);
        mapCurve.put("DC1_7",DC1_7);
        mapCurve.put("DC1_8",DC1_8);
        mapCurve.put("DC1_9",DC1_9);
        mapCurve.put("DC1_10",DC1_10);
        mapCurve.put("DC2_1",DC2_1);
        mapCurve.put("DC2_2",DC2_2);
        mapCurve.put("DC2_3",DC2_3);
        mapCurve.put("DC2_4",DC2_4);
        mapCurve.put("DC2_5",DC2_5);
        mapCurve.put("DC2_6",DC2_6);
        mapCurve.put("DC2_7",DC2_7);
        mapCurve.put("DC2_8",DC2_8);
        mapCurve.put("DC2_9",DC2_9);
        mapCurve.put("DC2_10",DC2_10);
        list.add(mapCurve);

        String SD1_1 = new BigDecimal(38000+Math.random()*(40000-38000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SD1_2 = new BigDecimal(38000+Math.random()*(40000-38000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SD1_3 = new BigDecimal(38000+Math.random()*(40000-38000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SD1_4 = new BigDecimal(38000+Math.random()*(40000-38000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SD1_5 = new BigDecimal(38000+Math.random()*(40000-38000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SD1_6 = new BigDecimal(38000+Math.random()*(40000-38000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SD1_7 = new BigDecimal(38000+Math.random()*(40000-38000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SD1_8 = new BigDecimal(38000+Math.random()*(40000-38000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SD1_9 = new BigDecimal(38000+Math.random()*(40000-38000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SD1_10 = new BigDecimal(38000+Math.random()*(40000-38000)).setScale(1,BigDecimal.ROUND_HALF_UP).toString();
        String SD2_1 = new BigDecimal(0.75+Math.random()*(1-0.75)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String SD2_2 = new BigDecimal(0.75+Math.random()*(1-0.75)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String SD2_3 = new BigDecimal(0.75+Math.random()*(1-0.75)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String SD2_4 = new BigDecimal(0.75+Math.random()*(1-0.75)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String SD2_5 = new BigDecimal(0.75+Math.random()*(1-0.75)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String SD2_6 = new BigDecimal(0.75+Math.random()*(1-0.75)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String SD2_7 = new BigDecimal(0.75+Math.random()*(1-0.75)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String SD2_8 = new BigDecimal(0.75+Math.random()*(1-0.75)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String SD2_9 = new BigDecimal(0.75+Math.random()*(1-0.75)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String SD2_10 = new BigDecimal(0.75+Math.random()*(1-0.75)).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        mapCurve = new HashMap();
        mapCurve.put("SD1_1",SD1_1);
        mapCurve.put("SD1_2",SD1_2);
        mapCurve.put("SD1_3",SD1_3);
        mapCurve.put("SD1_4",SD1_4);
        mapCurve.put("SD1_5",SD1_5);
        mapCurve.put("SD1_6",SD1_6);
        mapCurve.put("SD1_7",SD1_7);
        mapCurve.put("SD1_8",SD1_8);
        mapCurve.put("SD1_9",SD1_9);
        mapCurve.put("SD1_10",SD1_10);
        mapCurve.put("SD2_1",SD2_1);
        mapCurve.put("SD2_2",SD2_2);
        mapCurve.put("SD2_3",SD2_3);
        mapCurve.put("SD2_4",SD2_4);
        mapCurve.put("SD2_5",SD2_5);
        mapCurve.put("SD2_6",SD2_6);
        mapCurve.put("SD2_7",SD2_7);
        mapCurve.put("SD2_8",SD2_8);
        mapCurve.put("SD2_9",SD2_9);
        mapCurve.put("SD2_10",SD2_10);
        list.add(mapCurve);

        Map map = new HashMap();
        map.put("FDGL",FDGL);
        map.put("FHGL",FHGL);
        map.put("DAY",DAY2);

        map.put("GFGL",GFGL);
        map.put("GFDJ",GFDJ);
        map.put("DCGL",DCGL);
        map.put("DCDJ",DCDJ);
        map.put("SDGL",SDGL);
        map.put("SDDJ",SDDJ);

        map.put("curve",list);

        JSONObject json =JSONObject.fromObject(map);
        return json;
    }

}
