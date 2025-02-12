import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.print(calculator(a,b,c));
    }
    
    public static int calculator(int a, int b, int c) {
        if (a == b && b == c) {
            return 10000 + (a * 1000);
        } else if (a == b || a == c) {
            return 1000 + (a * 100);
        } else if (b == c) {
            return 1000 + (b * 100);
        } else {
            return Math.max(a, Math.max(b, c)) * 100;
        }
    }
}