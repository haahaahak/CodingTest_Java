import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        
        int a = find(x);
        int b = find(y);
        
        /* 함수로 재사용
        if (x[0] == x[1]) {
            a = x[2];
        } else if (x[0] == x[2]) {
            a = x[1];
        } else {
            a = x[0];
        }
        */
        
        System.out.print(a + " " + b);
    }
    
    public static int find(int[] arr) {
        if (arr[0] == arr[1]) {
            return arr[2];
        } else if (arr[0] == arr[2]) {
            return arr[1];
        } else {
            return arr[0];
        }
    }
}