package javaStudy.ch13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreadEx4 {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(4, 4, 4);
       List<Integer> list2 = list.stream().filter(ThreadEx4::check).collect(Collectors.toList());
       System.out.println(list2);
    }
    static boolean check(int a) {
        if(a != 4){
            throw new ApiResultException("에러발생", "");
        }
        return true;
    }
}
