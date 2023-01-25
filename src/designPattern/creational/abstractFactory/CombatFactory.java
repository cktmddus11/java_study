package designPattern.creational.abstractFactory;

// AbstractFactory : ������ ��ǰ�� ���� ��ü�� �����ϴ� �������� �������̽��� �����Ѵ�.
public class CombatFactory implements SuitAbstractFactory{
    @Override
    public Suit createSuit() {   // CombatFactory
        return new CombatSuit();
    }
}
