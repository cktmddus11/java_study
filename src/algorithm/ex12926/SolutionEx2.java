package algorithm.ex12926;

public class SolutionEx2 {
    public static void  main(String[] args){
        String s = "a     b ";
        int n = 1;
        String answer = "";

        char chArr[] = s.toCharArray();
        char temp = 0;
        for(int i = 0;i<chArr.length;i++){
            char now = chArr[i];
            char next = (char) (chArr[i] + n);
            if(next > 'Z' && now <= 'Z'){
                temp = (char) ('A' + n - 1);
            }else if(next > 'z' && now <= 'z'){
                temp = (char) ('a'+n - 1);
            }else if(chArr[i] == ' '){
                temp = ' ';
            }else{
                temp =  next;
            }
            answer += temp;
        }

        System.out.println(answer);
    }
}
