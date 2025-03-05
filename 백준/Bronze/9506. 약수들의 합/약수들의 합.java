import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == -1) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(N).append(" = ");
            
            int sum = 0;
            for (int i = 1; i <= N / 2; i++) {
                if (N % i == 0) {
                    sum += i;
                    sb.append(i).append(" + ");
                }
            }
            
            if (sum == N) {
                sb.setLength(sb.length() - 3);
                System.out.println(sb);
            } else {
                System.out.println(N + " is NOT perfect.");
            }
        }   
    }
}