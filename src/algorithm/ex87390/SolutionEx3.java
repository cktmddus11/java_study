package algorithm.ex87390;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SolutionEx3 {
    public static void main(String[] args){
        int answer = 1;
        int []arr = {2,6,8,14};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        //Collections.sort(list);

        //
        int cnt = 0;

        int i = 0;
        while(i != 1 && cnt == 0){ //공통수 1이고 이전에 나눠진게 없으면 중단.
            System.out.println(list);

            int min = list.stream()
                    .mapToInt(x -> x).filter(a -> a!= 1)
                    .min()
                    .orElseGet(null);
            //System.out.println(min);

            for(i = min; i> 1;i--){
                List<Integer> temp= new ArrayList<>();
                temp.addAll(list); // 임시로 얕은 복사 
                for(int j = 0;j<list.size();j++){
                    if(list.get(j) % i == 0){
                        temp.set(j, list.get(j) / i );
                        cnt++;
                    }
                  //  System.out.println("temp : "+temp);
                }
                if(cnt >= 2){
                    list = temp; // 깊은 복사
                    cnt = 0;
                    answer *= i; // 공통 수 곱 -> 최소공배수
                    System.out.println(min);
                    break;
                }else{
                    cnt =0;
                }

            }
        }
        System.out.println(list);
        System.out.println(answer);
        answer *= list.stream().reduce(1, (a, b) -> a * b);


        System.out.println(answer);
    }
}
//https://atoz-develop.tistory.com/entry/JAVA-List-%EA%B0%9D%EC%B2%B4-%EB%B3%B5%EC%82%AC-%EB%B0%A9%EB%B2%95%EA%B3%BC-Collections-copy
// https://blog.advenoh.pe.kr/java/%EC%9E%90%EB%B0%948-%EC%8A%A4%ED%8A%B8%EB%A6%BC-%EC%82%AC%EC%9A%A9%ED%95%B4%EC%84%9C-max%EA%B0%92-%EC%B6%94%EC%B6%9C%ED%95%98%EA%B8%B0/