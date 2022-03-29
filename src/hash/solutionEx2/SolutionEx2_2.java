package hash.solutionEx2;

import java.util.*;
import java.util.stream.Collectors;

public class SolutionEx2_2 {
    public static void main(String[] args){

        String[] phone_book = {"119457","119456", "11945611"} ;
        Arrays.sort(phone_book);

        Set<String> set = Arrays.stream(phone_book)
                .collect(Collectors.toSet());

        System.out.println(set); // [119456, 119457, 11945611]

        boolean answer = true;
        for(String phone : phone_book){
            if(set.stream().anyMatch(a -> !a.equals(phone)
                    && a.contains(phone))){
                answer = false;
                break;
            }
        }
        System.out.println(answer);

//        Iterator iter = set.iterator();
//        while(iter.hasNext()){
//
//        }


    }
}
