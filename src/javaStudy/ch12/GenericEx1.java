package javaStudy.ch12;

public class GenericEx1 {
    public static void main(String[] args){
        ClassName<String> a = new ClassName<String>();
        ClassName<Integer> b = new ClassName<Integer>();

        a.set("안녕");
        b.set(10);

        System.out.println("a data : "+a.get());
        System.out.println("a E Type : "+a.get().getClass().getName());

        System.out.println("b data : "+b.get());
        System.out.println("b E Type : "+b.get().getClass().getName());

        // 제네릭이 사용되는 메서드를 정적 메소드로 두고 싶은 경우 제네릭 클래스와 별도로 독립적은 제네릭이 사용되어야한다?
        System.out.println("<E> return Type : "+ClassName.genericMethod1(3).getClass().getName());
        System.out.println("<T> return Type : "+ClassName.genericMethod1("AB").getClass().getName());

        // 제네릭 메소드2 ClassName a
        System.out.println("<T> returnType : " + ClassName.genericMethod1(a).getClass().getName());
        // 제네릭 메소드2 Double
        System.out.println("<T> returnType : " + ClassName.genericMethod1(3.0).getClass().getName());


    }
}
class ClassName<E> {
    private E element; // 제네릭 타입 변수

    void set(E element){ // 제네릭 파라미터 메소드
        this.element = element;
    }

    E get(){ // 제네릭 타입 반환 메소드
        return element;
    }

    /*
     * 클래스와 같은 E 타입이더라도
     * static 메소드는 객체가 생성되기 이전 시점에
     * 메모리에 먼저 올라가기 때문에
     * E 유형을 클래스로부터 얻어올 방법이 없다.
     */
  /*  static E genericMethod(E o) {	// error!
        return o;
    }*/

    static <E> E genericMethod1(E o){
        return o;
    }

    static <T> T genericMethod2(T o){
        return o;
    }


}