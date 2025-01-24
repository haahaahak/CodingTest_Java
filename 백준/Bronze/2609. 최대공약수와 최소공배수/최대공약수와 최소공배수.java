import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        
        int gcdValue = gcd(a, b);
        int lcmValue = (a * b) / gcdValue;
        
        sb.append(gcdValue).append("\n").append(lcmValue);
        System.out.print(sb.toString());
    }
    
    // 재귀함수 - 유클리드 호제법
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}