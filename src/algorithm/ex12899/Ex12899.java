package algorithm.ex12899;

public class Ex12899 {
    public static void main(String args[]){
        String answer = "";
        int n = 2;

        int pattern[] = {1, 2, 7};

        int a = n / ((n-1)>0?(n-1):1) ; // 1

        int aa = 1;
       // for(int i = 1;i<= a;i++){
            for(int j = 0;j< n-1;j++){  // 3
                System.out.println("!!!"+ pattern[(j%3) % (n-1)]);
                System.out.println(aa);
                aa +=  pattern[(j%3) % (n-1)];
            }
       // }
        System.out.println(aa);

        answer = aa+"";


        System.out.println(answer);
    }
}
