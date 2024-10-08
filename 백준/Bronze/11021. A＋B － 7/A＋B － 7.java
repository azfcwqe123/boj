import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    StringBuilder sb = new StringBuilder();
	    
	    for(int i=0; i<n; i++) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int a = Integer.parseInt(st.nextToken());
	        int b = Integer.parseInt(st.nextToken());
	        
	        String str = String.format("Case #%d: %d",i+1, a+b);
	        sb.append(str).append('\n');
	    }
	    
	    System.out.print(sb);
	    
	}
}   

