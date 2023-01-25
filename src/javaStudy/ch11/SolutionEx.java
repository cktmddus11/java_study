package javaStudy.ch11;

import java.util.*;

public class SolutionEx {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("¾È³ç");

        List<Integer> list2 = Arrays.asList(1, 2, 3,4);

        List linkedList= new LinkedList(list2);
        System.out.println(linkedList);

    }
}
