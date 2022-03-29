package hash;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class HashTable {
    class Node {
        String key;
        String value;

        public Node(String key, String value){
            this.key = key;
            this.value = value;
        }
        String value(){
            return value;
        }
        void value(String value){
            this.value = value;
        }
    }


    // Node 형 연결리스트로 선언
    LinkedList<Node>[] data;

    // 자신을 호출하면서 크기를 지정하여 선언
    public HashTable(int size){
        this.data = new LinkedList[size];
    }
    // Key값을 통해 HashCode 생성 - 아스키코드 이용
    int getHashCode(String key){
        int hashCode = 0;
        for(char c : key.toCharArray()){
            hashCode += c;
        }

        return hashCode;
    }
    // HashCode 를 이용해서 Index 지정
    int convertToIndex(int hashCode){
        return hashCode%data.length;
    }

    Node searchKey(LinkedList<Node> list, String key){
        if(list == null) return null;
//        for(Node node : list){
//            if(node.key.equals(key)){
//                return node;
//            }
//        }
        // return null;
        return list.stream()
                .filter(a -> a.key.equals(key))
                .findFirst().orElse(null);
    }

    // key를 통핸 값 저장
    void set(String key, String value){
        int index = convertToIndex(getHashCode(key));
        LinkedList<Node> list = data[index];

        if(list == null){
            list = new LinkedList<Node>();
            data[index] = list;
        }
        Node node = searchKey(list, key);

        if(node == null){
            list.addLast(new Node(key, value));
        }else{
            node.value(value);
        }
        System.out.println("hashcode : "+getHashCode(key)+", index : "+index+",");

    }
    String get(String key){
        int index = convertToIndex(getHashCode(key));
        LinkedList<Node> list = data[index];

        Node node = searchKey(list, key);
        if(node == null){
            return "Not Found";
        }else{
            return node.value;
        }
//        LinkedList<Node> list = data[index];
//        if(list == null)
//            return "Not Found";
//        else {
//            for(Node n : list) {
//                if(n.key.equals(key))
//                    return n.value;
//            }
//            return null;

    }

}

