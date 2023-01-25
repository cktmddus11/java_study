package javaStudy.ch15;

import java.io.Serializable;

public class UserInfo implements Serializable { 
    //  Serializable 을 구현한 클래스 => 직렬화 대상 클래스로 지정
    String name;
    String password;
    int age;

    public UserInfo(){
        this("Unknown", "1111", 0);
    }

    public UserInfo(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
