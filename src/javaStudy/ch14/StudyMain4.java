package javaStudy.ch14;

import java.util.Comparator;
import java.util.stream.Stream;

public class StudyMain4 {
    public static void main(String[] args){
        // ���� - sorted()
        // Stream<T> sorted()  => Comparator�� �������� ������ ��Ʈ�� ����� �⺻ ���ı��� Comparable�� ������.
        // *** �� ��Ʈ���� ��Ұ� Comparable�� ������ Ŭ������ �ƴϸ� ���ܰ� �߻��Ѵ�.
        // Stream<T> sorted(comparator<? super T> comparator) // => Comparator�� ��Ʈ���� ����
        Stream<String> strStream = Stream.of("dd", "aaa", "CCC", "cc", "b");
        strStream.sorted().forEach(System.out::print);

         strStream.sorted();                             //=> �⺻����
         strStream.sorted(Comparator.naturalOrder());    //=> �⺻����
         strStream.sorted((s1, s2) -> s1.compareTo(s2)); //=> ���ٽĵ� ����
         strStream.sorted(String::compareTo);            // => �� ����� ����

         strStream.sorted(Comparator.reverseOrder());     //=> �⺻ ������ ����
         strStream.sorted(Comparator.<String>naturalOrder().reversed());

         strStream.sorted(String.CASE_INSENSITIVE_ORDER);  //=> ��ҹ��� ���о���.
         strStream.sorted(String.CASE_INSENSITIVE_ORDER.reversed());

        strStream.sorted(Comparator.comparing(String::length)); // => ���̼� ����
        strStream.sorted(Comparator.comparingInt(String::length)); // => no ����ڽ�

        strStream.sorted(Comparator.comparing(String::length).reversed());



    }
}
