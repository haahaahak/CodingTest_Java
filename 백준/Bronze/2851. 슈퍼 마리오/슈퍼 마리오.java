import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = 0;
        int prev = 0;
        for (int i = 0; i < 10; i++) {
            prev = sum;
            sum += Integer.parseInt(br.readLine());
            
            if (sum >= 100) {
                // 거리가 같을 경우 무조건 sum이 크기때문에 sum을 출력
                if (Math.abs(100 - sum) <= Math.abs(100 - prev)) {
                    System.out.print(sum);
                } else {
                    System.out.print(prev);
                }
                return;
            }
        }
        
        System.out.print(sum);
    }
}