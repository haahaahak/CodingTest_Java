import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            int remain = N % B;
            if (remain < 10) {
                sb.append((char) ('0' + remain));
            } else {
                sb.append((char) ('A' + (remain - 10)));
            }
            N /= B;
        }

        System.out.print(sb.reverse().toString());
	}
}