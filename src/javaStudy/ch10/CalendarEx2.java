package javaStudy.ch10;

import java.util.Calendar;

public class CalendarEx2 {
    public static void main(String[] args) {
        // ������ 1���� �����ϱ� ������ DAY_OF_WEEK[0]�� �����.
        final String[] DAY_OF_WEEK = {"", "��", "��", "ȭ", "��", "��", "��", "��"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        // month �� ��� 0���� �����ϱ� ������ 8���� 7�� �����ؾ��Ѵ�.
        // date1.set(2015, Calendar.AGUST, 15); 6���̸� 5�� ����.
        date1.set(2022, Calendar.JUNE, 15);
        System.out.println("date1 �� "+toString(date1));

        date2.set(2022, 4, 15); // 5��
        System.out.println("date2 �� "+toString(date2));

        // �� ��¥���� ���̸� �������� getTimeInMillis() õ���� ���ʴ����� ��ȯ�ؾ���.
        long difference = (date1.getTimeInMillis() - date2.getTimeInMillis()) / 1000;
        System.out.println("6�� 15�� ~ 5�� 15�� ���� : "+difference);  // 2678399
        System.out.println("�Ϸ� ����ϸ� : "+difference / (24 * 60 * 60)); // 30�� 
        //                                                 24 * 60 * 60 => 1��


    }

    private static String toString(Calendar date) {
        return date.get(Calendar.YEAR)+"�� "
                +(date.get(Calendar.MONTH)+1)+"�� "
                +date.get(Calendar.DATE)+"��";
    }
}
