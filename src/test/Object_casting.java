package test;

/* ���Կ��꿡 ���� ��ü�� ������ ��ȯ�� �� �ִ�. �� ��ȯ�� ������ ���� 
 * ��� ���迡 �ִ� �� Ŭ���� ������ ������ �̸��� ������ �����ϰų�
 * �޼ҵ尡 �������̵� �Ǿ� ���� �� �ִµ�. �̿� ���� ����
 * ������ ��ü ������ ���� ����� �����ϴµ� ������ ���� �ִ�. 
 * 
 * ������ ���� ������ ��ü�� ������ ���� �����Ǹ�, �޼ҵ� ȣ���� 
 * new �� �Ҵ�� �ν��Ͻ��� ���� �����ȴ�. */
class Parent2{
	public int age = 55;
	public String name ="father";
	
	public void print() {
		System.out.println("Parent method : "+age);
		System.out.println("Parent method : "+name);
	}
}
class Child2 extends Parent2{
	public int age = 20;
	public String name = "children";
	
	public void print() { // �������̵� 
		System.out.println("Child method : "+age);
		System.out.println("Child method : "+name);
	}
}
public class Object_casting {

	public static void main(String[] args) {
		// ���� Ŭ���� = ����Ŭ���� 
		Parent2 p1 = new Parent2();
		// Parent ��ü�� new Parent() �ν��Ͻ��� 
		// �����Ͽ� �����߱� ������ �翬�� Parent�� ������ �޼ҵ� ȣ��
		p1.print();
		System.out.println("Parent val age : "+p1.age);
		System.out.println("Parent val name : "+p1.name);
		
		System.out.println("============");
		
		// ���� Ŭ���� = ����Ŭ���� 
		Child2 c = new Child2();
		
		c.print(); // ���� �Ἥ �� �Ѱ� �ƴϴϱ�
		// ��ӵ� ��� ����Ѱ� �ƴϴϱ� 
		System.out.println("Parent val age : "+c.age);
		System.out.println("Parent val name : "+c.name);
		
		
		System.out.println("====���� Ŭ���� = ���� Ŭ���� ========");
		
		// ���� Ŭ���� = ���� Ŭ���� 
		Parent2 p2 = new Child2();
		// Parent ��ü�� Child() �� ���� Ŭ������ �ν��Ͻ��� ����
		// �Ͽ� �����ߴ�.
		// print() �޼����� ȣ���� Child()�� �������̵��� 
		// �� �Լ��� ȣ���ϸ�, ������ ������ ���� Ŭ������ Parent��
		// �����ϴ� ���� ���� �ִ�. 
		p2.print(); // Parent ��ü�� ������ �������̵��� �޼���� ���
		System.out.println("Parent val age : "+p2.age);
		System.out.println("Parent val name : "+p2.name);
		/* ���� : �θ� <- �ڽ�
		 * ������ ������ ����Ŭ������ ����� ������
		 * �޼����� ������ �ΰ���
		 * - �������̵��� �� ��� �ڽ� �޼����� �������̵� �޼��尡 ���
		 * - �������̵� �ȵ� ��� �θ� �޼��尡 ���
		 * 
		 * */
		System.out.println("============");
		
		// ���� Ŭ���� = (Casting) ���� Ŭ����
		//Child2 c2 = (Child2) new Parent2();
		
		//c2.print();
		
		// --------- ���Ʒ� �����ֳ� �̤� ---------
		/* ���� <-- ���� �̰� �ȵǴ°� �´°ų�
		 * ���� <- ���� ���ַ��� ������
		 * �θ� <- �ڽ� ����ȯ �ѹ� ���ְ�
		 * �ؾ��ϳ�*/
		/*
		Parent2 p2 = new Child2();
		Child2 c2 = (Child2)p2;
		c2.print();
		*/
		//=====================
		
		System.out.println("============");
		
		Parent2 p3 = new Child2();
		// 1. ���� <- ���� ���ַ��� 
		// 2. ����  ���� <- ���� �ؼ� ���� ��ü�� ���� ��ü�� �ְ�  
		Child2 c3 = (Child2) p3;
		// 3. p3 �� ���� ��ü������ ���� ��ü�� �ֱ� ������
		// ����ȯ�� �� 
		// ������ ����� ����
		System.out.println("Parent val age : "+c3.age);
		System.out.println("Parent val name : "+c3.name);
		
		

	}

}
