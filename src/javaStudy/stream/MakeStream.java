package javaStudy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MakeStream {
/* 
 * ��Ʈ�� ���� 
 *  - ��Ʈ���� �ҽ��� �� �� �ִ� �迭, �÷���, ������ �� �� 
 * */
	/* 
	 * �÷��� 
	 * 	Stream<T> Collections.stream() -> �÷��� �ְ� ������ Collections �������̽��� stream()�޼��尡 ���ǵǾ�����
	 * 	List, Set �� ������ �÷��� Ŭ�������� �� �޼���� ��Ʈ�� ��������
	 * 
	 * stream() �޼���� �ش� �÷����� �ҽ��� �ϴ� ��Ʈ���� ��ȯ�Ѵ�.
	 * 
	 * */
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3,4, 5); // ��������
		
		Stream<Integer> intStream = list.stream();
		//IntStream intstream = list.stream();
		
		
		
	}

}
