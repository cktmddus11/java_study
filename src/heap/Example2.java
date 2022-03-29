package heap;

import java.util.PriorityQueue;

public class Example2 {
    public static void main(String[] args){
        int[] arr = {3, 7, 5, 4, 2, 8};

        System.out.println("정렬전 배열 : ");
        for(int val : arr){
            System.out.print(val+" ");
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0;i<arr.length;i++){
            heap.add(arr[i]);
        }

        System.out.println("\n힙 배열 : ");
        for(int val : heap){
            System.out.print(val+" ");
        }

        // 힙에서 우선순위가 가장 높은 원소(root노드) 를 하나씩 뽑는다.
        for(int i = 0;i<arr.length;i++){
            arr[i] = heap.poll(); // 우선순위대로 pop
        }

        System.out.println("\n정렬후 배열 : ");
        for(int val : arr){
            System.out.print(val+" ");
        }
    }

}
