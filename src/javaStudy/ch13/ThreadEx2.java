package javaStudy.ch13;


/* start() 와 run()
 * run()은 단순 클래스의 run()메서드를 호출하는 것과 같다.
 * start()를 호출해야지 실제 쓰레드가 독립적으로 사용할 호출스택을 생성하게 된다.
 *
 * 쓰레드는 작성된 스케줄에 따라 순서가 되면 지정된 시간동안 작업을 수행하게 된다.
 * 주어진 시간동안 작업을 끝마치지 못하면 자기 순서가 될때까지 대기상태에 있게 된다.
 *
*  작업을 끝나 run() 수행이 종료되면 호출스택을 모두 비우고 스택을 없앤다.
* */
public class ThreadEx2 {
    public static void main(String args[]) throws Exception{
        ThreadEx2_1 t1 = new ThreadEx2_1();
        t1.start();


/*
        java.lang.Exception
        at javaStudy.ch13.ThreadEx2_1.throwException(ThreadEx2.java:28)
        at javaStudy.ch13.ThreadEx2_1.run(ThreadEx2.java:23)  -> 호출 스택의 첫번째는 run()이다. main() 가 아니다.
                                                                  한 쓰레드가 예외로 종료되어도 다른 쓰레드의 실행에는 영향을 미치지 않는다.
                                                                  main 쓰레드는 은 이미 종료되었다.

                                                                  하지만 실행중인 쓰레드가 존재하므로 프로그램은 종료되지 않았다.????
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
