package algorithm.ex12939;

public class SolutionEx2 {
    public static void main(String[] args){
        String s = "1 2 3 4";
        String answer = "";

        String[] splitStr = s.split(" ");
        int min = 0;
        int max = 0;

        for(int i = 0;i < splitStr.length;i++){
            int num = Integer.parseInt(splitStr[i]);
            if(i == 0){
                min = max = num;
            }
            if(max <= num){
                max = num;
            }
            if(min >= num) {
                min = num;
            }
        }
        answer = String.format("%d %d", min, max);

        System.out.println(answer);
    }
}
