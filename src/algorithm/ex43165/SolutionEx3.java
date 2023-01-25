package algorithm.ex43165;

import java.util.Arrays;

public class SolutionEx3 {
    public static void main(String[] args){
        int [] numbers = {50, 50, 100, 25, 25};
        int target = 100;
        int answer = 0;
        // 1. 탐색한 곳이면 false(이미 탐색을 했으니까)
        // 2. 탐색범위를 벗어나면 false
        // 3. 탐색 후 더 탐색이 필요하다 판단되면 재귀호출시행.
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
        if (sum > target) { // 현재 탐색중인 노드 - 후 sum 했을 때  target보다 크기때문에
            // 다음 노드를 탐색하며 - 할 노드를 더 찾아한다.
            // 현재 탐색 상태에서 다음 노드 이어서 탐색 필요하므로 temp 배열이용.
            visitedTmp[i] = true;
            return dfs(temp, target, visitedTmp, i + 1 == visitedTmp.length ? 0 :  i+1);
        } else if (sum < target) { //  현재 탐색중인 노드 - 후 sum 했을 때 target 보다 작기때문에 잘못탐색 되었기 때문에
            // 현재노드 탐색전으로 돌아가야한다 => number 배열이용.
            return dfs(numbers, target, visitedTmp, i + 1 == visitedTmp.length ? 0 :  i+1);
        } else { //  if(sum == target){ // 현태 탐색중인 노드 - 후 sum 했을 때  target 과 동일. 탐색 완료.
            visitedTmp[i] = true;
            System.out.println(Arrays.toString(temp));
            return true;
        }
    }
} // 재귀호출할 때 sum값을 넘겨주는거로 하자...
