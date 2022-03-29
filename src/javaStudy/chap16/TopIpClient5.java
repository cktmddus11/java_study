package javaStudy.chap16;

import java.io.IOException;
import java.net.Socket;

public class TopIpClient5 {

	public static void main(String[] args) {
		try {
			String serverIp = "127.0.0.1";
			// ?????? ??????? ?????? ??????.
			Socket socket = new Socket(serverIp, 7777);
			System.out.println("?????? ???????????.");
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
