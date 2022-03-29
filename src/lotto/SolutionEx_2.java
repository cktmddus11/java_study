package lotto;

import java.util.Arrays;
import java.util.stream.LongStream;

public class SolutionEx_2 {
    public static void main(String[] args){
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int answer[] = {0, 0};

        answer = LongStream.of(
                (lottos.length + 1) - Arrays.stream(lottos)
                        .filter(l-> Arrays.stream(win_nums)
                                .anyMatch(w -> w == l) || l == 0).count(),
                (lottos.length + 1) - Arrays.stream(lottos)
                        .filter(l-> Arrays.stream(win_nums)
                                .anyMatch(w -> w == l)).count()
        )
                        .mapToInt(op -> (int) (op > 6 ? op - 1 : op))
                                .toArray();





        System.out.println("=====================");
        for(int i = 0;i<answer.length;i++){
            System.out.print(answer[i]+",");
        }



    }
}
