package designPattern.creational.abstractFactory;

// ConcreteProduct : 구체적으로 팩토리가 생성할 객체를 정의하고,
// AbstractProduct가 정의하는 인터페이스를 구현한다.
public class CombatSuit implements Suit {
    @Override
    public String getName() {
        return "CombatSuit";
    }
}
