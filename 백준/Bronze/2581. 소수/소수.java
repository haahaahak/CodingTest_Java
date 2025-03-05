import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = -1;
        
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                if (min == -1) {
                    min = i;
                }
            }
        }
        
        if (sum == 0) {
            System.out.print(-1);
        } else {
            System.out.print(sum + "\n" + min);   
        }
	}
    
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}