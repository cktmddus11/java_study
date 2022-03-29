package algorithm.ex12935;

import java.util.Arrays;

public class SolutionEx2 {
    public int[] main(int [] arr) {
      //  int[] arr = {3, 7, 1, 5};
        if (arr.length <= 1) return new int[]{ -1 };
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();

    }
}
