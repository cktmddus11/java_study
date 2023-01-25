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
*  �ڹ� ����ȭ ������ ������ ��ȯ�� �ڹ� �ý��� ���� ������
* ��ȯ�� ���ؼ� �����Ѵ�.
*
* */

public class SerialEx1 {
    public static void main(String[] args){
        // ����ȭ => ������ ��ȯ�� ���� ��½�Ʈ���� �����Ͽ� ��ü�� ��Ʈ���� ��Ƽ� ���Ӽ� �����ͷ� ��ȯ �� ����
        // Serializable �������̽��� �����Ͽ� ����ȭ ��� Ŭ������ ������ �� �ְ�
        // ���Ȼ� ����ȭ ��󿡼� ������ �ν��Ͻ��� transient �� �ٿ��� ���ܽ�ų �� �ִ�.
        // ����ȭ�� ����� ������ȭ �ϸ� null �� ��µ�.
        try{
            String fileName = "UserInfo.ser";
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            // ��� ��Ʈ�� ����
            ObjectOutputStream out = new ObjectOutputStream(bos);

            UserInfo u1 = new UserInfo("Cha", "1230", 30);
            UserInfo u2 = new UserInfo("Seung", "3445", 13);

            List<UserInfo> list = new ArrayList<>();
            list.add(u1);
            list.add(u2);

            // ��ü�� ����ȭ �Ѵ�.
            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);
            // ArrayList : Serializable �������̽��� �����ϰ� �����Ƿ�
            // ����� ��� ��ü��� �� ��ü���� �ν��Ͻ� ������ �����ϰ� �ִ� ��ü�����
            // ��� ����ȭ�ȴ�.
            out.close();
            System.out.println("����ȭ ����");
        }catch (IOException ex){
                ex.printStackTrace();
        }



    }
}
