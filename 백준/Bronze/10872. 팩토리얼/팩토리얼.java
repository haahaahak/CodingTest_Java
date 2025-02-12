import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        if (N == 0 || N == 1) {
            System.out.print(1);
            return;
        }
        
        int result = 1;
        for (int i = 2; i <= N; i++) {
            result *= i;
        }
        System.out.print(result);
    }
}