import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int result = 0;
        while (N >= 0) {
            if (N % 5 == 0) {
                result += N / 5;
                System.out.print(result);
                return;
            }
            N -= 3;
            result++;
        }
        
        System.out.print(-1);
    }
}