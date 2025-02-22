import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] grid = new int[9][9]; // 9 * 9 격자판
        StringTokenizer st;
        // 격자판 생성
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        // 최댓값 탐색
        int maximum = Integer.MIN_VALUE; // 최댓값
        int col = 0; // 행
        int row = 0; // 열
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] > maximum) {
                    maximum = grid[i][j];
                    col = i;
                    row = j;
                }
            }
        }
        
        System.out.println(maximum);
        System.out.println((col + 1) + " " + (row + 1));
    }
}