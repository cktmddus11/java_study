package algorithm.ex43165;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;
// ex72412
public class SolutionEx {
    public static void main(String[] args){
        int[] numbers = {4, 1, 2, 1};
        int target = 4;
        int answer = 0;

        //boolean [] vistied = new boolean[numbers.length];
        /*Queue<Integer> queue = new ArrayDeque<>();
        for(int number : numbers){
            queue.offer(number);
        }
        */

        for(int j = 0;j<numbers.length;j++){
        //while(!queue.isEmpty()){
            //int[] temp = numbers;  // �̰� ���� ����� �ּҰ��� ����Ǵ� ��Ȳ��. ���� ���縦 �ؾ���
            // �������� �迭�� �����Ǿ� ���� �迭�� �ǵ��� ����.
            int[] temp = numbers.clone();
            temp[j] = temp[j] * -1;
            int sum = 0;
            for(int i = 0;i<temp.length;i++){
                sum += (temp[i]);
                System.out.print(temp[i]+"->");
            }
            System.out.println();

            if(sum == target){
              answer++;
            }

        }

        System.out.println(answer);




       /* Stack<Integer> stack = new Stack<Integer>();

        stack.push(numbers[0]);

        for(int i = 0;i<numbers.length;i++){
           int node = stack.pop();
            if(!vistied[i]){ // ���̳ʽ��� �������� ���ٸ�
                vistied[i] = true;
            }
        }*/







    }


}
