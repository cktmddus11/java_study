package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*

	 List 정렬 : Collections.sort()
	 배열 정렬 : Arrays.sort()
	이렇게 서로 다른 정렬방식을 스트림을 통해서 통일화 가능 
*/
/*
- 스트림은 데이터 소스를 변경하지 않는다.
- 스트림은 일회용이다
- 스트림은 작업을 내부 반복으로 처리한다.

*/
public class WhatStream {

	public static void main(String[] args) {
		String[] strArr = {"arr", "ddd", "ccc"};
		List<String> strList = Arrays.asList(strArr);
		
		// 스트림 생성
		Stream<String> strStream1 = strList.stream();
		Stream<String> strStream2 = Arrays.stream(strArr);
		
		// 정렬 후 화면에 출력
		strStream1.sorted().forEach(System.out::println);
		strStream2.sorted().forEach(System.out::println);
		
		
		// =============================
		//List<String> sortedList = strStream2.sorted().collect(Collectors.toList());
		// 정렬된 스트림을 새로운 리스트에 담아서 반환하는 코드이지만
		// strStream2 는 이미 닫힌 스트림이므로 새로 생성해야 한다. 
		//int numOfStr = strStream1.count(); 이미 닫힌 스트림 사용 x
		
		
		/* 
			for(String str : strList){
				System.out.pritnln(str); ->   stream.forEach(System.out::println);
			}
		*/
		
	}

}
