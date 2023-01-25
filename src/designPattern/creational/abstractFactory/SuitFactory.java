package designPattern.creational.abstractFactory;

// ConcreteFactory : ��ü���� ��ǰ�� ���� ��ü�� �����ϴ� ������ ����
public class SuitFactory {
    static public Suit getSuit(SuitAbstractFactory suitAbstractFactory){
        return suitAbstractFactory.createSuit();
    }
}
