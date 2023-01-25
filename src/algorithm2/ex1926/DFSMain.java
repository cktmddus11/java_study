package algorithm2.ex1926;
// https://sas-study.tistory.com/350
public class DFSMain {
    public static void main(String[] args){
        String[][] grid = {
                {"A","B","C","E"},
                // 1  1   1
                {"S","F","C","S"},
                //        1
                {"A","D","E","E"}
                //    1   1
        };
        String word = "BC";
        System.out.println(solve(grid, word));

    }
    static int m, n;
    private static boolean solve(String[][] grid, String word) {
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return false;
        }

        m = grid.length;
        n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(dfs(grid, visited, i, j, 0, word)){
                    return true;
                }
            }
        }




        return false;
    }
    //    0을 기준으로         상    하       좌     우
    static int[][] dirs = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    private static boolean dfs(String[][] grid, boolean[][] visited, int x, int y, int start, String word) {
        if(word.length() == start) return true; // 마지막 글자까지 확인 했으면 true
        if(x < 0 || x >= m || y < 0 || y >= n) return false; // 표를 벗어나면 false
        if(visited[x][y]) return false;    // 이미 방문한 곳이면 false
        if(!grid[x][y].equals(word.substring(start, start+1))) return false;  // 해당 글자가 찾으려는 글자가 아니면

        visited[x][y] = true;
        System.out.print("("+x+","+y+")"+"->");
        for(int[] dir : dirs){
            int x1 = dir[0] + x;
            int y1 = dir[1] + y;

            if(dfs(grid, visited, x1, y1, start+1, word)){
                return true;
            }
        }
        visited[x][y] = false;
        return false;
    }
}
