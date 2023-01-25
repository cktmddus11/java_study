package javaStudy.ch16;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer2 {
    public static void main(String args[]){

        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime()+"서버가 준비되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }


        while(true){
            try {
                // 서버 소켓
                System.out.println(getTime()+"연결 요청을 기다립니다.");
                Socket socket = serverSocket.accept();
                System.out.println(getTime()+socket.getInetAddress()+"로부터 연결요청이 들어왔습니다.");

                System.out.println("getPort() : "+socket.getPort()); // 49441 => 상대편 소켓(원격소켓)
                System.out.println("getLocalPort() : "+socket.getLocalPort()); // 7777 => 서버소켓 (소켓 자신이 싸용하는 포트)

                // 소켓의 출력스트림을 얻는다.
                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);

                // 원격 소켓(remote socket) 에 데이터를 보낸다.
                dos.writeUTF("[Notice] Test Message1 from Server.");
                System.out.println(getTime()+"데이터를 전송했습니다.");

                // 스트림과 소켓을 닫아준다.
                dos.close();
                socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    // 현재 시간을 문자열로 반환하는 메서드.
    static String getTime(){
        SimpleDateFormat f = new SimpleDateFormat("[yyyy-MM-dd hh:mm:ss] ");
        return f.format(new Date());
    }
}
