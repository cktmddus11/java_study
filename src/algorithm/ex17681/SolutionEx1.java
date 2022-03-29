package algorithm.ex17681;

import java.util.Arrays;
/*        % : 명령 시작을 의미
        0 : 채워질 문자
        2 : 총 자리수
        d : 십진수로 된 정수

                %02d : 십진수로 된 2자리의 정수 형식으로 나타냄. 단 자릿수가 부족할 경우 0으로 해당부분을 채움

        출처: https://fruitdev.tistory.com/177 [과일가게 개발자]*/
/*
*    and   - 둘중하나만 0이면 0
*    or    - 둘중하나만 1이면 1
*    xor   - 둘이 같으면 0, 다르면 1
* */

// 주의 6자리 풀로 나와야함. 2 같은거는 변환하면 10만 나오니까 앞에 4자리 0으로 채워줘야함.
public class SolutionEx1 {
    public static void main(String[] args){
//        int n = 5;
//        int[] arr1 = {9, 20, 28, 18, 11};
//        int[] arr2 = {30, 1, 21, 17, 28};


        int n = 6;
        int[] arr1 = {2, 33, 33 ,22, 31, 50};
        int[] arr2 = {2 ,56, 19, 14, 14, 10};

        String [] answer =new String[n];

        String result[] = new String[n];
        for(int i = 0;i<n;i++){
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]); // 둘중하나만 벽이어도 벽이니까 or으로 풀기
            //String format = "%" + n + "s";//"%0"+n+"d";  => ???"%" + n + "s" 이거만 따로 빼면 향상됩니다. 제시된 TC들 기준 10배 정도 향상되네요. 모르겟는데
            result[i] = String.format("%0"+n+"d", Long.parseLong(result[i]));
            //result[i] = String.format(format, result[i]); // XX=> format함수가 두번째 매개변수가 숫자가 아니라  object구나...
            //result[i] = String.format(format, result[i]); // String 도 자리수되는구낭..

          /*  String temp = result[i];
            temp = temp.replaceAll("0", " ").replaceAll("1", "#");
            answer[i] =temp;*/
        }
        System.out.println(Arrays.toString(result));

        for(int i = 0;i<n;i++){
            String temp = result[i];
            temp = temp.replaceAll("0", " ").replaceAll("1", "#");
            answer[i] =temp;
        }
        System.out.println(Arrays.toString(answer));
        System.out.println(answer[0].length());
    }
}
/*
*
* 테스트 1 〉	통과 (7.93ms, 77.9MB)
테스트 2 〉	통과 (9.68ms, 80MB)
테스트 3 〉	통과 (7.32ms, 79.7MB)
테스트 4 〉	통과 (8.20ms, 76.2MB)
테스트 5 〉	통과 (10.42ms, 76.1MB)
테스트 6 〉	통과 (9.04ms, 81.7MB)
테스트 7 〉	통과 (9.45ms, 76.5MB)
테스트 8 〉	통과 (7.46ms, 74.6MB)
*
* */
/* 포문에 한번하든 나눠서 하든 2번, 4번 말고는 ㄱㅊ이네
테스트 1 〉	통과 (7.65ms, 73.9MB)
        테스트 2 〉	통과 (12.40ms, 84.5MB)
        테스트 3 〉	통과 (6.18ms, 67MB)
        테스트 4 〉	통과 (11.01ms, 77.8MB)
        테스트 5 〉	통과 (7.41ms, 77.5MB)
        테스트 6 〉	통과 (7.10ms, 81.1MB)
        테스트 7 〉	통과 (8.07ms, 79.9MB)
        테스트 8 〉	통과 (8.33ms, 80.5MB)*/

