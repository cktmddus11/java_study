package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/*
*
* 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의
* 접두어인 경우가 있는지 확인하려 합니다.
전화번호가 다음과 같을 경우,
* 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
*["119", "97674223", "1195524421"]
*
*phone_book의 길이는 1 이상 1,000,000 이하입니다.
각 전화번호의 길이는 1 이상 20 이하입니다.
같은 전화번호가 중복해서 들어있지 않습니다.
*
* */
public class HashQu2 {
    public static void main(String[] args){
        String phone_book[] = {"119", "97674223", "1195524421"};
        boolean answer = false;

       Map<String, Boolean> map = new HashMap<String, Boolean>();
       for(int i = 0;i<phone_book.length;i++){
           map.put(phone_book[i], answer);
       }
        System.out.println("전화번호 map으로 생성 "+map.toString());

//       int index = 0;
//       for(String s : map.keySet()){
//           boolean c = Arrays.stream(phone_book).skip(index).anyMatch(a -> a.contains(s));
//           if(c){
//               map.replace(s, c);
//           }
//           index++;
//       }
//        System.out.println("전화번호 결과 "+map.toString());

        for(String s : map.keySet()){
            for(int i = 0;i<phone_book.length;i++){
                if(!s.equals(phone_book[i])){
                    if(s.contains(phone_book[i])){
                        map.replace(phone_book[i], true);
                    }
                }
            }
        }
//        int i = 0;
//        for(String s : map.keySet()){
//            Stream<String> result = Arrays.stream(phone_book).filter(a -> !a.equals(s));
//            System.out.printf(String.valueOf(result));
////            if(result && s.contains(phone_book[i])){
////                map.replace(phone_book[i], true);
////            }
//
//
//        }

        boolean result= map.values().stream().anyMatch(a -> a.equals(true));

        System.out.println("전화번호 결과 "+!result);


    }
}
