import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) throws IOException {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    while(st.hasMoreTokens()) {
	        int m = Integer.parseInt(st.nextToken());
	        max = Math.max(max, m);
	        min = Math.min(min, m);
	    }
	    
	    System.out.print(min + " " + max);
	    
	}
}   

