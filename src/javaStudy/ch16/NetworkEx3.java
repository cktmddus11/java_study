package javaStudy.ch16;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkEx3 {
    public static void main(String[] args){
        URL url = null;
        String address = "http://www.codechobo.com/main";

        try {
            url = new URL(address);
            URLConnection conn = url.openConnection();
            // 어플리케이션과 URL의 통신연결을 나타내는 클래스. 최상위 추상 클래스
            // 상속받아 구현한 클래스로는 HttpURLConnection 등

            System.out.println("conn.toString() : "+conn);

            System.out.println("getHeaderFields() : "+conn.getHeaderFields());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
