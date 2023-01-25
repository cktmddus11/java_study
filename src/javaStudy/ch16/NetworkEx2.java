package javaStudy.ch16;

import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx2 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.inflearn.com/course");
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getProtocol());


    }
}
