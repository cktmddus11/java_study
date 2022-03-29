package algorithm.ex12931;

public class SolutionEx {
    public static void main(String[] args) {
        int n = 987;
        int answer = 0;

        char [] ch = String.valueOf(n).toCharArray();
        for(int i = 0;i<ch.length;i++){
            answer += ch[i] - '0';  // - 48 로 해도됨.
        }
        /*String str = String.valueOf(n);
        String arr [] = str.split("");
        for(int i = 0;i<arr.length;i++){
            answer += Integer.parseInt(arr[i]);
        }*/

        System.out.println(answer);
    }
}
