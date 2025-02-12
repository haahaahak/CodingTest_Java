import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[][] points = new int[N][2]; // N개의 x, y 좌표
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken()); // x좌표
            points[i][1] = Integer.parseInt(st.nextToken()); // y좌표
        }
        
        // 정렬
        Arrays.sort(points, (p1, p2) -> {
            if (p1[0] == p2[0]) { // x좌표가 같으면
                return p1[1] - p2[1]; // y좌표 오름차순 정렬
            } else {
                return p1[0] - p2[0]; // x좌표 오름차순 정렬
            }
        });
        
        for (int i = 0; i < N; i++) {
            sb.append(points[i][0]).append(" ").append(points[i][1]);
            sb.append("\n");
        }

        System.out.print(sb);
	}
}