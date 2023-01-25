package algorithm.ex72412;
// https://codingnojam.tistory.com/44
public class DFSMain {
    // 방문처리에 사용 할 배열선언
    static boolean[] vistied = new boolean[9];
    // 그림예시 그래프의 연결상태를 2차원 배열로 표현
    // 인덱스가 각각의 노드번호가 될 수 있게 0번인덱스는 아무것도 없는 상태.
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
        // DFS(Depth - first Search)  깊이 우선 탐색
        // 연결된 노드를 따라서 계속 방문을 한 후 더이상 연결된 노드들이 없을 때
        // 그 전 노드로 되돌아가고 다시 연결된 노드를 따라서 탐색한다.

        // BFS : 깊게 뒤지는 방식  => 처음 넣은거 먼저 탐색하는 [큐] 이용
        // DFS : 넓게 뒤지는 방식 => 마지막에 넣은 거 탐색하는 [스택] 이용



        // 구현 방법
        // 1.  재귀 호출
        // 2.  스택
        dfs(1);



    }

    private static void dfs(int nodeIndex) {
        // 방문 처리
        vistied[nodeIndex] = true;

        // 방문 노드 출력
        System.out.print(nodeIndex + "->");

        // 방문노드에 인접한 노드 찾기
        for(int node : graph[nodeIndex]){
            // 인접한 노드가 방문한 적이 없다면 DFS 수행
            if(!vistied[node]){
                dfs(node);
            }
        }


    }
}
