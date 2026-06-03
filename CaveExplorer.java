import java.util.*;

public class CaveExplorer {

    static List<Integer> visitOrder = new ArrayList<>();

    static void dfs(int room, boolean[] visited, List<List<Integer>> graph) {
        visited[room] = true;
        visitOrder.add(room);

        for (int next : graph.get(room)) {
            if (!visited[next]) {
                dfs(next, visited, graph);
            }
        }
    }

    static List<Integer> shortestPath(int start, int end, List<List<Integer>> graph) {

        int n = graph.size();
        boolean[] visited = new boolean[n];
        int[] parent = new int[n];

        Arrays.fill(parent, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int current = q.poll();

            if (current == end)
                break;

            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = current;
                    q.add(neighbor);
                }
            }
        }

        List<Integer> path = new ArrayList<>();

        for (int at = end; at != -1; at = parent[at]) {
            path.add(at);
        }

        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {

        int rooms = 5;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < rooms; i++) {
            graph.add(new ArrayList<>());
        }

        // Undirected graph
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(0).add(2);
        graph.get(2).add(0);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(3).add(4);
        graph.get(4).add(3);

        graph.get(2).add(4);
        graph.get(4).add(2);

        int startRoom = 0;

        boolean[] visited = new boolean[rooms];

        dfs(startRoom, visited, graph);

        System.out.println("Starting Room : " + startRoom);
        System.out.println("Visited Order : " + visitOrder);

        int lastVisitedRoom = visitOrder.get(visitOrder.size() - 1);

        List<Integer> returnPath =
                shortestPath(lastVisitedRoom, startRoom, graph);

        System.out.println("Last Visited Room : " + lastVisitedRoom);
        System.out.println("Shortest Path Back to Start : " + returnPath);
    }
}