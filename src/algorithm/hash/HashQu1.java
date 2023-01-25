package algorithm.hash;

import java.util.*;

/* ex42576
* 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는
*  모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와
* 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
* 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
*
*
* */
public class HashQu1 {
    public static void main(String[] args){
        String participant[] = {"mislav", "stanko", "mislav", "ana"}; // 마라톤 참여
        String completion[] = {  "stanko", "ana", "mislav"}; // 완주한 선수
        // 완수한 선수 배열은 마라톤 참여자보다 1 작다=> 전체 완주는 없다?
        // 참가자 중 동명이인이 있을 수 있으므로 주의

        HashMap<String, Integer> map = new HashMap<>();
        for(String p : participant){
            if(map.containsKey(p)){
                map.replace(p, map.get(p) + 1);
            }else{
                map.put(p, 1);
            }
        }
        System.out.println(map);
        for(String c : completion){
            map.replace(c, map.get(c)-1);
            // key = stanko, value =
        }
        String answer = "";
        for(String s : map.keySet()){
            if(map.get(s) == 1){
                answer = s;
                break;
            }
        }
        System.out.printf("answer : "+answer);




    }
}
