package algorithm.ex12969;

import java.util.stream.IntStream;

public class SolutionEx {
    public static void main(String[] args){
        int a = 5; // 가로
        int b = 3; // 세로

       /* for(int i = 0;i<b;i++){
            for(int j = 0;j<a;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
    }
}
