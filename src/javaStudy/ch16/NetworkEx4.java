package javaStudy.ch16;
// URL�� �����Ͽ� �� ������ �о���� ����

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx4 {
    public static void main(String[] args){
        URL url = null;
        BufferedReader input = null;
        String address = "http://www.codechobo.com/main";
       // String address = "http://www.sadf.asdf";
        String line = "";

        try {
            url = new URL(address); // url�� ��ȿ���� ������ ���� �߻�
            input = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
            // openStream() �� ȣ���� URL�� inputStream�� ���� �� ���Ϸ� ���� �����͸� ����.
            // openStream() => openConnection().getInputStream()
            while((line = input.readLine()) != null){
                System.out.println(line);
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
