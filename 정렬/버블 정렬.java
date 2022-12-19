import java.util.*;
import java.io.*;
public class Main
{
    // 버블 정렬
    private static void bubble_sort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            for (int j = 0; j < arr.length-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++)
		    arr[i] = Integer.parseInt(br.readLine());
		
		bubble_sort(arr);
		
		for (int i = 0; i < arr.length; i++)
		    System.out.print(arr[i] + " ");
		
		br.close();
	}
}
