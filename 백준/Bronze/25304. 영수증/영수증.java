import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        int total = 0;
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int amount = Integer.parseInt(st.nextToken());
            int quantity = Integer.parseInt(st.nextToken());
            
            total += (amount * quantity);
        }
        
        if (X == total) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

	}
}