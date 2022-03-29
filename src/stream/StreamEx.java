package stream;

import java.util.stream.Stream;

public class StreamEx {
	// Stream<Integer> 와 IntStream
	/* 
	 * 오토박싱 언박싱으로 인한 비효율을 줄이기 위해
	 * 데이터 소스를 기본형으로 다루는 스트림 IntStream, DoubleStream,LongStream 이 제공
	 * */
	/*	
	 * 	스트림을 다루면 병렬 처리가 쉽다. parallel() 메서드 호출해서 병렬로 연산을 수행하도록 지시만 한다.
	 *  기본값으로 sequential()을 호출하는데 병렬 x 라는 뜻, 병렬처리를 취소할때만 사용 
		병렬 스트림 : 스트림을 새로 생성하는것이 아니라 속성만 변경하는것
	*/
	public static void main(String[] args) {
		String[] strArr = {"dd", "aaa", "cc", "CC", "b"};
		Stream<String> strStream = Stream.of(strArr);
		int sum = strStream.parallel() // strStream을 병렬 스트림으로 전환
				.mapToInt(s -> s.length())
				.sum(); // 항상 계산결과ㄱ가 빠른것은 아님
		

	}

}
