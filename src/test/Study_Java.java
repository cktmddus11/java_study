package test;

class Study{
	String name;
	String teacher;
	
	void printmsg(String name, String teacher) {
		System.out.println("���� : "+name);
		System.out.println("������� : "+teacher);
	}
}
class Sub_Java extends Study{
	
}

public class Study_Java {

	public static void main(String[] args) {
		Sub_Java s = new Sub_Java();
		
		
		s.printmsg("�ڹ�", "���ȴ�");
	}

}
