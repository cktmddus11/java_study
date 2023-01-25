package designPattern.creational.abstractFactory;

// AbstractFactory : 개념적 제품에 대한 객체를 생성하는 연산으로 인터페이스를 정의한다.
public class CombatFactory implements SuitAbstractFactory{
    @Override
    public Suit createSuit() {   // CombatFactory
        return new CombatSuit();
    }
}
