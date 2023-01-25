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
            // ���ø����̼ǰ� URL�� ��ſ����� ��Ÿ���� Ŭ����. �ֻ��� �߻� Ŭ����
            // ��ӹ޾� ������ Ŭ�����δ� HttpURLConnection ��

            System.out.println("conn.toString() : "+conn);

            System.out.println("getHeaderFields() : "+conn.getHeaderFields());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
