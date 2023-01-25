
package algorithm.hash.solutionEx2;

import java.util.*;

public class SolutionEx2 {
    public static void main(String[] args){
        String[] phone_book = {"123","456","789"} ;

        Arrays.sort(phone_book);
        for(String a : phone_book){
            System.out.println(a);
        }


//        Map<String, Boolean> map = Arrays.asList(phone_book)
//                .stream()
//                .sorted()
//                .collect(Collectors.toMap( str -> str, str -> Boolean.FALSE))
//                ;
        System.out.println(phone_book);  // {97674223=false, 1195524421=false, 119=false}

        boolean result = true;
        for(int i = 0;i<phone_book.length;i++){
           for(int j = i+1;j<phone_book.length;j++){
               if(phone_book[j].contains(phone_book[i])){
                   result = false;
                   break;
               }
           }
         }


        System.out.println(result);


//        String key = null;
//        for(Map.Entry<String, Boolean> entrySet : map.entrySet()){
//            String a = entrySet.getKey();
//
//            Optional<String> result  = Optional.ofNullable(map.entrySet().stream()
//                    .filter(b -> !a.equals(b.getKey()))
//                    .filter(b -> a.contains(b.getKey()))
//                    .map(Map.Entry::getKey).findFirst().orElse(null));
//           if(!result.isEmpty()){
//                key = result.get();
//                break;
//           }
//        }
//        System.out.println(key.isEmpty());







//        boolean answer = false;
//
//        String[] phone_book = {"12","123","1235","567","88"};
//
//
//        Map<String, Boolean> map = new HashMap<>();
//        for (int i = 0; i < phone_book.length; i++) {
//            map.put(phone_book[i], answer);
//        }
//
//        for (String s : map.keySet()) {
//            for (int i = 0; i < phone_book.length; i++) {
//                if (!s.equals(phone_book[i])) {
//                    if (s.contains(phone_book[i])) {
//                        map.replace(phone_book[i], true);
//                    }
//                }
//            }
//        }
//
//        boolean result= map.values().stream()
//                .anyMatch(a -> a.equals(true));
//        System.out.println(!result);
        //return !result;













    }
}