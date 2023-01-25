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
        // generate(), iterate() �� ����Ÿ���� �⺻�� ��Ʈ�� Ÿ���� ���������� �ٷ� �� ����.
        Stream<Integer> evenStream2 = Stream.iterate(0, n-> n+ 2);

        // mapToInt �� IntStream���� ��ȯ�ؼ� ����ؾ���.
        IntStream evenStream = Stream.iterate(0, n-> n+ 2).mapToInt(Integer::intValue);
        // boxed() => IntStream �� Stream<Integer> �� ��ȯȯ
        Stream<Integer> stream = evenStream.boxed();

        // ����
        //Stream<Path> Files.list(Path dir)
        // �ش� ���丮�� �ִ� ���� ����� �ҽ��� �ϴ� ��Ʈ�� ����
        Stream<Path> list = Files.list(Paths.get("C:\\eclipse-workspace"));
        list.forEach(System.out::println);

        // Stream<String> Files.lines(Path dir)
        // ������ �� ���� ��ҷ��ϴ� ��Ʈ�� ����
        Stream<String> line = Files.lines(Paths.get("C:\\Users\\Cha\\Desktop\\test.txt"));
        line.forEach(System.out::println);

        FileReader fr = new FileReader("C:\\Users\\Cha\\Desktop\\test.txt");
        BufferedReader br = new BufferedReader(fr);
        Stream<String> line2 = br.lines();
        line2.forEach(System.out::println);

        // ��Ʈ��
        // ��Ʈ�� ������ ������ ����� �ϳ��� ���� �� null���� ��Ʈ���� ��ȯ�ϴ°� ����.
        Stream emptyStream = Stream.empty();
        long count = emptyStream.count();
        System.out.println(count);

        // �� ��Ʈ�� ����
        String[] arr1 = {"123", "234", "456", "789"};
        String[] arr2 = {"ABC", "DEF", "HIJ"};
        Stream<String> str1 = Stream.of(arr1);
        Stream<String> str2 = Stream.of(arr2);
        Stream<String> str3 = Stream.concat(str1, str2);
        str3.forEach(System.out::println);




    }
}
