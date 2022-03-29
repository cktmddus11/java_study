package algorithm.monthChallenge.SolutionEx1;

public class SolutionEx1 {
    public static void main(String[] args){
        int [] absolutes = {1,2,3};
        boolean[] signs = {false, false, true};

        int answer =0;

        for(int i = 0;i<absolutes.length;i++){
            //answer += signs[i] ? absolutes[i] : absolutes[i] * -1;
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }

        System.out.println(answer);


    }
}
