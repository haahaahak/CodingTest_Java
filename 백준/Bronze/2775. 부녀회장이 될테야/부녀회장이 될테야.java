import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
        // 1 <= k, n <= 14 즉, 15 * 15 이중배열 아파트
        int[][] apt = new int[15][15];
        
        for (int i = 0; i < 15; i++) {
            // 0층의 i호는 i로 초기화
            apt[0][i] = i;
            // i층의 1호는 모두 1
            apt[i][1] = 1;
        }
        
        // 아파트 거주민 채우기
        for (int i = 1; i < 15; i++) { // 1층 부터 14층
            for (int j = 2; j < 15; j++) { // 2호 부터 14호
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }
        
        int T = Integer.parseInt(br.readLine()); // test case
        
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine()); // k층
            int n = Integer.parseInt(br.readLine()); // n호
            
            // k층 n - 1호 + k - 1층 n호
            sb.append(apt[k][n]).append("\n");
        }

        System.out.print(sb);
	}
}