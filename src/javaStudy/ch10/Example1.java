package javaStudy.ch10;

import java.util.Calendar;
// Calendar 클래스의 사용

public class Example1 {
    public static void main(String[] args) {
        // Calendar 추상 클래스이므로 직접 객체 생성 불가능.
        //Calendar cal = new Calendar(); // 'Calendar' is abstract; cannot be instantiated
        Calendar cal = Calendar.getInstance();  // 클래스를 구현한 클래스의 인스턴스를 반환한다.
        //getInstance 메서드에서 Calendar을 상속받아 완전히 구현한 클래스인 
        // GregoraianCalendar, BuddhistCalendar 등의 인스턴스를 리턴하고 있다.
        
        // 국가와 지역등을 확인해서 태국?인경우는 BuddhistCalendar
        // 그외에는 GregoraianCalendar 인스턴스를 반환한다.

        // ** GregoraianCalendar => Calendar 을 상속받아 전세계공통으로 이용(태국제외 국가)

        // ** 최소한의 변경으로 프로그램이 동작하도록 메서드를 통해 인스턴스를 반환받게 구현됨.
        

    }
}
