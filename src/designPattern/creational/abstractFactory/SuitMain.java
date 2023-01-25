package designPattern.creational.abstractFactory;

public class SuitMain {
    //https://velog.io/@ha0kim/Design-Pattern-%EC%83%9D%EC%84%B1-%ED%8C%A8%ED%84%B4Creational-Patterns
    public static void main(String[] args){
        // �߻� ���丮 ����
        // ����� �Ӽ��� ��ü���� �������̽��� �԰�ȭ�� ���丮���� �ϰ��� ������� �����ϰ�
        // ������ ��ü������ ���� ��ü�� �� �ֵ��� ����� ����

        // �߻� ���丮 ������ ��ȭ�� ����Ŭ������ �������� �ʰ� ���� ���ü�
        // �ְų� �������� ���� ��ü�� ���� �����ϱ� ���� �������̽��� �����Ѵ�.

        // ���� ��ü�� ��Ȯ�� ���� ��ü�� �����ϰ� ������ �� �ְ� ���ش�.
        // ** �ý����� �� ȯ�濡 �´� ������ Concreate Factory �� �����ϰ�
        // �̴� �ٽ� ȯ�濡 �´� Concreate Product �� �����Ѵ�.
        // ������ �̵��� ���� Ŭ������ �ƴ� �������̽��� ���� �̿��ϱ� ������
        // Client�� ����ϰ� �ִ� ȯ��(Ȥ�� Concreate Product)�� �������� ���� ���Ѵ�.

        Suit suit1 = SuitFactory.getSuit(new CombatFactory());
        System.out.println(suit1.getName());
        Suit suit2 = SuitFactory.getSuit(new SpaceFactory());
        System.out.println(suit2.getName());

    }
}
