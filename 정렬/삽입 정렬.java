import java.util.*;
import java.io.*;
public class Main
{
    // 삽입 정렬
    private static void insertion_sort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int target = arr[i];
            int j = i-1;
            while(j >= 0 && target < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = target;
        }
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++)
		    arr[i] = Integer.parseInt(br.readLine());
		
		insertion_sort(arr);
		
		for (int i = 0; i < arr.length; i++)
		    System.out.print(arr[i] + " ");
		
		br.close();
	}
}
