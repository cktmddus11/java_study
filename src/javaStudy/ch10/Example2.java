package javaStudy.ch10;

import java.util.Calendar;
import java.util.Date;

// Date 와  Calendar간의 변환
public class Example2 {
    public static void main(String[] args) {
        // 1. Calendar => Date
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTimeInMillis());
        Date d = new Date(cal.getTimeInMillis());
        System.out.println(d.getDate());// 15
        // 'getDate()' is deprecated  => 더이상 권장히지 않는다는 뜻??

        // 2. Date => Calendar
        Date d2 = new Date();
        Calendar cal2 = Calendar.getInstance();
        cal.setTime(d2);


    }
}
