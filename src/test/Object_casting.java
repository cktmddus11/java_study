package test;

/* 대입연산에 의해 객체의 유형이 변환될 수 있다. 형 변환에 참여한 서로 
 * 상속 관계에 있는 두 클래스 간에는 동일한 이름의 변수가 존재하거나
 * 메소드가 오버라이딩 되어 있을 수 있는데. 이와 같은 경우는
 * 생성된 객체 변수를 통해 멤버에 접근하는데 주의할 점이 있다. 
 * 
 * 변수에 대한 접근은 객체의 유형에 의해 결정되며, 메소드 호출은 
 * new 로 할당된 인스턴스에 의해 결정된다. */
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
	
	public void print() { // 오버라이딩 
		System.out.println("Child method : "+age);
		System.out.println("Child method : "+name);
	}
}
public class Object_casting {

	public static void main(String[] args) {
		// 상위 클래스 = 상위클래스 
		Parent2 p1 = new Parent2();
		// Parent 객체에 new Parent() 인스턴스를 
		// 생성하여 대입했기 때문에 당연히 Parent의 변수와 메소드 호출
		p1.print();
		System.out.println("Parent val age : "+p1.age);
		System.out.println("Parent val name : "+p1.name);
		
		System.out.println("============");
		
		// 하위 클래스 = 하위클래스 
		Child2 c = new Child2();
		
		c.print(); // 슈퍼 써서 뭐 한거 아니니까
		// 상속된 멤버 사용한게 아니니까 
		System.out.println("Parent val age : "+c.age);
		System.out.println("Parent val name : "+c.name);
		
		
		System.out.println("====상위 클래스 = 하위 클래스 ========");
		
		// 상위 클래스 = 하위 클래스 
		Parent2 p2 = new Child2();
		// Parent 객체에 Child() 로 하위 클래스의 인스턴스를 생성
		// 하여 대입했다.
		// print() 메서드의 호출은 Child()에 오버라이딩된 
		// 된 함수를 호출하며, 변수의 접근은 상위 클래스인 Parent에
		// 접근하는 것을 볼수 있다. 
		p2.print(); // Parent 객체로 뜨지만 오버라이딩된 메서드로 출력
		System.out.println("Parent val age : "+p2.age);
		System.out.println("Parent val name : "+p2.name);
		/* 정리 : 부모 <- 자식
		 * 변수의 접근은 상위클래스의 멤버로 접근함
		 * 메서드의 접근은 두가지
		 * - 오버라이딩가 된 경우 자식 메서드의 오버라이딩 메서드가 출력
		 * - 오버라이딩 안된 경우 부모 메서드가 출력
		 * 
		 * */
		System.out.println("============");
		
		// 하위 클래스 = (Casting) 상위 클래스
		//Child2 c2 = (Child2) new Parent2();
		
		//c2.print();
		
		// --------- 위아래 차이있네 ㅜㅜ ---------
		/* 하위 <-- 상위 이게 안되는게 맞는거네
		 * 하위 <- 상위 해주려면 이전에
		 * 부모 <- 자식 형변환 한번 해주고
		 * 해야하네*/
		/*
		Parent2 p2 = new Child2();
		Child2 c2 = (Child2)p2;
		c2.print();
		*/
		//=====================
		
		System.out.println("============");
		
		Parent2 p3 = new Child2();
		// 1. 하위 <- 상위 해주려고 
		// 2. 위에  상위 <- 하위 해서 상위 객체에 하위 객체로 넣고  
		Child2 c3 = (Child2) p3;
		// 3. p3 은 상위 객체이지만 하위 객체가 있기 때문에
		// 형변환이 됨 
		// 하위로 결과가 나옴
		System.out.println("Parent val age : "+c3.age);
		System.out.println("Parent val name : "+c3.name);
		
		

	}

}
