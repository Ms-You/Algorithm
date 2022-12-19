import java.util.*;
import java.io.*;
public class Main
{
    // 병합 정렬
    static int[] temp;

    // 분할
    private static void merge_sort(int[] arr, int left, int right){
        if (left < right){
            int mid = (left + right)/2;
            merge_sort(arr, left, mid);
            merge_sort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    
    // 정복
    private static void merge(int[] arr, int left, int mid, int right){
        int l = left, r = mid+1, idx = left;
        
        while(l <= mid && r <= right){
            if (arr[l] < arr[r]) temp[idx++] = arr[l++];
            else temp[idx++] = arr[r++];
        }
        
        if (l > mid){
            while(r <= right)
                temp[idx++] = arr[r++];
        } else{
            while(l <= mid)
                temp[idx++] = arr[l++];
        }
        
        for (int i = left; i <= right; i++)
            arr[i] = temp[i];
    }
    
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		temp = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++)
		    arr[i] = Integer.parseInt(br.readLine());
		
		merge_sort(arr, 0, arr.length-1);
		
		for (int i = 0; i < arr.length; i++)
		    System.out.print(arr[i] + " ");
		
		br.close();
	}
}
