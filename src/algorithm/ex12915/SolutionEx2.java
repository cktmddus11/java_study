package algorithm.ex12915;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionEx2 {
    public static void main(String[] args){
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        String[] answer = {};

        List<String> arr = new ArrayList<>();
        for(int i = 0;i< strings.length;i++){
            arr.add(""+strings[i].charAt(n)+strings[i]);
        }
        System.out.println(arr); // [usun, ebed, acar]

        Collections.sort(arr);

        answer = new String[arr.size()];
        for(int i = 0;i<arr.size();i++){
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }

        System.out.println(Arrays.toString(answer));

    }
}
