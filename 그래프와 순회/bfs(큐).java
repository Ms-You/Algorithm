import java.util.*;
public class Main
{
    public static void bfs(int start, int[][] graph, boolean[] visited){
        visited[start] = true;
        System.out.print(start + " ");
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        
        while(!queue.isEmpty()){
            int now = queue.poll();
            for (int i : graph[now]){
                if (!visited[i]){
                    visited[i] = true;
                    System.out.print(i + " ");
                    queue.add(i);
                }
            }
        }
    }
    
	public static void main(String[] args) {
		int[][] graph = {{}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7}};
		boolean[] visited = new boolean[graph.length];
		bfs(1, graph, visited); // 1번 노드에서 시작
	}
}
