import java.util.*;
import java.io.*;
public class Main
{
    // 선택 정렬
    private static void selection_sort(int[] arr){
        int min_idx;
        for (int i = 0; i < arr.length-1; i++){
            min_idx = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[min_idx] > arr[j])
                    min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++)
		    arr[i] = Integer.parseInt(br.readLine());
		
		selection_sort(arr);
		
		for (int i = 0; i < arr.length; i++)
		    System.out.print(arr[i] + " ");
		
		br.close();
	}
}
