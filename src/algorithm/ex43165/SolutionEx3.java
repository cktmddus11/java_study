package algorithm.ex43165;

import java.util.Arrays;

public class SolutionEx3 {
    public static void main(String[] args){
        int [] numbers = {50, 50, 100, 25, 25};
        int target = 100;
        int answer = 0;
        // 1. Ž���� ���̸� false(�̹� Ž���� �����ϱ�)
        // 2. Ž�������� ����� false
        // 3. Ž�� �� �� Ž���� �ʿ��ϴ� �ǴܵǸ� ���ȣ�����.
        boolean[] visited = new boolean[numbers.length];
        int sum = Arrays.stream(numbers).sum();
        //return sum == target ? answer++ : 0;
        if(sum != target){
            for(int i =0;i<numbers.length;i++){
                if(dfs(numbers, target, visited, i)){
                    answer++;
                }
            }
        }else{
            answer++;
        }


        System.out.println(answer);
    }

    private static boolean dfs(int[] numbers, int target, boolean[] visited, int i) {

        if( i == visited.length) return false;
        //if (visited[i])  return false;

        int[] temp = numbers.clone();
        boolean[] visitedTmp = visited.clone();
        temp[i] = temp[i] * -1;
        int sum = Arrays.stream(temp).sum();
        if (sum > target) { // ���� Ž������ ��� - �� sum ���� ��  target���� ũ�⶧����
            // ���� ��带 Ž���ϸ� - �� ��带 �� ã���Ѵ�.
            // ���� Ž�� ���¿��� ���� ��� �̾ Ž�� �ʿ��ϹǷ� temp �迭�̿�.
            visitedTmp[i] = true;
            return dfs(temp, target, visitedTmp, i + 1 == visitedTmp.length ? 0 :  i+1);
        } else if (sum < target) { //  ���� Ž������ ��� - �� sum ���� �� target ���� �۱⶧���� �߸�Ž�� �Ǿ��� ������
            // ������ Ž�������� ���ư����Ѵ� => number �迭�̿�.
            return dfs(numbers, target, visitedTmp, i + 1 == visitedTmp.length ? 0 :  i+1);
        } else { //  if(sum == target){ // ���� Ž������ ��� - �� sum ���� ��  target �� ����. Ž�� �Ϸ�.
            visitedTmp[i] = true;
            System.out.println(Arrays.toString(temp));
            return true;
        }
    }
} // ���ȣ���� �� sum���� �Ѱ��ִ°ŷ� ����...
