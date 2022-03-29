package test;

public class Equals_test {

	public static void main(String[] args) {
		String day = "토";
		String day2 = "토"; // "일"이면 
		
		
		// 기본형 할당 -> 상수풀에 문자열 할당 
		// 따라서 같은 문자열 같은 객체
		
		if(day == day2) {
			System.out.println("같은 객체"); // 출력
		}else {
			System.out.println("다른 객체"); // 일이면 출력
		}
		
		if(day.equals(day2)) {
			System.out.println("같은 내용 "); // 출력
		}else System.out.println("다른 내용"); // 일이면 출력
		
		String day3 = new String("일");
		
		
		
		

	}

}
