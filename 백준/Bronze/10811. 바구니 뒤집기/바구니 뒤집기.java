import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) throws IOException {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int n = Integer.parseInt(st.nextToken());
	    int m = Integer.parseInt(st.nextToken());
	    
	    int[] arr = new int[n];
	    
	    for(int i=0; i<n; i++) {
	        arr[i] = i+1;
	    }
	    
	    for(int i=0; i<m; i++) {
	        st = new StringTokenizer(br.readLine());
	        
	        int a = Integer.parseInt(st.nextToken()) - 1; // 범위 조심하자
	        int b = Integer.parseInt(st.nextToken()) - 1; // 범위 조심하자
	        
	        swap(arr, a, b);
	    }
	    
	    for(int x : arr) {
	        System.out.print(x + " ");
	    }
	    
	}
	
	static void swap(int[] arr, int a, int b) {

	// int n = (b-a) / 2 + 1;
	// while(n--> 0)와 같은 방식도 가능하지만, a<b 조건으로 놓는게 더 직관적이다.

        while(a < b) {
            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
            
            a++;
            b--;
        }
        
	}
	
}   


