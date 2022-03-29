package algorithm.skill1;
 // 67256
public class SoluctionEx2 {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";
        String answer = "";

        int [][] phone = {
                {1, 4, 7, 10}, // L    // 0
                {2, 5, 8, 0},          // 1
                {3, 6, 9, 12} // R     // 2
        };
        int []left = {0, 3}; // 10번(*번에 왼손 초기화)

        int []right = {2, 3}; //12번(# 번에 오른손 초기화)

        int temp[] = new int[2];

        for(int i = 0;i<numbers.length;i++){
            if("147".contains(String.valueOf(numbers[i]))){
                left = getPosition(0, phone, numbers[i]);
                answer += "L";
            }
            else if("369".contains(String.valueOf(numbers[i]))){
                right = getPosition(2, phone, numbers[i]);
                answer += "R";
            }
            else {
                temp = getPosition(1, phone, numbers[i]);
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

//         LLRLLRLLRL
        // LLRLLRLLRL

        System.out.println(answer);


    }

     private static int[] getPosition(int lineIdx, int[][] phone, int number) {
         int temp[] = new int[2];
         for (int z = 0; z < 4; z++) {
             if (phone[lineIdx][z] == number) {
                 temp[0] = lineIdx;
                 temp[1] = z;
                 break;
             }
         }
         return temp;
     }

     private static int getDistance(int t, int[] pos) {
  //      int a=Math.abs(a);
//        return  (t - pos[0] > 0 ? t - pos[0] : pos[0] - t)+
//                        + (t - pos[1] > 0 ? t - pos[1] :  pos[1] - t);
         return Math.abs(t - pos[0]) + Math.abs(t - pos[1]);
     }
 }

