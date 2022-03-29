package algorithm.ex12912;
// https://www.baeldung.com/java-stream-reduce
//https://programmers.co.kr/learn/courses/30/lessons/12912
import java.util.stream.LongStream;

// stream 순차처리
// parallelStream 병렬처리 => 여러 스레드가 작업을 분할 받아 처리한 결과를 다시 합치는 일
public class SolutionEx {
    public static void main(String[] args){
        int a = 100 ;
        int b= 10000000 ;

      // Long aa = Long.valueOf(a); // 이거도 필요없네 Math.max함수에 Long리턴하는거 있어서;;;
     //  Long bb = Long.valueOf(b);
       long answer = 0;
        // IntStream.range(a, b) 를 하면 b를 제외한 범위까지기 때문에 b+1 을 해야함. rangeClosed 를 하면 b까지
       // answer = LongStream.rangeClosed(Math.min(aa, bb), Math.max(aa, bb)).sum(); // 이게 더 낫네
        answer = LongStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();

        //answer = IntStream.rangeClosed(Math.min(a, b), Math.max(a, b)).reduce(0, (s, e) -> s + e);
       // answer = LongStream.rangeClosed(Math.min(aa, bb), Math.max(aa, bb)).parallel().reduce(0, Long::sum);
        // => 왜 이게 더 오래걸리냐
        System.out.println(answer);
    }
}
