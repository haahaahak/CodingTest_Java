import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        // N 크기의 1차원 배열
        int[] balls = new int[N + 1]; // 0번 인덱스는 사용하지 않을 예정.
        for (int i = 1; i <= N; i++) {
            balls[i] = i; // 인덱스 번호로 초기화
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            int temp = balls[j];
            balls[j] = balls[k];
            balls[k] = temp;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(balls[i]).append(" ");
        }
        
        System.out.print(sb.toString().trim());
	}
}