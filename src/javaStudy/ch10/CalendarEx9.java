package javaStudy.ch10;

public class CalendarEx9 {
    public static void main(String[] args) {
        System.out.println("2022. 05. 15 : "+getDayOfWeek(2022, 5, 15));
        System.out.println("2022. 05. 15 : "+getDayOfWeek(2022, 6, 15));
        System.out.println("2022. 06. 15 - 2022. 05. 15 : "+daydiff(2022, 6, 15, 2022, 5, 15));
       // System.out.println("2678399"+convertDayToDate(2678399));
    }

    /*private static String convertDayToDate(int i) {
    }*/

    // �� ��¥���� ���̸� �ϴ����� ��ȯ�Ѵ�.
    private static int daydiff(int y1, int m1, int d1, int y2, int m2, int d2) {
        return convertDateToDay(y1, m1, d1) - convertDateToDay(y2, m2, d2);
    }

    public static int[] endOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // ������ ��¥�� ������ ��ȯ�Ѵ�.(1 ~ 7, 1�� �Ͽ���)
    private static int getDayOfWeek(int year, int month, int day) {
        // 1~7�� ���� ��ȯ�Ѵ�. ����� 1 �̸� �Ͽ���
        return convertDateToDay(year, month, day) % 7 + 1;
    }

    // ������� �Է¹޾Ƽ� �ϴ����� ��ȯ�Ѵ�.
    private static int convertDateToDay(int year, int month, int day) {
        int numOfLeapYear = 0;

        // ���⵵������ ������ ���� ���Ѵ�.
        for(int i = 1;i<year;i++){
            if(isLeapYear(i))
                numOfLeapYear++;
        }

        // ���⵵������ �ϼ��� ���Ѵ�.
        int toLastYearDaySum = (year - 1) * 365 + numOfLeapYear;

        // ������ ���� �� ������ �ϼ� ���
        int thisYearDaySum = 0;

        for(int i = 0;i<month-1;i++){
            thisYearDaySum+=endOfMonth[i];
        }
        // �����̰� 2���� ���ԵǾ������� 1���� ������Ų��.
        if(month > 2 && isLeapYear(year))
            thisYearDaySum++;

        thisYearDaySum+= day;
        return toLastYearDaySum + thisYearDaySum;
    }
    

    // �����̸� true ����
    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0);
    }
}
