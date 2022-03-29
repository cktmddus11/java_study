package algorithm.ex12926;

public class SolutionEx {
    public static void  main(String[] args){
        String s = "z";
        int n = 1;
        String answer = "";

        char chArr[] = s.toCharArray();
        for(int i = 0;i<chArr.length;i++){
            //  chArr[i]+1 =>  A + 1 = 66 / char 로 변환
            //System.out.println((char) chArr[i]+1);
            char next = (char) (chArr[i]+n);
            if(' ' == chArr[i]) {
                answer += ' ';
            }else if(next >= 122){ // 소문자 오버시
                answer += (char) ('a'+n-1);
            }else if(next >= 91 && next  <= 96){ // 대문자 오버시, 소문자 전
                answer += (char) ('A'+n-1);
            }else{
                answer += next;
            }
//            answer += (char) (chArr[i]+n);

        }

        System.out.println(answer);
    }
}
