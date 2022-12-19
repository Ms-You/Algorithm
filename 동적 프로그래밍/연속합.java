import java.util.*;
import java.io.*;
public class Main
{
    // 배열에서 연속하는 값들의 합 중 최대값을 구하는 문제
    static int[] dp;
    private static int continuous_sum(int[] arr){
        dp[0] = arr[0];
        int max = dp[0];
        for (int i = 1; i < arr.length; i++){
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            max = Math.max(dp[i], max);
        }
        
        return max;
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		dp = new int[n];
		
		for (int i = 0; i < arr.length; i++)
		    arr[i] = Integer.parseInt(br.readLine());
		
		int res = continuous_sum(arr);
		System.out.println(res);
		
		br.close();
	}
}
