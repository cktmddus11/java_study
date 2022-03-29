package algorithm.ex12912;

public class SolutionEx2 {
    public static void main(String[] args){
        int a = 3;
        int b = 5;
        long answer = 0;
        
        answer = sumAtoB(Math.min(a, b), Math.max(a, b));
        
        System.out.println(answer);
    }

    private static long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
        // 등비수열 합공식
        //      5 - 3 + 1 = 3
        //      (3 + 5) = 8 / 2 = 4
        // 12
    }
}
