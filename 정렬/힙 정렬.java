import java.util.*;
import java.io.*;
public class Main
{
    // 힙 정렬
    private static void heap_sort(int[] arr){
        int len = arr.length;
        
        for (int i = len/2-1; i >= 0; i--)
            heapify(arr, i, len);
        
        for (int i = len-1; i > 0; i--){
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
    }
    
    private static void heapify(int[] arr, int parentIdx, int lastIdx){
        int largestIdx = parentIdx;
        int leftChildIdx = parentIdx*2 + 1;
        int rightChildIdx = parentIdx*2 + 2;
        
        if (leftChildIdx < lastIdx && arr[largestIdx] < arr[leftChildIdx])
            largestIdx = leftChildIdx;
            
        if (rightChildIdx < lastIdx && arr[largestIdx] < arr[rightChildIdx])
            largestIdx = rightChildIdx;
        
        if (largestIdx != parentIdx){
            swap(arr, largestIdx, parentIdx);
            heapify(arr, largestIdx, lastIdx);
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
		
		heap_sort(arr);
		
		for (int i = 0; i < arr.length; i++)
		    System.out.print(arr[i] + " ");
		
		br.close();
	}
}
