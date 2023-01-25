package algorithm.lotto;

public class SolutionEx1_2 {
    public static void main(String[] args) {
        int[] lottos = {21, 10, 6, 46, 5, 36};
        int[] win_nums = {20, 9, 3, 45, 4, 35};

        int answer[] = {0, 0}; // 최고, 최저

        for(int i = 0;i<lottos.length;i++){
            if(lottos[i] == 0){
                answer[0]++;
                continue;
            }
            for(int j =0;j<win_nums.length;j++){
                if(win_nums[j] == lottos[i]){
                    answer[0]++;
                    answer[1]++;
                }
            }
        }

        System.out.println("=====================");
        for(int i = 0;i<answer.length;i++){
            System.out.print(answer[i]+",");
        }
        System.out.println("=====================");
        // 전체다 맞을 경우, 전체다 틀릴경우 주의 7 - 6 => 1 / 7 - 0 => 7 -1필요

        for(int i = 0;i<answer.length;i++){
            int num =  6 + 1 - answer[i];
            answer[i]  = num > 6 ? num - 1 : num;
            System.out.print(answer[i]+",");
        }



    }
}
