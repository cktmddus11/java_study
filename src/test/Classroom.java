package test;

class Test{
	String subject; // �ʵ� ������
	int point; // �ʵ� ���� 
	
	void setPoint(String subject, int point) {
		this.subject = subject;
		this.point = point;
	}
	String getPoint() {
		return subject + ":" + point;
	}
}


class Student{
	int id;
	String name;
	int subnum; // �ʵ� ����� 
	Test [] test; // �ʵ� �׽�Ʈ Ŭ������ ������Ʈ �迭 
	
	
	Student(int id, String name, int subnum){
		this.id = id;
		this.name = name;
		this.subnum = subnum;
		//System.out.println(this.id+this.name+this.subnum);
		/* ���⼭ nullpointExcetption �߻�
		 * -> �迭 ��ü ������ ���� �̤� */
		test = new Test[3]; 
		for(int j = 0;j<subnum;j++) {
			try {
			test[j] = new Test(); // �迭 ��� �ϳ��ϳ��� ���� 
			// new ���� ������Ʈ�� ���� 
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	String getName() { // ������ �������� �޼���
		return this.id + ":"+ this.name;
	}
	int getGrade() {
		int sum = 0;
		for(int i = 0;i<subnum;i++) {
			sum = sum + test[i].point;
		}
		return sum;
	}
	// �޼ҵ��� �����ε�
	int getGrade(int a) {
		int base = 100 * subnum / a;
		int rank = getGrade() / base +1;
		return (rank > a) ? a : rank; 
	}
	void printScore() {
		System.out.println(getName());
		for(int i = 0;i<3;i++) {
			System.out.print(test[0].getPoint()+" ");
		}
		System.out.println();
		System.out.println(getGrade());
		int rank  = 5;
		System.out.println(rank + "�ܰ� �� "+getGrade(rank));
		System.out.println();
	}
	
	
}





public class Classroom {

	public static void main(String[] args) {
		Student kim = new Student(12, "������", 3); // id, name, subnum
		
		kim.test[0].setPoint("����", 95);
		kim.test[1].setPoint("����", 83);
		kim.test[2].setPoint("����", 76);
		
		kim.printScore();
		
		
		Student lee = new Student(7, "�� ��", 3);

		lee.test[0].setPoint("����", 66);
		lee.test[1].setPoint("����", 97);
		lee.test[2].setPoint("����", 72);
		
		lee.printScore();
		
	}

}
