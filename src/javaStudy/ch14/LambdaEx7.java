package javaStudy.ch14;

import java.util.function.Function;

public class LambdaEx7 {
    public static void main(String[] args){
        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16); // "FF"문자열을 숫자로 변환하는 함수 255
        Function<Integer, String> g = (i) -> Integer.toBinaryString(i);  // 숫자 255 를 2진 문자열로 반환하는 함수
        Function<String, String> h = f.andThen(g); // FF문자열 입력하면 "1111111" 문자열 맅넌
        //                             f 하고 g함수 처리 /문자열을 숫자로 바꾸고 숫자를 2진문자



        System.out.println(h.apply("FF"));





        Function<Integer, String> f2=  (i) -> Integer.toBinaryString(i); // 숫자 255 를 2진 문자열로 반환하는 함수
        Function<String, Integer> g2 = (s) ->  Integer.parseInt(s, 16);  // "FF"문자열을 숫자로 변환하는 함수 255
        Function<Integer, Integer> c = f.compose(g);
        System.out.println(c.apply(2));


        System.out.println( Integer.toBinaryString(255));

    }
}
