import java.util.*;
import java.io.*;
public class Main
{
    static int[] weight;
    static int[] value;
    static int[][] dp;
    
    // 0-1 배낭 문제
    private static int knapsack(int n, int k){
        for (int i = 1; i < n+1; i++){
            for (int j = 1; j < k+1; j++){
                /* 해당 위치에 물건을 넣을 수 없는 경우
			     * i-1번째 물건까지 고려했을 때 무게 j에서의 최대 가치를 그대로 가져옴
			     */
                if (weight[i] > j) dp[i][j] = dp[i-1][j];
                /* 해당 위치에 물건을 넣을 수 있는 경우
				 * i-1번째 물건까지 고려했을 때 무게 j에서의 최대 가치와 
				 * i-1번째 물건까지 고려했을 때 무게 j - 현재무게의 최대가치 + 현재가치 중 더 큰 값을 선택
				 */
                else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - weight[i]] + value[i]);
            }
        }
        
        return dp[n][k];
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		weight = new int[n+1];
		value = new int[n+1];
		dp = new int[n+1][k+1];
		
		for (int i = 1; i < n+1; i++){
		    st = new StringTokenizer(br.readLine());
		    weight[i] = Integer.parseInt(st.nextToken());
		    value[i] = Integer.parseInt(st.nextToken());
		}
		
		int res = knapsack(n, k);
		System.out.println(res);
		
		br.close();
	}
}
