package algorithm.ex12934;

public class SolutionEx {
    public static void main(String[] args){
        //BigInteger bi = new BigInteger("2500000000");
        //long n = bi.longValue();
        long n = 50000000000000L ;
//               50000014142136
        long answer = 0;

        //double x = Math.sqrt(n); // Math.sqrt 제곱근 계산 => double형으로 하면 안되네
        // 정수형일 떄 라서 그런듯
        long x = (long) Math.sqrt(n);
//        System.out.println(x);
//        System.out.println(Math.sqrt(n));
//        System.out.println(Math.sqrt(n) * Math.sqrt(n));
        boolean isSquareRoot = x * x == n;
        // Math.pow(x, 2) 거듭제곱 계산
        //boolean isSquareRoot = (long) Math.pow(x, 2) == n;
        if(isSquareRoot){
            answer = (long) ((x+1) * (x+1));
           // answer = (long) Math.pow(x+1, 2);
        }else{
            answer = -1;
        }

//        System.out.println(Math.sqrt(n));
//        System.out.println(Math.sqrt(3) * Math.sqrt(3));

        System.out.println(answer);
    }
}
