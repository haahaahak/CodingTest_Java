import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c;
        
        if (max < sum - max) {
            System.out.print(sum);
        } else {
            System.out.print((sum - max) * 2 - 1);
        }
    }
}