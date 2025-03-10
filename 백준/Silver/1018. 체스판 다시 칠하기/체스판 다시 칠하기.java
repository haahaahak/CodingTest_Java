import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        String[] board = new String[N];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine();
        }
        
        int result = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int temp = solution(i, j, board);
                
                result = Math.min(result, temp);
            }
        }
        
        System.out.print(result);
    }
    
    public static int solution(int startRow, int startCol, String[] board) {
        int repaint = 0;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = board[startRow + i].charAt(startCol + j);
                
                if ((i + j) % 2 == 0) {
                    if (current != 'W') {
                        repaint++;
                    }
                } else {
                    if (current != 'B') {
                        repaint++;
                    }
                }
            }
        }
        
        return Math.min(repaint, (64 - repaint));
    }
}