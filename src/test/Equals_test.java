package test;

public class Equals_test {

	public static void main(String[] args) {
		String day = "��";
		String day2 = "��"; // "��"�̸� 
		
		
		// �⺻�� �Ҵ� -> ���Ǯ�� ���ڿ� �Ҵ� 
		// ���� ���� ���ڿ� ���� ��ü
		
		if(day == day2) {
			System.out.println("���� ��ü"); // ���
		}else {
			System.out.println("�ٸ� ��ü"); // ���̸� ���
		}
		
		if(day.equals(day2)) {
			System.out.println("���� ���� "); // ���
		}else System.out.println("�ٸ� ����"); // ���̸� ���
		
		String day3 = new String("��");
		
		
		
		

	}

}
