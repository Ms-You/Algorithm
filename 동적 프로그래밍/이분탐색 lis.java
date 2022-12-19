import java.util.*;
import java.io.*;
public class Main
{
    // 시간 복잡도: O(NlogN)
    static int[] dp;
    private static int lis(int[] arr){
        int idx = 0;
        for (int i = 0; i < arr.length; i++){
            int val = binarySearch(arr[i], 0, idx, idx+1);
            if (val == -1) dp[idx++] = arr[i];
            else dp[val] = arr[i];
        }
        
        return idx;
    }
    
    
    /* 
     * 이분 탐색
     * num이 dp에 저장된 값들보다 같거나 작다면, 
     * 해당 값들 중 가장 작은 값의 위치와 원소를 교환
     */
    private static int binarySearch(int num, int start, int end, int size){
        int res = 0;
        while(start <= end){
            int mid = (start + end)/2;
            if (num <= dp[mid]){
                res = mid;
                end = mid-1;
            } else start = mid+1;
        }
        
        if (start == size) return -1;
        return res;
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
