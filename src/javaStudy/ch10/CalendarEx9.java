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

    // 두 날짜간의 차이를 일단위로 반환한다.
    private static int daydiff(int y1, int m1, int d1, int y2, int m2, int d2) {
        return convertDateToDay(y1, m1, d1) - convertDateToDay(y2, m2, d2);
    }

    public static int[] endOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // 지정한 날짜의 요일일 반환한다.(1 ~ 7, 1일 일요일)
    private static int getDayOfWeek(int year, int month, int day) {
        // 1~7의 값을 반환한다. 결과가 1 이면 일요일
        return convertDateToDay(year, month, day) % 7 + 1;
    }

    // 년월일을 입력받아서 일단위로 변환한다.
    private static int convertDateToDay(int year, int month, int day) {
        int numOfLeapYear = 0;

        // 전년도까지의 윤년의 수를 구한다.
        for(int i = 1;i<year;i++){
            if(isLeapYear(i))
                numOfLeapYear++;
        }

        // 전년도까지의 일수를 구한다.
        int toLastYearDaySum = (year - 1) * 365 + numOfLeapYear;

        // 올해의 현재 월 까지의 일수 계산
        int thisYearDaySum = 0;

        for(int i = 0;i<month-1;i++){
            thisYearDaySum+=endOfMonth[i];
        }
        // 윤년이고 2월이 포함되어있으면 1일을 증가시킨다.
        if(month > 2 && isLeapYear(year))
            thisYearDaySum++;

        thisYearDaySum+= day;
        return toLastYearDaySum + thisYearDaySum;
    }
    

    // 윤년이면 true 리턴
    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0);
    }
}
