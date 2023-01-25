package javaStudy.ch10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx1 {
    public static void main(String[] args) {
        // Date   parse(String) => ���ڿ� source�� ��¥ Date�ν��Ͻ��� ��ȯ
        // String format(Date)  => ������ ������Ŀ� �°� ��ȯ�� String ���ڿ���ȯ
        String today = "20220515";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy�� MM�� dd��");
        try {
            Date todayDate = df.parse(today);
            System.out.println(df2.format(todayDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }





    }
}
