package lotto;

public class SolutionEx {
    public static void main(String[] args){
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int result[] = {0, 0};
        // min, max

        int cnt = 0;
        int zeroCnt = 0;
        for(int i = 0;i<lottos.length;i++){
            if(lottos[i] == 0){
                zeroCnt++;
                continue;
            }
            for(int j =0;j<win_nums.length;j++){
                if(win_nums[j] == lottos[i]){
                   cnt++;
                   break; // 한번 같은숫자는 또 나오지 않으니까 break 추가
                }
            }
        }

//        System.out.println(cnt+"/"+zeroCnt);
//        System.out.println((win_nums.length-cnt-zeroCnt+(zeroCnt != 0 ? 1 : 0))+"/"+( win_nums.length-cnt-zeroCnt+(cnt != 0 && zeroCnt > 0 ? 1 : 0)));
//        result[0] = win_nums.length-cnt-zeroCnt+(cnt != 0 || zeroCnt > 0 ? 1 : 0);
//        result[1] = win_nums.length-cnt+(cnt != 0 ? 1 : 0);


//        System.out.println(cnt+"/"+zeroCnt);
//        result[0] = 6 + 1 - cnt - zeroCnt;
//        result[0] = result[0] == 7 ? result[0] - 1 : result[0];
//        result[1] = 6 + 1 - cnt ;
//        result[1] = result[1] == 7 ? result[1] - 1 : result[1];


        System.out.println(cnt+"/"+zeroCnt);
        int min = cnt;
        int max = cnt + zeroCnt;

        System.out.println(max+"."+min);

        result[0] = Math.min(7 - max, 6); // *** (a <= b) ? a : b
        result[1] = Math.min(7 - min, 6);

        System.out.println("=====================");
        for(int i = 0;i<result.length;i++){
            System.out.print(result[i]+",");
        }



    }
}
