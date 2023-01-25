package javaStudy.ch13;

public class ThreadEx3 {
    public static  void main(String[] args) throws Exception{
        ThreadEx3_1 t1 = new ThreadEx3_1();
        t1.run();

/*        java.lang.Exception
        at javaStudy.ch13.ThreadEx3_1.throwException(ThreadEx3.java:18)
        at javaStudy.ch13.ThreadEx3_1.run(ThreadEx3.java:13)
        at javaStudy.ch13.ThreadEx3.main(ThreadEx3.java:6)*/
        // �ݽ��ÿ� main �޼��嵵 �����Ѵ�. => ���ο� ȣ�� ������ �������� �ʾҴ�.
        // => ���ο� �����带 �������� �ʾҴ�. main�� ȣ�� ������ ���̴�.

    }
}
class ThreadEx3_1 extends Thread {
    @Override
    public void run() {
        throwException();
    }

    private void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}