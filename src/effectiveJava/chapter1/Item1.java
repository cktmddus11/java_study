package effectiveJava.chapter1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class Item1 {
    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>();
        studentList.add(Student.of(80, "���¿�"));
        // of : ���� �Ű������� �޾� ������ Ÿ���� �ν��Ͻ��� ��ȯ�ϴ� �޼���
        studentList.add(Student.of(70, "������"));
        studentList.add(Student.of(90, "�Ƹ�"));

       /* Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.score < s2.score ? -1 : 1;
            }
        });*/
        Collections.sort(studentList, (s1, s2) -> s1.score < s2.score ? -1 : 1);

        System.out.println(studentList);

        EnumSet<State> stateSet = EnumSet.allOf(State.class);
        stateSet.forEach(System.out::println);

        String url = "jdbc.:oracle:thin:@localhost:1521";
        String user = "scott";
        String password = "asdfasdf";
        Connection conn = null;
        Driver driver = null;
        try {
            conn = DriverManager.getConnection(url, user,password);
            //Class.forName("com.oracle.jdbc.Driver");
            //DriverManager.deregisterDriver(new oracle.jdbc.driver.OracleDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }/*catch (ClassNotFoundException e){
            e.printStackTrace();
        }*/
        System.out.println(Boolean.TRUE);

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);

        Grade grade = GradeCalculator.of(80);
        System.out.println(grade.toText());

    }
}
enum State {
    Leave, Enter, Change
}
    class Student implements Comparable {
    int score; // ����
    String name; // �̸�

        // ��ü ������ static �޼���� �ϰ� �ϱ� ���ؼ� private ������.
    private Student(int score, String name) {
        this.score = score;
        this.name = name;
    }

    static Student of(int score, String name){
       return new Student(score, name);
    }

    @Override
    public int compareTo(Object o) {
        Student s2 = (Student) o;
        return s2.score - this.score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
/*class School extends Student {
    public School(int score, String name) {
        super(score, name); ����� ���� Ȯ���� �Ұ���.
    }
}*/
class Singleton {
    private static Singleton singleton = null;

    static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
class GradeCalculator {
    static Grade of(int score){
        if(score >= 90) {
            return new A();
        }else if(score >= 80){
            return new B();
        }else {
            return new F();
        }

    }
}
interface Grade {
    String toText();
}
class A implements Grade{
    @Override
    public String toText() {
        return "A";
    }
}
class B implements Grade{
    @Override
    public String toText() {
        return "B";
    }
}
class F implements Grade{
    @Override
    public String toText() {
        return "F";
    }
}
