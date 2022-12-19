import java.util.*;
import java.io.*;
public class Main
{
    // 시간 복잡도: O(N²)
    static int[] dp;
    private static int lis(int[] arr){
        int max = 1;
        for (int i = 0; i < arr.length; i++){
            dp[i] = 1;
            for (int j = 0; j < i; j++){
                if (arr[j] < arr[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            max = Math.max(max, dp[i]);
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
		
		int res = lis(arr);
		System.out.println(res);
		
		br.close();
	}
}
