import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        // 첫째 줄에 (A+B)%C
        sb.append((A + B) % C).append("\n");
        // 둘째 줄에 ((A%C) + (B%C))%C
        sb.append(((A % C) + (B % C)) % C).append("\n");
        // 셋째 줄에 (A×B)%C
        sb.append((A * B) % C).append("\n");
        // 넷째 줄에 ((A%C) × (B%C))%C
        sb.append(((A % C) * (B % C)) % C);

        System.out.print(sb);
	}
}