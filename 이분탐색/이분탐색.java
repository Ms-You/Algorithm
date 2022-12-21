import java.util.*;
import java.io.*;
public class Main
{
    // 이분 탐색 알고리즘
    private static int binarySearch(int[] arr, int num){
        int start = 0, end = arr.length-1;
        int mid;
        
        while(start <= end){
            mid = (start + end)/2;
            if (num == arr[mid]) return mid;
            else if (num < arr[mid]) end = mid-1;
            else if (num > arr[mid]) start = mid+1;
        }
        
        return -1;  // 찾지 못한 경우
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		    arr[i] = Integer.parseInt(br.readLine());
		    
		Arrays.sort(arr);
		
		int findNum = Integer.parseInt(br.readLine());
		int res = binarySearch(arr, findNum);
		
		System.out.println(res);
		
		br.close();
	}
}
