package javaStudy.ch13;

public class ThreadEx3 {
    public static  void main(String[] args) throws Exception{
        ThreadEx3_1 t1 = new ThreadEx3_1();
        t1.run();

/*        java.lang.Exception
        at javaStudy.ch13.ThreadEx3_1.throwException(ThreadEx3.java:18)
        at javaStudy.ch13.ThreadEx3_1.run(ThreadEx3.java:13)
        at javaStudy.ch13.ThreadEx3.main(ThreadEx3.java:6)*/
        // 콜스택에 main 메서드도 존재한다. => 새로운 호출 스택을 생성하지 않았다.
        // => 새로운 쓰레드를 생성하지 않았다. main의 호출 스택일 뿐이다.

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