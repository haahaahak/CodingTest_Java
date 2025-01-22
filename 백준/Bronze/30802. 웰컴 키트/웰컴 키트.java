import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        String[] size = br.readLine().split(" ");
        String[] tp = br.readLine().split(" ");
        int t = Integer.parseInt(tp[0]);
        int p = Integer.parseInt(tp[1]);
        
        int tcount = 0;
        for (int i = 0; i < size.length; i++) {
            int s = Integer.parseInt(size[i]);
            if (s % t == 0) tcount += s / t;
            else tcount += s / t + 1;
        }
        sb.append(tcount).append("\n");
        sb.append(n / p).append(" ").append(n % p);
        
        System.out.print(sb.toString());
    }
}