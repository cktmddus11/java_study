package javaStudy.ch13;

public class ThreadEx1 {
    public static void main(String[] args){
        ThreadEx1_1 t1 = new ThreadEx1_1("쓰레드-1"); // 생성자나 메서드를 통해 쓰레드 이름변경가능.안하면 디폴드이름 지정됨

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r, "쓰레드-2");

        t1.start(); // 쓰레드 실행 - 하나의 쓰레드에 한번의 start가 실행될 수 있다. 재실행을 하기 위해선 재생성해주어야한다.
        t2.start();

        t1 = new ThreadEx1_1("쓰레드-3");
        t1.start();

    }

}

/**
 * 쓰레드 구현1 - Thread 클래스 상속
 */
class ThreadEx1_1 extends Thread {
    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            //System.out.println(Thread.currentThread().getName());
            System.out.println(getName()); // 상속받은 getName을 호출할 수 있음.
        }
    }

    public ThreadEx1_1(String name) {
        super(name);
    }
}

/**
 * 쓰레드 구현2 - Runnable 인터페이스 구현.
 * => 재사용성 높고, 코드 일관적. 보편적 사용.(상속방식은 다른걸 상속 못하기 때문에)
 */
class ThreadEx1_2 implements Runnable {

    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            System.out.println(Thread.currentThread().getName()); // Runnable 인터페이스는 run() 메서드만 있기때문에
                                                                    // 현재 실행 중인 쓰레드 참조를 반환후에 getName()을 해주어야한다.
        }
    }

}