package algorithm.hash;

import java.util.LinkedList;

public class HashEx {
    public static void main(String[] args){
        //System.out.printf("sdfasd");
        HashTable hashTable = new HashTable(5);

        System.out.println(hashTable.get("key3"));
        hashTable.set("key1", "apple");
        hashTable.set("key2", "banana");
        hashTable.set("key2", "banana2");

        int i = 0;
        for (LinkedList<HashTable.Node> datum : hashTable.data) {
            if(i == hashTable.data.length) return;
            if(datum != null) {
                System.out.println(datum.get(0).key+","+datum.get(0).value);
            }else{
                System.out.println("datum is null");
            }

            i++;
        }


    }
}
// ArrayList - 장) 내부인덱스 이용, 빠른 검색 용이 / 단) 데이터 추가 삭제시 밀리거나 당겨지지 않음
// LinkedList - 장) 추가/삭제시 인근 노드들의 참조값만 수정해 줌으로써 빠른 처리
//              단) 데이터 검색시 순회 탐색으로 데이터 많으면 효율 감소
// Hash -  장) 내부 배열 이용 -> 빠른 검색, 밀거나 당기는 작업 X ->
//              데이터와 연관된 숫자를 만들어낸 뒤 이를 인덱스로 사용

// ** 추가/삭제 시 속도 느려짐. 검색 처음부터 다시 단점 해결

// https://jroomstudio.tistory.com/10

// hashMethod에 의해 반환된 데이터의 고유 숫자값 hashCode
// algorithm.hash method를 이용해서 algorithm.hash table에 저장하고 검색하는 기법 hashing

// 같은 문자열이면 hashcode값 동일

// hashMap => 동일한 키를 가지면 기존에 값을 새로운 값으로 덮어쓰게됨.

