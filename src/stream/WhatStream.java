package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*

	 List ���� : Collections.sort()
	 �迭 ���� : Arrays.sort()
	�̷��� ���� �ٸ� ���Ĺ���� ��Ʈ���� ���ؼ� ����ȭ ���� 
*/
/*
- ��Ʈ���� ������ �ҽ��� �������� �ʴ´�.
- ��Ʈ���� ��ȸ���̴�
- ��Ʈ���� �۾��� ���� �ݺ����� ó���Ѵ�.

*/
public class WhatStream {

	public static void main(String[] args) {
		String[] strArr = {"arr", "ddd", "ccc"};
		List<String> strList = Arrays.asList(strArr);
		
		// ��Ʈ�� ����
		Stream<String> strStream1 = strList.stream();
		Stream<String> strStream2 = Arrays.stream(strArr);
		
		// ���� �� ȭ�鿡 ���
		strStream1.sorted().forEach(System.out::println);
		strStream2.sorted().forEach(System.out::println);
		
		
		// =============================
		//List<String> sortedList = strStream2.sorted().collect(Collectors.toList());
		// ���ĵ� ��Ʈ���� ���ο� ����Ʈ�� ��Ƽ� ��ȯ�ϴ� �ڵ�������
		// strStream2 �� �̹� ���� ��Ʈ���̹Ƿ� ���� �����ؾ� �Ѵ�. 
		//int numOfStr = strStream1.count(); �̹� ���� ��Ʈ�� ��� x
		
		
		/* 
			for(String str : strList){
				System.out.pritnln(str); ->   stream.forEach(System.out::println);
			}
		*/
		
	}

}
