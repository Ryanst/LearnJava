package com.ryanst.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by zhengjuntong on 16/6/1.
 */
public class DateFormat {
    public static void main(String args[]) {

        long utcTime = 2005315200L;

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        System.out.println(getWeekDay(utcTime));

        utcTime *= 1000;
        System.out.println(getWeekDay(utcTime));
    }

    public static String getWeekDay(long utcTime) {

        if (utcTime == 0L)
            return "";

        if (utcTime < 10000000000L) {
            utcTime *= 1000;
        }
        String str;
        str = getWeekDayIndex(utcTime);
        if ("1".equals(str)) {
            str = "周日";
        } else if ("2".equals(str)) {
            str = "周一";
        } else if ("3".equals(str)) {
            str = "周二";
        } else if ("4".equals(str)) {
            str = "周三";
        } else if ("5".equals(str)) {
            str = "周四";
        } else if ("6".equals(str)) {
            str = "周五";
        } else if ("7".equals(str)) {
            str = "周六";
        }
        return str;
    }

    public static String getWeekDayIndex(long utcTime) {

        if (utcTime == 0L)
            return "";

        if (utcTime < 10000000000L) {
            utcTime *= 1000;
        }
        Date date = new Date(utcTime);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        // 1=周日 7=周六，其他类推
        return new SimpleDateFormat("EEEE").format(calendar.getTime());
    }
}
