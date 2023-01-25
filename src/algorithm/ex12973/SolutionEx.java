package algorithm.ex12973;

public class SolutionEx {
    public static void main(String[] args){
        String s = "baabaa";
        int answer = -1;

        char temp = '0';
        int cnt = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == temp ){
                if(cnt % 2 == 0){

                }
                continue;
            }
            temp = c;  //

        }

        System.out.println(answer);
    }
}
