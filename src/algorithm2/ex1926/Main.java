package algorithm2.ex1926;

import java.util.Scanner;

public class Main {
    static boolean[][] vistied = new boolean[5][6];

    static int arr[][] = {
            {1, 1, 0, 1, 1},
            {0, 1, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 1, 1},
            {0, 0, 1, 1, 1},
            {0, 0, 1, 1, 1},
    };

    public static void main(String[] args) {
        //int height = 6;
        //int width = 5;

        dfs(0, 0);


    }
    private static void dfs(int x, int y) {
        // �湮 ó��
        vistied[x][y] = true;

        // �湮 ��� ���
        System.out.print(String.format("[%d, %d]", x, y) + "->");

        // �湮��忡 ������ ��� ã��
       /* for(int node : arr[x][y]){
            // ������ ��尡 �湮�� ���� ���ٸ� DFS ����
            if(!vistied[node] && node ){
                dfs(node);
            }
        }*/


    }
   /* public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        //logic

        int answer = first + second;

        //output
        System.out.println(answer);*//*
    }*/
}
