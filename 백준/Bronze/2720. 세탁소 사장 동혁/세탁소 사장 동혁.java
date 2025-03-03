import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int q = 25;
        int d = 10;
        int n = 5;
        // int p = 1;
        
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int changes = Integer.parseInt(br.readLine());
            
            sb.append(changes / q).append(" ");
            changes %= q;
            sb.append(changes / d).append(" ");
            changes %= d;
            sb.append(changes / n).append(" ");
            changes %= n;
            sb.append(changes).append("\n");
        }
        
        System.out.print(sb);
    }
}