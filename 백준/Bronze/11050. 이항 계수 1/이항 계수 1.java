import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);
        
        System.out.print(cal(N, K));
    }
    
    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
    
    private static int cal(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
}