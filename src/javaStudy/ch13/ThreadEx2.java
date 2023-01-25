package javaStudy.ch13;


/* start() �� run()
 * run()�� �ܼ� Ŭ������ run()�޼��带 ȣ���ϴ� �Ͱ� ����.
 * start()�� ȣ���ؾ��� ���� �����尡 ���������� ����� ȣ�⽺���� �����ϰ� �ȴ�.
 *
 * ������� �ۼ��� �����ٿ� ���� ������ �Ǹ� ������ �ð����� �۾��� �����ϰ� �ȴ�.
 * �־��� �ð����� �۾��� ����ġ�� ���ϸ� �ڱ� ������ �ɶ����� �����¿� �ְ� �ȴ�.
 *
*  �۾��� ���� run() ������ ����Ǹ� ȣ�⽺���� ��� ���� ������ ���ش�.
* */
public class ThreadEx2 {
    public static void main(String args[]) throws Exception{
        ThreadEx2_1 t1 = new ThreadEx2_1();
        t1.start();


/*
        java.lang.Exception
        at javaStudy.ch13.ThreadEx2_1.throwException(ThreadEx2.java:28)
        at javaStudy.ch13.ThreadEx2_1.run(ThreadEx2.java:23)  -> ȣ�� ������ ù��°�� run()�̴�. main() �� �ƴϴ�.
                                                                  �� �����尡 ���ܷ� ����Ǿ �ٸ� �������� ���࿡�� ������ ��ġ�� �ʴ´�.
                                                                  main ������� �� �̹� ����Ǿ���.

                                                                  ������ �������� �����尡 �����ϹǷ� ���α׷��� ������� �ʾҴ�.????
*/

    }
}

class ThreadEx2_1 extends Thread{
    @Override
    public void run() {
        throwException();
    }

    private void throwException() {
        try{
            throw new Exception();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
