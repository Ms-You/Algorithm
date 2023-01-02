import java.util.*;
public class Main{

	public static void dfs(int start, int[][] graph, boolean[] visited) {
		visited[start] = true;  // 방문 처리
		System.out.print(start + " ");  // 방문 노드 출력
		
		Stack<Integer> st = new Stack<>();
		st.push(start);
		
		while(!st.isEmpty()){
		    int now = st.peek();
		    boolean hasNearNode = false;
		    
		    for (int i : graph[now]) {
        		if (!visited[i]){
        		    visited[i] = true;
        		    System.out.print(i + " ");
        		    hasNearNode = true;
        		    st.push(i);
        		    break;
        		}
        	}
        	
        	if (!hasNearNode)
        	    st.pop();
		}
	}

	public static void main(String[] args) {
		int[][] graph = {{}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7}};
		boolean[] visited = new boolean[graph.length];
		dfs(1, graph, visited);  // 1번 노드에서 시작
	}
}
