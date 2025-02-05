import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] procession = new int[N][M];
        // 첫번째 행렬
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                procession[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        // 두번째 행렬 입력 받으면서 덧셈 처리
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                procession[i][j] += Integer.parseInt(st.nextToken());
            }
        }
        
        // StringBuilder를 사용해 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(procession[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
	}
}