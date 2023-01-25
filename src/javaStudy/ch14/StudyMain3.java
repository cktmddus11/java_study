package javaStudy.ch14;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StudyMain3 {
    public static void main(String[] args) {
        // ��Ʈ�� �߰� ����
        // ��Ʈ�� �ڸ��� - skip(), limit()
        // Stream<T> skip(long n) => n�� ��� �ǳʶ�
        // Stream<T> limit(long maxSize) => n�� ��ҷ� ������

        IntStream intStream = IntStream.rangeClosed(0, 10); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        intStream = intStream.skip(3).limit(5);
        int[] arr = intStream.toArray();
        System.out.println(Arrays.toString(arr)); // [3, 4, 5, 6, 7]


        // ��Ʈ�� ��� �ɷ����� - filter(), distinct()
        // Stream<T> distinct() =>  �ߺ��� ��� ����
        // Stream<T> filter(Predicate<? super T> predicate) => �־��� ����(Predicate)�� ���� �ʴ� ��Ҹ� �ɷ���
        IntStream intStream1 =IntStream.of(1, 2, 3, 4,5, 1,1,2);
        intStream1.distinct().forEach(System.out::print); // 12345
        System.out.println();

        IntStream intStream2 =IntStream.of(1, 2, 3, 4,5, 1,1,2);
        intStream2.distinct().filter(i -> i % 2== 0).forEach(System.out::print); // 24
        System.out.println();

        IntStream intStream3 =IntStream.of(1, 2, 3, 4,5, 1,1,2);
        intStream3.distinct().filter(i -> i % 2== 0).filter(i -> i % 4 == 0).forEach(System.out::print); // 4
        // \filter(i -> i % 2== 0 && i % 4 == 0)
        System.out.println();


    }
}

