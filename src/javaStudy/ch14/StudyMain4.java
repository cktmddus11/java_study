package javaStudy.ch14;

import java.util.Comparator;
import java.util.stream.Stream;

public class StudyMain4 {
    public static void main(String[] args){
        // 정렬 - sorted()
        // Stream<T> sorted()  => Comparator을 지정하지 않으면 스트림 요소의 기본 정렬기준 Comparable로 정렬함.
        // *** 단 스트림의 요소가 Comparable을 구현한 클래스가 아니면 예외가 발생한다.
        // Stream<T> sorted(comparator<? super T> comparator) // => Comparator로 스트리을 정렬
        Stream<String> strStream = Stream.of("dd", "aaa", "CCC", "cc", "b");
        strStream.sorted().forEach(System.out::print);

         strStream.sorted();                             //=> 기본정렬
         strStream.sorted(Comparator.naturalOrder());    //=> 기본정렬
         strStream.sorted((s1, s2) -> s1.compareTo(s2)); //=> 람다식도 가능
         strStream.sorted(String::compareTo);            // => 위 문장과 동일

         strStream.sorted(Comparator.reverseOrder());     //=> 기본 정렬의 역순
         strStream.sorted(Comparator.<String>naturalOrder().reversed());

         strStream.sorted(String.CASE_INSENSITIVE_ORDER);  //=> 대소문자 구분안함.
         strStream.sorted(String.CASE_INSENSITIVE_ORDER.reversed());

        strStream.sorted(Comparator.comparing(String::length)); // => 길이순 정렬
        strStream.sorted(Comparator.comparingInt(String::length)); // => no 오토박싱

        strStream.sorted(Comparator.comparing(String::length).reversed());



    }
}
