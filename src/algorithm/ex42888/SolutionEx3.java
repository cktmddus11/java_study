package algorithm.ex42888;

import java.util.*;

public class SolutionEx3 {
    public static void main(String[] args){
        String[] record= {
                "Enter uid1234 Muzi",
                "Change uid1234 Muzi",
                "Leave uid1234",
                "Enter uid1234 Prodo"
        };
        String answer[] = {};
        //int cnt = 0;
        List<String> answerList = new ArrayList<>();
        Map<String, String> userMap = new HashMap<>();
        for(int i = 0;i<record.length;i++){
            String[] splitArr = record[i].split(" ");
            if("Enter".equals(splitArr[0]) || "Change".equals(splitArr[0])){
                userMap.put(splitArr[1], splitArr[2]);
            }
            /*if("Enter".equals(splitArr[0]) || "Leave".equals(splitArr[0])){
                cnt++;
            }*/

        }

        for(int i = 0;i<record.length;i++){
            String[] splitArr = record[i].split(" ");
            String userId =  userMap.get(splitArr[1]);
            if("Enter".equals(splitArr[0])){
                answerList.add(String.format("%s님이 들어왔습니다.",userId));
            }else if("Leave".equals(splitArr[0])){
                answerList.add(String.format("%s님이 나갔습니다.", userId));
            }

        }
        //System.out.println(answerList);
        answer = new String[answerList.size()];
        answer= answerList.toArray(answer);

        
        
        System.out.println(Arrays.toString(answer));
    }
}
/* 
* 
* T[] toArray(T[] a)
  Object[] toArray()
  * - List에 담겨있는 모든 요소를 포함하는 배열을 반환.
  *  1. T[] 배열을 반환하고
  *  2. Object[] 배열을 반환해서 
  * 배열반환후 형변환해서 사용유무에 따른 차이만 있음
* 
* */