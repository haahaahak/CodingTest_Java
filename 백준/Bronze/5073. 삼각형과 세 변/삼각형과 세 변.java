import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            
            int max = Math.max(a, Math.max(b, c));
            int sum = a + b + c;
            if (max >= sum - max) {
                sb.append("Invalid").append("\n");
                continue;
            }
            
            if (a == b && b == c) {
                sb.append("Equilateral").append("\n");
            } else if (a != b && b != c && a != c) {
                sb.append("Scalene").append("\n");
            } else {
                sb.append("Isosceles").append("\n");
            }
        }
        
        System.out.print(sb);
    }
}