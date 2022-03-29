package lotto;

public class SolutionEx_4 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {44, 1, 5, 2, 33, 26};

        int answer[] = new int[2];

        int cnt1 = 0;
        int cnt2 = 0;

        for(int i : lottos){
            if(i == 0){
                cnt1++;
                continue;
            }
            for(int j : win_nums){
                if(i == j) cnt2++;
            }
        }

        answer[0] = getGrade(cnt1+cnt2);  // 최고
        answer[1] = getGrade(cnt2);   // 최저



        System.out.println("=====================");
        for(int i = 0;i<answer.length;i++){
            System.out.print(answer[i]+",");
        }

    }
    private static int getGrade(int n){
        switch(n) {
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4 :
                return 3;
            case 3 :
                return 4;
            case 2 :
                return 5;
            default :
                return 6;
        }
    }
}



