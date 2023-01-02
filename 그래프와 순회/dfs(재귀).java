public class Main{
	public static void dfs(int start, int[][] graph, boolean[] visited) {
		visited[start] = true;  // 방문 처리
		System.out.print(start + " ");  // 방문 노드 출력

		for (int i : graph[start]) {
			if (!visited[i])
				dfs(i, graph, visited);
		}
	}

	public static void main(String[] args) {
		int[][] graph = {{}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7}};
		boolean[] visited = new boolean[graph.length];
		dfs(1, graph, visited);  // 1번 노드에서 시작
	}
}