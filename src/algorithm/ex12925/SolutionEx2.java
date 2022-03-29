package algorithm.ex12925;

public class SolutionEx2 {
    public static void main(String[] args){
        int answer= 0;
        String s = "-1234";

        boolean Sign = true;

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '-'){
                Sign = false;
            }else if(ch !='+'){
                answer = answer * 10 + (ch - '0'); 
                // '0' => 아스키코드로 48 이므로 
                // '1' 은 49 로 49 - 48 해서 1 출력
            }

        }
        answer = (Sign ? 1 : -1) * answer;




        System.out.println(answer);
    }
}
