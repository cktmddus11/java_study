package javaStudy.ch14;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StudyMain3 {
    public static void main(String[] args) {
        // 스트림 중간 연산
        // 스트림 자르기 - skip(), limit()
        // Stream<T> skip(long n) => n개 요소 건너뜀
        // Stream<T> limit(long maxSize) => n개 요소로 제한한

        IntStream intStream = IntStream.rangeClosed(0, 10); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        intStream = intStream.skip(3).limit(5);
        int[] arr = intStream.toArray();
        System.out.println(Arrays.toString(arr)); // [3, 4, 5, 6, 7]


        // 스트림 요소 걸러내기 - filter(), distinct()
        // Stream<T> distinct() =>  중복된 요소 제거
        // Stream<T> filter(Predicate<? super T> predicate) => 주어진 조건(Predicate)에 맞지 않는 요소를 걸러냄
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

