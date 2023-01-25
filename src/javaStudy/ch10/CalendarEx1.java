package javaStudy.ch10;

import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) {
        // �⺻������ ���糯¥�� �ð����� ������.
        Calendar today = Calendar.getInstance();
        System.out.println("�� ���� �⵵ : "+today.get(Calendar.YEAR)); // 2022
        System.out.println("��(0 ~ 11, 0 : 1��) : "+today.get(Calendar.MONTH)); // 4 => 5��
        System.out.println(today.get(Calendar.WEEK_OF_MONTH)); // �̴��� 3°�� 
        System.out.println(today.get(Calendar.WEEK_OF_YEAR)); // ������ 21��
        System.out.println(today.get(Calendar.DAY_OF_MONTH)); // �� ���� 15��

        System.out.println("0 : ����, 1 : ���� => "+today.get(Calendar.AM_PM));
        System.out.println(today.get(Calendar.HOUR));
        System.out.println(today.get(Calendar.MINUTE));
        System.out.println(today.get(Calendar.SECOND));
        System.out.println(today.get(Calendar.MILLISECOND)); // 571
        // 1000���� 1��?


    }
}
