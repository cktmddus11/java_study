package algorithm.ex12919;

// https://programmers.co.kr/learn/courses/30/lessons/12919
public class SolutionEx {
    public static void main(String[] args){
        String [] seoul = new String[]{"Jane", "Kim"};
        String answer = "";


        for(int i = 0;i<seoul.length;i++){ // 향상된 for문 써도됨.
            /*if("Kim".equals(seoul[i])){
                answer = String.format("김서방은 %d에 있다", i);
                break;
            }*/
            if(seoul[i].indexOf("Kim") != -1){
                answer = String.format("김서방은 %d에 있다", i);
                break;
            }
        }
        // 다른 사람이 푼 방식 => 굳이 arrayList 메모리 할당해서 indexOf 쓰는거보다
        // for문에서  기존 배열로 indexOf 를 쓰는게 더 낫다고
      /* int index = Arrays.asList(seoul).indexOf("Kim");
        answer = String.format("김서방은 %d에 있다", index);*/

        System.out.println(answer);
    }
}
