package javaStudy.ch14;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudyMain {
    public static void main(String[] args){
        ///=============2.1스트림이란?
        String[] strArr = {"aaa", "bbb", "ccc"};
        List<String> strList = Arrays.asList(strArr);
//        System.out.println(Arrays.toString(strArr));
//        System.out.println(strList);
//        System.out.println(strList.get(0));

        Stream<String> strStream1 = Arrays.stream(strArr);
        Stream<String> strStream2 = strList.stream();

        strStream1.sorted().forEach(System.out::println);
        //strStream2.sorted().forEach(System.out::println);
        // 두 스트림 데이터 소스는 다르지만 정렬하고출력하는 방법은 완전히 동일

        // 1. 데이터 소스를 변경하지 않는다.
        List<String> sortedList = strStream2.sorted().collect(Collectors.toList());

        // 2. 스트림은 일회용이다.
        //Long i = strStream1.count(); // java.lang.IllegalStateException: stream has already been operated upon or closed

        // 3. 스트림은 작업을 내부 반복으로 처리한다.
        
        // 4. 스트림의 연산
        // => 중간연산은 연산값이 스트림. 연속해서 중간연산 가능.
        // => 최종연산은 연산결과가 스트림이 아님.스트림 요소 소모하므로 단 한번만 가능

        // filter(), distinct(), sort(), limit()    /   count()

        /// ============2. 스트림 만들기 ========///
        // <컬렉션>
        // 컬렉션 최고조상 Collection에 stream()이 정의 되어있어 자식인 List, Set 도 이 메서드로 스트림을 생성할 수 있다.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream(); // list를 소스로 하는 컬렉션 생성
        IntStream x = list.stream().mapToInt(i -> i);
        intStream.forEach(System.out::println);


        // <배열>
        Stream<String> strStream = Stream.of("a", "b", "c"); //가변인자
        Stream<String> strStream_2 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> strStream_3 = Arrays.stream(new String[]{"a", "b", "c"});
        Stream<String> strStream_4 = Arrays.stream(new String[]{"a", "b", "c"}, 0, 2); // endExclusive : 생성된 배열 그 이상으로는 X
        strStream_4.forEach(System.out::print);

        // <특정 범위의 정수>
        IntStream intStream_1 = IntStream.range(1, 5); // range() => end가 범위에 포함X
        IntStream intStream_2 = IntStream.rangeClosed(1, 5); // rangeClose() => end가 범위에 포함O

        // <임의의 수>
        IntStream intStream_3 = new Random().ints(); // 무한 스트림
        intStream_3.limit(5).forEach(System.out::println); // 5개 요소만 출력하도록
        IntStream intStream_4 = new Random().ints(5); // 5개 요소만 출력하도록
        IntStream intStream_5 = new Random().ints(3,0, 5);
        intStream_5.forEach(System.out::print);

        // <람다식 - iterate(), generate()>
        // interate(T seed, UnaryOperator<T> f)
        // generate(Supplier<T> s)

        Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2);
        Stream<Integer> randomStream = Stream.generate(() ->1);
        //randomStream.forEach(System.out::print);
        IntStream evenStream2 = Stream.iterate(0, n -> n+ 2).mapToInt(Integer::valueOf);//.mapToInt(i ->i);

    }
}
