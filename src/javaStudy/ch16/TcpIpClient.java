package javaStudy.ch16;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClient {
    public static void main(String args[]){

        try {
            String serverIp = "127.0.0.1";
            System.out.println("������ �������Դϴ�. ����IP : "+serverIp);
            // ������ �����Ͽ� ������ ��û
            Socket socket = new Socket(serverIp, 7777);

            // ������ �Է� ��Ʈ���� ��´�.
            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            // �������κ��� ���� �����͸� ����Ѵ�.
            System.out.println("������ ���� ���� �޽��� :"+dis.readUTF());
            System.out.println("������ �����մϴ�.");

            //��Ʈ���� ������ �ݴ´�.
            dis.close();
            socket.close();
            System.out.println("������ ����Ǿ����ϴ�.");
        } catch (ConnectException e) {
            e.printStackTrace();
        }catch(IOException ie){
            ie.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
