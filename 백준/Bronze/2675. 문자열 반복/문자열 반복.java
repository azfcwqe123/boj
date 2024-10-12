import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) throws IOException {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    StringBuilder sb = new StringBuilder();
	    
	    while(n-- > 0) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        
	        int k = Integer.parseInt(st.nextToken());
	        String str = st.nextToken();
	        
	        for(int i=0; i<str.length(); i++) {
	            for(int j=0; j<k; j++) {
	                sb.append(str.charAt(i));
	            }
	        }
	        
	        sb.append("\n");
	        
	    }
	    
	    System.out.print(sb);
	    
	}
	
}   


