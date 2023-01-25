package javaStudy.ch12;

public class GenericEx1 {
    public static void main(String[] args){
        ClassName<String> a = new ClassName<String>();
        ClassName<Integer> b = new ClassName<Integer>();

        a.set("�ȳ�");
        b.set(10);

        System.out.println("a data : "+a.get());
        System.out.println("a E Type : "+a.get().getClass().getName());

        System.out.println("b data : "+b.get());
        System.out.println("b E Type : "+b.get().getClass().getName());

        // ���׸��� ���Ǵ� �޼��带 ���� �޼ҵ�� �ΰ� ���� ��� ���׸� Ŭ������ ������ �������� ���׸��� ���Ǿ���Ѵ�?
        System.out.println("<E> return Type : "+ClassName.genericMethod1(3).getClass().getName());
        System.out.println("<T> return Type : "+ClassName.genericMethod1("AB").getClass().getName());

        // ���׸� �޼ҵ�2 ClassName a
        System.out.println("<T> returnType : " + ClassName.genericMethod1(a).getClass().getName());
        // ���׸� �޼ҵ�2 Double
        System.out.println("<T> returnType : " + ClassName.genericMethod1(3.0).getClass().getName());


    }
}
class ClassName<E> {
    private E element; // ���׸� Ÿ�� ����

    void set(E element){ // ���׸� �Ķ���� �޼ҵ�
        this.element = element;
    }

    E get(){ // ���׸� Ÿ�� ��ȯ �޼ҵ�
        return element;
    }

    /*
     * Ŭ������ ���� E Ÿ���̴���
     * static �޼ҵ�� ��ü�� �����Ǳ� ���� ������
     * �޸𸮿� ���� �ö󰡱� ������
     * E ������ Ŭ�����κ��� ���� ����� ����.
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