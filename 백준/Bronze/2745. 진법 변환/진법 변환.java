import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        
        int tmp = 1;
        int result = 0;
        for (int i = N.length() - 1; i >= 0; i--) {
            char c = N.charAt(i);
            if ('A' <= c && c <= 'Z') {
                result += (c - 'A' + 10) * tmp;
            } else {
                result += (c - '0') * tmp;
            }
            tmp *= B;
        }
        
        System.out.print(result);
    }
}