package designPattern.creational.abstractFactory;

// ConcreteProduct : ��ü������ ���丮�� ������ ��ü�� �����ϰ�,
// AbstractProduct�� �����ϴ� �������̽��� �����Ѵ�.
public class CombatSuit implements Suit {
    @Override
    public String getName() {
        return "CombatSuit";
    }
}
