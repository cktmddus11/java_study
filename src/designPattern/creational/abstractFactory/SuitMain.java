package designPattern.creational.abstractFactory;

public class SuitMain {
    //https://velog.io/@ha0kim/Design-Pattern-%EC%83%9D%EC%84%B1-%ED%8C%A8%ED%84%B4Creational-Patterns
    public static void main(String[] args){
        // 추상 팩토리 패턴
        // 비슷한 속성의 객체들을 인터페이스로 규격화된 팩토리에서 일관된 방식으로 생성하고
        // 생성된 객체끼리는 쉽게 교체될 수 있도록 고안한 패턴

        // 추상 팩토리 패턴은 상세화된 서브클래스를 정의하지 않고도 서로 관련성
        // 있거나 독립적인 여러 객체의 군을 생성하기 위한 인터페이스를 제공한다.

        // 실제 객체가 정확히 몰라도 객체를 생성하고 조작할 수 있게 해준다.
        // ** 시스템은 각 환경에 맞는 고유한 Concreate Factory 를 생성하고
        // 이는 다시 환경에 맞는 Concreate Product 를 생성한다.
        // 하지만 이들을 구현 클래스가 아닌 인터페이스를 통해 이용하기 때문에
        // Client는 사용하고 있는 환경(혹은 Concreate Product)이 무엇인지 알지 못한다.

        Suit suit1 = SuitFactory.getSuit(new CombatFactory());
        System.out.println(suit1.getName());
        Suit suit2 = SuitFactory.getSuit(new SpaceFactory());
        System.out.println(suit2.getName());

    }
}
