package algorithm.ex72412;

import java.util.Stack;

// Stack �ڷᱸ��
public class DFSMain2 {
    // �湮ó���� ��� �� �迭����
    static boolean[] vistied = new boolean[9];
    // �׸����� �׷����� ������¸� 2���� �迭�� ǥ��
    // �ε����� ������ ����ȣ�� �� �� �ְ� 0���ε����� �ƹ��͵� ���� ����.
    static int[][] graph = {
            {}
            , {2,3,8}
            , {1,6,8}
            , {1,5}
            , {5,7}
            , {3,4,7}
            , {2}
            , {4,5}
            , {1,2}
    };

    // DFS ��� �� ����
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args){
        // ���� ��带 ���ÿ� �־���.
        stack.push(1);
        // ���� ��� �湮ó��
        vistied[1] = true;

        // ������ ������� ������ ��� �ݺ�
        while(!stack.isEmpty()){

            // ���ÿ��� �ϳ��� ����
            int nodeIndex = stack.pop();

            // �湮 ��� ���
            System.out.print(nodeIndex + " -> ");

            // ���� ���� ������ ��� ã��
            for(int linkedNode : graph[nodeIndex]){
                // ������ ��带 �湮���� �ʾ��� ��� ���ÿ� �ְ� �湮ó��
                if(!vistied[linkedNode]){
                    stack.push(linkedNode);
                    vistied[linkedNode] = true;
                }
            }

        }
    }
}
