package javaStudy.ch14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudyMain2 {
    public static void main(String[] args) throws IOException {
        //IntStream evenStream = Stream.iterate(0, n-> n+ 2);
        // generate(), iterate() 의 리턴타입은 기본형 스트림 타입의 참조변수로 다룰 수 없다.
        Stream<Integer> evenStream2 = Stream.iterate(0, n-> n+ 2);

        // mapToInt 로 IntStream으로 변환해서 사용해야함.
        IntStream evenStream = Stream.iterate(0, n-> n+ 2).mapToInt(Integer::intValue);
        // boxed() => IntStream 을 Stream<Integer> 로 변환환
        Stream<Integer> stream = evenStream.boxed();

        // 파일
        //Stream<Path> Files.list(Path dir)
        // 해당 디렉토리에 있는 파일 목록을 소스로 하는 스트림 생성
        Stream<Path> list = Files.list(Paths.get("C:\\eclipse-workspace"));
        list.forEach(System.out::println);

        // Stream<String> Files.lines(Path dir)
        // 파일의 한 행을 요소로하는 스트림 생성
        Stream<String> line = Files.lines(Paths.get("C:\\Users\\Cha\\Desktop\\test.txt"));
        line.forEach(System.out::println);

        FileReader fr = new FileReader("C:\\Users\\Cha\\Desktop\\test.txt");
        BufferedReader br = new BufferedReader(fr);
        Stream<String> line2 = br.lines();
        line2.forEach(System.out::println);

        // 빈스트림
        // 스트림 연산을 수행한 결과가 하나도 없을 때 null보다 빈스트림을 반환하는게 나음.
        Stream emptyStream = Stream.empty();
        long count = emptyStream.count();
        System.out.println(count);

        // 두 스트림 연결
        String[] arr1 = {"123", "234", "456", "789"};
        String[] arr2 = {"ABC", "DEF", "HIJ"};
        Stream<String> str1 = Stream.of(arr1);
        Stream<String> str2 = Stream.of(arr2);
        Stream<String> str3 = Stream.concat(str1, str2);
        str3.forEach(System.out::println);




    }
}
