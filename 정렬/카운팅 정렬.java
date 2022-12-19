import java.util.*;
import java.util.stream.*;
import java.io.*;
public class Main
{
    // 카운팅 정렬 (음수를 포함한 경우)
    private static void counting_sort(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int[] temp = new int[max-min+1];
        
        for (int i = 0; i < arr.length; i++)
            temp[arr[i]-min]++;
        
        int idx = 0;
        for (int i = 0; i < temp.length; i++){
            for (int j = 0; j < temp[i]; j++){
                arr[idx++] = i + min;
            }
        }
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++)
		    arr[i] = Integer.parseInt(br.readLine());
		
		counting_sort(arr);
		
		for (int i = 0; i < arr.length; i++)
		    System.out.print(arr[i] + " ");
		
		br.close();
	}
}
