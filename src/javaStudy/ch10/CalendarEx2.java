package javaStudy.ch10;

import java.util.Calendar;

public class CalendarEx2 {
    public static void main(String[] args) {
        // 요일은 1부터 시작하기 때문에 DAY_OF_WEEK[0]은 비워둠.
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        // month 의 경우 0부터 시작하기 때문에 8월인 7로 지정해야한다.
        // date1.set(2015, Calendar.AGUST, 15); 6월이면 5로 지정.
        date1.set(2022, Calendar.JUNE, 15);
        System.out.println("date1 은 "+toString(date1));

        date2.set(2022, 4, 15); // 5월
        System.out.println("date2 은 "+toString(date2));

        // 두 날짜간의 차이를 얻으려면 getTimeInMillis() 천분의 일초단위로 변환해야함.
        long difference = (date1.getTimeInMillis() - date2.getTimeInMillis()) / 1000;
        System.out.println("6월 15일 ~ 5월 15일 차이 : "+difference);  // 2678399
        System.out.println("일로 계산하면 : "+difference / (24 * 60 * 60)); // 30일 
        //                                                 24 * 60 * 60 => 1일


    }

    private static String toString(Calendar date) {
        return date.get(Calendar.YEAR)+"년 "
                +(date.get(Calendar.MONTH)+1)+"월 "
                +date.get(Calendar.DATE)+"일";
    }
}
