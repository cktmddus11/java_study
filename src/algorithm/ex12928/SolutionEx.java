package algorithm.ex12928;

public class SolutionEx {
    public static void main(String args[]){
        int n = 5;
        int answer = 0;

        int sum = 0;
        System.out.println(Math.sqrt(12));
        for(int i = 1;i<=n;i++){ // n/2 까지돌리면 더 효율~~
            sum += n % i == 0 ? n / i : 0;
        }
        answer = sum;

        System.out.println(answer);
    }

}
