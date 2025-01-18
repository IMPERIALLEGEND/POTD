import java.util.*;

class Pair {
    int x;
    int y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class MinimumCostToMakeOneValidPath {

    public static int minCost(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int[][] mincost = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mincost[i][j] = Integer.MAX_VALUE;
            }
        }
        mincost[0][0] = 0;
        Deque<Pair> dq = new ArrayDeque<>();
        dq.addFirst(new Pair(0, 0));

        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};

        while(!dq.isEmpty()){
            Pair p = dq.removeFirst();
            int currX = p.x;
            int currY = p.y;

            for(int i=0;i<4;i++){
                int nextX = currX + dir[i][0];
                int nextY = currY + dir[i][1];
                int nextCost = mincost[currX][currY] + (i == grid[currX][currY] - 1 ? 0 : 1);
                if(nextX >= 0 && nextX < r && nextY >= 0 && nextY < c && nextCost < mincost[nextX][nextY]){
                    mincost[nextX][nextY] = nextCost;
                    if(i == grid[currX][currY] - 1) dq.addFirst(new Pair(nextX,nextY));
                    else dq.addLast(new Pair(nextX,nextY));
                }
            }

        }
        
        return mincost[r-1][c-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.print(minCost(grid));

        sc.close();
    }

}
