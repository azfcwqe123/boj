import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int N = Integer.parseInt(st.nextToken());
	    int K = Integer.parseInt(st.nextToken());
	    
	    int cnt = 0;
	    
	    for(int i=N; i>=1; i--) {
	        
	        if(N % i == 0) {
	            cnt++;
	            
	            if(cnt == K) {
	                System.out.print(N / i);
	                return;
	            }
	        }
	        
	    }
	    
	    System.out.print(0);
 	    
	}
	    
}
	


