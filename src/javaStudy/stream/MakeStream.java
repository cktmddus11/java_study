package javaStudy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MakeStream {
/* 
 * 스트림 생성 
 *  - 스트림의 소스가 될 수 있는 배열, 컬렉션, 임의의 수 등 
 * */
	/* 
	 * 컬렉션 
	 * 	Stream<T> Collections.stream() -> 컬렉션 최고 조상인 Collections 인터페이스에 stream()메서드가 정의되어있음
	 * 	List, Set 을 구현한 컬렉션 클래스들은 이 메서드로 스트림 생성가능
	 * 
	 * stream() 메서드는 해당 컬렉션을 소스로 하는 스트림을 반환한다.
	 * 
	 * */
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3,4, 5); // 가변인자
		
		Stream<Integer> intStream = list.stream();
		//IntStream intstream = list.stream();
		
		
		
	}

}
