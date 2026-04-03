import java.util.*;

class Point {
    int x, y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    int[] dx = new int[] {-1, 0, 1, 0};
    int[] dy = new int[] {0, 1, 0, -1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[][] dis = new int[n][m];
        
        return bfs(0, 0, maps, dis);
    }
    
    public int bfs(int x, int y, int[][] maps, int[][] dis) {
        Queue<Point> queue = new LinkedList<>();
        int n = maps.length;
        int m = maps[0].length;
        
        queue.offer(new Point(x, y));
        dis[x][y] = 1;
        maps[x][y] = 0;
        
        //기저 조건
        
        while(!queue.isEmpty()) {
            Point p = queue.poll();
            
            if(p.x == n - 1 && p.y == m - 1) {
                return dis[p.x][p.y];
            }
            
            for(int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1){
                    maps[nx][ny] = 0;
                    dis[nx][ny] = dis[p.x][p.y] + 1;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
        return -1;
    }
}