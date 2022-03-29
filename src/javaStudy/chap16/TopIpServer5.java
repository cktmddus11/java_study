package javaStudy.chap16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TopIpServer5 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			// ?????????? ??????? 7777 ?? ????? ????(bind)?????.
			serverSocket = new ServerSocket(7777);
			System.out.println("?????? ??????????.");
			
			socket = serverSocket.accept();
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
class Sender extends Thread{
	Socket socket;
	DataOutputStream out;
	String name;
	
	Sender(Socket socket){
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "["+socket.getInetAddress()+":"+socket.getPort()+"]";
		}catch(Exception e){}
	}
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while(out != null) {
			try {
				out.writeUTF(name+scanner.nextLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
class Receiver extends Thread{
	Socket socket;
	DataInputStream in;

	Receiver(Socket socket){
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
		}catch(IOException e) {}
		
	}
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while(in != null) {
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}














