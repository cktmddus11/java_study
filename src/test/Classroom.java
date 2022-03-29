package test;

class Test{
	String subject; // 필드 교과명
	int point; // 필드 점수 
	
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
	int subnum; // 필드 과목수 
	Test [] test; // 필드 테스트 클래스의 오브젝트 배열 
	
	
	Student(int id, String name, int subnum){
		this.id = id;
		this.name = name;
		this.subnum = subnum;
		//System.out.println(this.id+this.name+this.subnum);
		/* 여기서 nullpointExcetption 발생
		 * -> 배열 객체 생성을 안함 ㅜㅜ */
		test = new Test[3]; 
		for(int j = 0;j<subnum;j++) {
			try {
			test[j] = new Test(); // 배열 요소 하나하나에 대해 
			// new 에서 오브젝트를 생성 
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	String getName() { // 총점을 가져오는 메서드
		return this.id + ":"+ this.name;
	}
	int getGrade() {
		int sum = 0;
		for(int i = 0;i<subnum;i++) {
			sum = sum + test[i].point;
		}
		return sum;
	}
	// 메소드의 오버로드
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
		System.out.println(rank + "단계 평가 "+getGrade(rank));
		System.out.println();
	}
	
	
}





public class Classroom {

	public static void main(String[] args) {
		Student kim = new Student(12, "김주현", 3); // id, name, subnum
		
		kim.test[0].setPoint("국어", 95);
		kim.test[1].setPoint("영어", 83);
		kim.test[2].setPoint("수학", 76);
		
		kim.printScore();
		
		
		Student lee = new Student(7, "이 진", 3);

		lee.test[0].setPoint("국어", 66);
		lee.test[1].setPoint("영어", 97);
		lee.test[2].setPoint("수학", 72);
		
		lee.printScore();
		
	}

}
