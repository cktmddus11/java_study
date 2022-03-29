package algorithm.ex12921;

public class SolutionEx {
    public static void main(String[] args){
        int n = 17;
        int answer = 0;

       /* int cnt = 0;
        for(int i = 1;i<= n;i++){
            for(int j = 1;j<= i;j++){
                if(i % j == 0){
                    cnt++;
                }
            }
            if(cnt == 2){
                answer++;
            }
            cnt = 0;
        }*/
        System.out.println(Math.sqrt(17));
        for(int i = 2;i<= n;i++){
            boolean isPrime = true;
            for(int j = 2;j<= Math.sqrt(i);j++){ // Math.sqrt 에라토스테네스의 체
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                answer++;
            }
        }


        System.out.println(answer);
    }
}
