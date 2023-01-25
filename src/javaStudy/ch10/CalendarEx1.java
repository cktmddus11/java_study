package javaStudy.ch10;

import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) {
        // 기본적으로 현재날짜와 시간으로 설정됨.
        Calendar today = Calendar.getInstance();
        System.out.println("이 해의 년도 : "+today.get(Calendar.YEAR)); // 2022
        System.out.println("월(0 ~ 11, 0 : 1월) : "+today.get(Calendar.MONTH)); // 4 => 5월
        System.out.println(today.get(Calendar.WEEK_OF_MONTH)); // 이달의 3째주 
        System.out.println(today.get(Calendar.WEEK_OF_YEAR)); // 이해의 21주
        System.out.println(today.get(Calendar.DAY_OF_MONTH)); // 이 달의 15일

        System.out.println("0 : 오전, 1 : 오후 => "+today.get(Calendar.AM_PM));
        System.out.println(today.get(Calendar.HOUR));
        System.out.println(today.get(Calendar.MINUTE));
        System.out.println(today.get(Calendar.SECOND));
        System.out.println(today.get(Calendar.MILLISECOND)); // 571
        // 1000분의 1초?


    }
}
