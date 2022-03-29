package algorithm.ex12948;

public class SolutionEx3 {
    public static void  main(String[] args){
        String answer = "";
        String phone_number = "027778888";

        // https://blog.hexabrain.net/205
        // 전방탐색 (?=(검사할문자)(지정할문자))
        answer = phone_number.replaceAll(".(?=.{4})", "*");
        // . => 임의의 문자 한개
        // (?=.)=> 뒷쪽에 임의의 문자 한개를 제외하고 선택
        // {숫자} => 숫자 만큼의 자리수
        /// .(?=.{4})

        // => 뒤쪽에서 임의의 문자 4개를 제외한 임의의 문자 한개 선택


        //(?=) 전방 탐색 , 찾고자 하는 표현식 뒤에 전방탐색 표현식을 넣으며
        // (?= 와 ) 사이에 표현식을 넣습니다.
        // 전방탐색 표현식을 통해 문자가 존재하고, 그앞에 찾고자 하는 문자가 존재할 때 일치합니다.
        // 특정문자가 포함된 문자를 찾고 싶지만 결과에 포함하고 싶지 않을 때 사용합니다..

        // (?<=) : 후방탐색 : 그 뒤에 찾고자 하는 문자가 존재할 때 일치합니다..

        System.out.println(answer);
    }
}
