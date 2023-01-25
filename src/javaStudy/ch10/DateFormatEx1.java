package javaStudy.ch10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx1 {
    public static void main(String[] args) {
        // Date   parse(String) => 문자열 source를 날짜 Date인스턴스로 변환
        // String format(Date)  => 지정한 출력형식에 맞게 변환된 String 문자열반환
        String today = "20220515";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy년 MM월 dd일");
        try {
            Date todayDate = df.parse(today);
            System.out.println(df2.format(todayDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }





    }
}
