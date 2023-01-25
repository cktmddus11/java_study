package javaStudy.ch13;

public class ThreadEx1 {
    public static void main(String[] args){
        ThreadEx1_1 t1 = new ThreadEx1_1("������-1"); // �����ڳ� �޼��带 ���� ������ �̸����氡��.���ϸ� �������̸� ������

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r, "������-2");

        t1.start(); // ������ ���� - �ϳ��� �����忡 �ѹ��� start�� ����� �� �ִ�. ������� �ϱ� ���ؼ� ��������־���Ѵ�.
        t2.start();

        t1 = new ThreadEx1_1("������-3");
        t1.start();

    }

}

/**
 * ������ ����1 - Thread Ŭ���� ���
 */
class ThreadEx1_1 extends Thread {
    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            //System.out.println(Thread.currentThread().getName());
            System.out.println(getName()); // ��ӹ��� getName�� ȣ���� �� ����.
        }
    }

    public ThreadEx1_1(String name) {
        super(name);
    }
}

/**
 * ������ ����2 - Runnable �������̽� ����.
 * => ���뼺 ����, �ڵ� �ϰ���. ������ ���.(��ӹ���� �ٸ��� ��� ���ϱ� ������)
 */
class ThreadEx1_2 implements Runnable {

    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            System.out.println(Thread.currentThread().getName()); // Runnable �������̽��� run() �޼��常 �ֱ⶧����
                                                                    // ���� ���� ���� ������ ������ ��ȯ�Ŀ� getName()�� ���־���Ѵ�.
        }
    }

}