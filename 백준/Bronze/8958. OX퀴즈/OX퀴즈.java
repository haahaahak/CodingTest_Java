import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            int score = 0;
            int count = 0;
            for (char ch : line.toCharArray()) {
                if (ch == 'O') {
                    count++;
                    score += count;
                } else {
                    count = 0;
                }
            }         
            sb.append(score).append("\n");
        }
        System.out.print(sb.toString());
    }
}