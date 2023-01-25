package designPattern.creational.abstractFactory;

// ConcreteFactory : 구체적인 제품에 대한 객체를 생성하는 연산을 구현
public class SuitFactory {
    static public Suit getSuit(SuitAbstractFactory suitAbstractFactory){
        return suitAbstractFactory.createSuit();
    }
}
