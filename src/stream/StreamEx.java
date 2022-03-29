package stream;

import java.util.stream.Stream;

public class StreamEx {
	// Stream<Integer> �� IntStream
	/* 
	 * ����ڽ� ��ڽ����� ���� ��ȿ���� ���̱� ����
	 * ������ �ҽ��� �⺻������ �ٷ�� ��Ʈ�� IntStream, DoubleStream,LongStream �� ����
	 * */
	/*	
	 * 	��Ʈ���� �ٷ�� ���� ó���� ����. parallel() �޼��� ȣ���ؼ� ���ķ� ������ �����ϵ��� ���ø� �Ѵ�.
	 *  �⺻������ sequential()�� ȣ���ϴµ� ���� x ��� ��, ����ó���� ����Ҷ��� ��� 
		���� ��Ʈ�� : ��Ʈ���� ���� �����ϴ°��� �ƴ϶� �Ӽ��� �����ϴ°�
	*/
	public static void main(String[] args) {
		String[] strArr = {"dd", "aaa", "cc", "CC", "b"};
		Stream<String> strStream = Stream.of(strArr);
		int sum = strStream.parallel() // strStream�� ���� ��Ʈ������ ��ȯ
				.mapToInt(s -> s.length())
				.sum(); // �׻� ��������� �������� �ƴ�
		

	}

}
