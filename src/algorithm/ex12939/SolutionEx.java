package algorithm.ex12939;

import java.util.Arrays;
import java.util.OptionalInt;

public class SolutionEx {
    public static void main(String[] args) throws Exception {
        String s = "-1 -2 -3 -4";
        String answer = "";

        String []splitStr = s.split(" ");
        System.out.println(Arrays.toString(splitStr));
        //IntStream stream = Arrays.stream(splitStr).mapToInt(Integer::parseInt);
        int arr[] = Arrays.stream(splitStr).mapToInt(Integer::parseInt).toArray();
        //answer += stream.min().toString();
        // answer += " "+stream.max().toString();
        OptionalInt minNum = Arrays.stream(arr).min();
        OptionalInt maxNum = Arrays.stream(arr).max();

        answer = String.format("%d %d", minNum.getAsInt(), maxNum.orElseGet(null));
        // null�������� �����ϴϱ� get()�ᵵ �ɰŰ�����.
        // ���Ķ����� �Ǿ�, �ǵ� �ϴ¹���� ��������

        // StringBuffer �Ἥ append�ϴ� ����� ��





        System.out.println(answer);
    }
}
