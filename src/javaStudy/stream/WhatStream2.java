package javaStudy.stream;

import java.util.stream.Stream;

public class WhatStream2 {
/*
	��Ʈ�� ����
	
	- �߰����� : �������� ��Ʈ������ ��ȯ�ϱ⶧���� ��Ʈ������ �����ؼ� ���� ����
	- ��������  : �������� ��Ʈ���� �ƴ�, ��Ʈ���� ��Ҹ� �Ҹ��ϸ鼭 ������ �����ϹǷ� �� �ѹ��� ���� ����
	*/
	public static void main(String[] args) {
		String[] strArr = {"dd", "aaa", "cc", "CC", "b"};
		Stream<String> strStream = Stream.of(strArr); // ���ڿ� �迭�� �ҽ��� ��Ʈ��
		//Stream<String> filteredStream = strStream.filter(); // �ɷ�����
		Stream<String> distintedStream = strStream.distinct(); // �ߺ�����
		Stream<String> sortedStream = strStream.sorted(); // ����
		Stream<String> limitedStream = strStream.limit(5); // ��Ʈ�� �ڸ���
		long total = strStream.count();
		
		
		
		

	}

}
