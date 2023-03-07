package javaStudy.stream;

import java.util.stream.Stream;

public class WhatStream2 {
/*
	스트림 연산
	
	- 중간연산 : 연산결과를 스트림으로 반환하기때문에 스트림으로 연속해서 연결 가능
	- 최종연산  : 연산결과가 스트림이 아님, 스트림의 요소를 소모하면서 연산을 수행하므로 단 한번만 연산 가능
	*/
	public static void main(String[] args) {
		String[] strArr = {"dd", "aaa", "cc", "CC", "b"};
		Stream<String> strStream = Stream.of(strArr); // 문자열 배열이 소스인 스트림
		//Stream<String> filteredStream = strStream.filter(); // 걸러내기
		Stream<String> distintedStream = strStream.distinct(); // 중복제거
		Stream<String> sortedStream = strStream.sorted(); // 정렬
		Stream<String> limitedStream = strStream.limit(5); // 스트림 자르기
		long total = strStream.count();
		
		
		
		

	}

}
