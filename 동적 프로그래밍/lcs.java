import java.util.*;
import java.io.*;
public class Main
{
    /*
    * Xm = <x1x2...xm>
    * Yn = <y1y2...yn>
    * 만약 xm = yn이면 Xm과 Yn의 LCS 길이는 Xm-1과 Yn-1의 LCS 길이보다 1 큼
    * 만약 xm ≠ yn이면 Xm과 Yn의 LCS 길이는 Xm과 Yn-1의 LCS 길이와 Xm-1과 Yn의 LCS 길이 중 큰 값임
    */
    static String[] x;
    static String[] y;
    
    // lcs
    private static int lcs(int n, int m){
        int[][] dp = new int[n+1][m+1];
        for (int i = 1; i < n+1; i++){
            for (int j = 1; j < m+1; j++){
                if (x[i-1].equals(y[j-1])) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        
        return dp[n][m];
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		x = br.readLine().split("");
		y = br.readLine().split("");
		
		int res = lcs(x.length, y.length);
		System.out.println(res);
		
		br.close();
	}
}
