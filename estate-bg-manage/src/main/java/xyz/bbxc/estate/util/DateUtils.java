package xyz.bbxc.estate.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @Classname DateUtils
 * @Description TODO
 * @Date 2021-4-4 11:51
 * @Created by 白白小草
 */
public class DateUtils {

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public static String getDate(){
        Date date = new Date();
        return sdf.format(date);
    }

    public static String setBirth(String idcard) {
        //通过身份证号码来截取生日
        String s = idcard.substring(6,14);
        //加入-
        String year = s.substring(0,4);
        String month = s.substring(4,6);
        String day = s.substring(6,8);
        return year+"-"+month+"-"+day;
    }

//    public static void main(String[] args) {
//        System.out.println(UUID.randomUUID()+".jpg");
//    }

}
