package algorithm.ex12915;

import java.util.Arrays;

public class SolutionEx3 {
    public static void main(String[] args){
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        String[] answer = {};

        answer = Arrays.stream(strings)
                        .map(s -> new IndexString(s, n))
                            .sorted()
                                .map(i -> i.string).toArray(String[]::new);


        System.out.print(Arrays.toString(answer));
    }
}
class IndexString implements Comparable<IndexString>{
    String string;
    char index;


    public IndexString(String string, int index) {
        this.string = string;
        this.index = string.charAt(index);
    }
// https://st-lab.tistory.com/243
    // comparable => 매개변수 1개 => 객체 자신과 매개변수 값 비교   
    // comparator => 매개변수 2개 => 매개변수로 넘어온 두개 서로 비교
    //  두개다 인터페이스로 comareTo 필수 구현 해야함(equals) 는 object 라는 최상위 객체가 이미 구현중이라서
    @Override
    public int compareTo(IndexString indexString) {
        System.out.println(index+","+indexString.index);
        if(index == indexString.index){
            return string.compareTo(indexString.string);
        }else{
            return index - indexString.index;
        }
    }
}