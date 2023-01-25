package algorithm.ex72412;
// https://codingnojam.tistory.com/44
public class DFSMain {
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


    public static void main(String[] args){
        // DFS(Depth - first Search)  ���� �켱 Ž��
        // ����� ��带 ���� ��� �湮�� �� �� ���̻� ����� ������ ���� ��
        // �� �� ���� �ǵ��ư��� �ٽ� ����� ��带 ���� Ž���Ѵ�.

        // BFS : ��� ������ ���  => ó�� ������ ���� Ž���ϴ� [ť] �̿�
        // DFS : �а� ������ ��� => �������� ���� �� Ž���ϴ� [����] �̿�



        // ���� ���
        // 1.  ��� ȣ��
        // 2.  ����
        dfs(1);



    }

    private static void dfs(int nodeIndex) {
        // �湮 ó��
        vistied[nodeIndex] = true;

        // �湮 ��� ���
        System.out.print(nodeIndex + "->");

        // �湮��忡 ������ ��� ã��
        for(int node : graph[nodeIndex]){
            // ������ ��尡 �湮�� ���� ���ٸ� DFS ����
            if(!vistied[node]){
                dfs(node);
            }
        }


    }
}
