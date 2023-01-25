package javaStudy.ch11;

import java.util.ArrayList;
import java.util.List;
public class ArrayListEx2 {
    public static void main(String[] args){
        final int LIMIT = 3;
        String source = "abcdefghijk";
        int length = source.length(); // 10

        List<String> list = new ArrayList<>();

        for(int i = 0;i<length;i+=LIMIT){
            if(i + LIMIT < length) { // 0+3 < 10
                list.add(source.substring(i, i+LIMIT));
            }else {
                list.add(source.substring(i));
            }
        }

        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
