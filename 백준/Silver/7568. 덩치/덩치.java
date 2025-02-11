import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine()); // 인원 수
        // 이중배열
        int[][] stats = new int[N][2]; // 인원 수 N과 키, 체중
        
        // 키와 체중을 받는다
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            stats[i][0] = Integer.parseInt(st.nextToken());
            stats[i][1] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < N; i++) {
            int rank = 1; // 1부터 시작
            for (int j = 0; j < N; j++) {
                // 자기 자신은 비교할 필요 없음
                if (i == j) continue;
                // i번째보다 덩치 큰 사람이 있으면 rank 증가
                if (stats[i][0] < stats[j][0] && stats[i][1] < stats[j][1]) {
                    rank++;
                }
            }
            
            sb.append(rank).append(" ");
        }

        System.out.print(sb);
	}
}