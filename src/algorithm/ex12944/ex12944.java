package algorithm.ex12944;

import java.util.Arrays;

public class ex12944 {
    public static void main(String[] args){
        int[] arr = {5, 5};
        double answer = 0;

        answer = Arrays.stream(arr)
                .asDoubleStream()
                .average()
                .getAsDouble();
        /*DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(answer));
        answer = Double.parseDouble(df.format(answer));*/




        System.out.println(answer);
    }
}
