package javaStudy.ch14;

@FunctionalInterface
interface MyFunction {
    void run(); // public abstract void run();
}
// 람다식을 참조변수로 다룰 수 있다 => 메서드를 통해 람다식을 주고 받을 수 있다.
public class LambdaEx1 {
    static MyFunction getMyFunction(){ // 1. 메서드의 반환타입이 함수형 인터페이스 타입
        MyFunction f = () ->System.out.println("f3.run()");
        return f;
    }
    static void execute(MyFunction f) { // 2. 메서드의 매개변수가 함수형 인터페이스 타입
        f.run();
    }
    public static void main(String[] args){
        // 람다식으로 MyFunction 의 run구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute( () -> System.out.println("run()") );
        execute( f3);

    }


}
