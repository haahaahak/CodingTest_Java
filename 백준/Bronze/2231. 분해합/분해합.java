import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int cons = 0; // 생성자
        for (int i = 1; i < N; i++) {
            int sum = i;
            int temp = i;
            
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            
            if (sum == N) {
                cons = i;
                break;
            }
        }
        
        System.out.print(cons);
    }
}