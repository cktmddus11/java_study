package algorithm.ex67256;

public class SolutionEx1 {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";
        String answer = "";
        int[][] numpadPos = {
                {3,1}, //0
                {0,0}, //1
                {0,1}, //2
                {0,2}, //3
                {1,0}, //4
                {1,1}, //5
                {1,2}, //6
                {2,0}, //7
                {2,1}, //8
                {2,2}  //9
        };

        int []left = {0, 3}; // 10번(*번에 왼손 초기화)

        int []right = {2, 3}; //12번(# 번에 오른손 초기화)

        int temp[] = new int[2];

        for(int i = 0;i<numbers.length;i++){
            if("147".contains(String.valueOf(numbers[i]))) {
                left = numpadPos[numbers[i]];
                answer += "L";
            } else if("369".contains(String.valueOf(numbers[i]))){
                right =  numpadPos[numbers[i]];
                answer += "R";
            }else{
                temp = numpadPos[numbers[i]];
                int l = getDistance(temp[0], left);
                int r = getDistance(temp[1], right);

                if(l < r){
                    answer += "L";
                    left[0] = temp[0];
                    left[1] = temp[1];
                }else if(l > r){
                    answer += "R";
                    right[0] = temp[0];
                    right[1] = temp[1];
                }else{
                    answer += (hand.equals("right") ? "R" : "L");
                    if(hand.equals("right")){
                        right[0] = temp[0];
                        right[1] = temp[1];
                    }else {
                        left[0] = temp[0];
                        left[1] = temp[1];
                    }
                }
            }
        }

        System.out.println(answer);
    }
    private static int getDistance(int t, int[] pos) {
        //      int a=Math.abs(a);
//        return  (t - pos[0] > 0 ? t - pos[0] : pos[0] - t)+
//                        + (t - pos[1] > 0 ? t - pos[1] :  pos[1] - t);
        return Math.abs(t - pos[0]) + Math.abs(t - pos[1]);
    }
}
