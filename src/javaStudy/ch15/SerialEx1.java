package javaStudy.ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
// https://velog.io/@sa1341/Java-%EC%A7%81%EB%A0%AC%ED%99%94%EB%A5%BC-%ED%95%98%EB%8A%94-%EC%9D%B4%EC%9C%A0%EA%B0%80-%EB%AC%B4%EC%97%87%EC%9D%BC%EA%B9%8C
// *** https://techblog.woowahan.com/2550/

/*
*  자바 직렬화 형태의 데이터 교환은 자바 시스템 간의 데이터
* 교환을 위해서 존재한다.
*
* */

public class SerialEx1 {
    public static void main(String[] args){
        // 직렬화 => 데이터 교환을 위해 출력스트림을 생성하여 객체를 스트림에 담아서 연속성 데이터로 변환 후 전송
        // Serializable 인터페이스를 구현하여 직렬화 대상 클래스를 지정할 수 있고
        // 보안상 직렬화 대상에서 제외할 인스턴스는 transient 를 붙여서 제외시킬 수 있다.
        // 직렬화된 대상을 역직렬화 하면 null 로 출력됨.
        try{
            String fileName = "UserInfo.ser";
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            // 출력 스트림 생성
            ObjectOutputStream out = new ObjectOutputStream(bos);

            UserInfo u1 = new UserInfo("Cha", "1230", 30);
            UserInfo u2 = new UserInfo("Seung", "3445", 13);

            List<UserInfo> list = new ArrayList<>();
            list.add(u1);
            list.add(u2);

            // 객체를 직렬화 한다.
            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);
            // ArrayList : Serializable 인터페이스를 구현하고 있으므로
            // 저장된 모든 객체들과 각 객체들의 인스턴스 변수가 참조하고 있는 객체들까지
            // 모두 직렬화된다.
            out.close();
            System.out.println("직렬화 종료");
        }catch (IOException ex){
                ex.printStackTrace();
        }



    }
}
