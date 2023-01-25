package javaStudy.ch16;
// URL에 연결하여 그 내용을 읽어오는 예제

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
            url = new URL(address); // url이 유효하지 않으면 에러 발생
            input = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));
            // openStream() 을 호출해 URL의 inputStream을 얻은 후 파일로 부터 데이터를 읽음.
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
