package algorithm.ex12931;

public class SolutionEx2 {
    public static void main(String[] args){
        int n = 987;
        int answer = 0;

        /*while(true){
            answer += n % 10;
            if(n < 10){
                break;
            }

            n = n / 10;
        }*/
        while(n > 0){
            answer += n % 10;
            n = n / 10;
        }


        System.out.println(answer);
    }
}
