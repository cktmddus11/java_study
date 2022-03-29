package algorithm.ex12933;

public class SolutionEx3 {
    String res = "";
    public long reverseInt(long n){
        res = "";
        /*Long.toString(n)
                .chars()  // int형을 char형으로 변환 49, 49, 56, 51, 55, 50으로 들어가있음.
                .sorted()
                .forEach(c -> res = Character.valueOf((char) c) + res); // (char) c => 49 => 1*/
        Long.toString(n)
                .chars()  // int형을 char형으로 변환 49, 49, 56, 51, 55, 50으로 들어가있음.
                .sorted()
                .forEach(c -> res = (c - '0') + res); // (char) c => 49 => 1
        return Long.parseLong(res); // 앞쪽으로 문자열 이어서 역순으로 출력되게 하네....
    }

    public static void main(String[] args){
        SolutionEx3 ex = new SolutionEx3();
        System.out.println(ex.reverseInt(118372));

    }
}
