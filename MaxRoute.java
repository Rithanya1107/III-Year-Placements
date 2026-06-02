
public class MaxRoute {

    public static void main(String[] args) {

        // City names
        //        0               1        2        3
        String[] cities = {"Coimbatore", "Salem", "Erode", "Chennai"};

        // Roads
        int[][] adj = {
            {0, 1, 1, 0},  
            {0, 0, 0, 1},  
            {0, 0, 0, 1},  
            {0, 0, 0, 0}
        };

        boolean[] visited = new boolean[4];
        int[] maxDist = {0};
        int[] bestPath = new int[4];
        int[] currPath = new int[4];

        currPath[0] = 0;
        dfs(0, 3, adj, visited, currPath, bestPath, 0, maxDist);

        System.out.println(" ROUTE : COIMBATORE -> CHENNAI  ");
        System.out.print("Longest Route : ");
        for (int i = 0; i <= maxDist[0]; i++) {
            System.out.print(cities[bestPath[i]]);
            if (i < maxDist[0]) System.out.print(" -> ");
        }
        System.out.println();
        System.out.println("Maximum Roads : " + maxDist[0]);
    }

    static void dfs(int cur, int end, int[][] adj,
                    boolean[] visited, int[] currPath,
                    int[] bestPath, int dist, int[] maxDist) {

        visited[cur] = true;

        if (cur == end) {
            if (dist > maxDist[0]) {
                maxDist[0] = dist;
                for (int i = 0; i <= dist; i++)
                    bestPath[i] = currPath[i];
            }
            visited[cur] = false;
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (adj[cur][i] == 1 && !visited[i]) {
                currPath[dist + 1] = i;
                dfs(i, end, adj, visited, currPath, bestPath, dist + 1, maxDist);
            }
        }

        visited[cur] = false; 
    }
}