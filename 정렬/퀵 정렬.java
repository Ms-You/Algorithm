import java.util.*;
import java.io.*;
public class Main
{
    // 퀵 정렬
    // 정복
    private static void quick_sort(int[] arr, int left, int right){
        if (left >= right) return;
        
        int pivot = partition(arr, left, right);
        quick_sort(arr, left, pivot);
        quick_sort(arr, pivot+1, right);
    }

    // 분할
    private static int partition(int[] arr, int left, int right){
        int pivot = arr[(left + right)/2];
        int l = left-1, r = right+1;
        
        while(true){
            do{
                l++;
            } while(arr[l] < pivot);
            
            do{
                r--;
            } while(l <= r && pivot < arr[r]);
            
            if (l >= r) return r;
            swap(arr, l, r);
        }
    }
    
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++)
		    arr[i] = Integer.parseInt(br.readLine());
		
		quick_sort(arr, 0, arr.length-1);
		
		for (int i = 0; i < arr.length; i++)
		    System.out.print(arr[i] + " ");
		
		br.close();
	}
}
