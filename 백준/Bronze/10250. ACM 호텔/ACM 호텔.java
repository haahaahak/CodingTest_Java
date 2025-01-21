import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int H = Integer.parseInt(input[0]);
            int W = Integer.parseInt(input[1]);
            int N = Integer.parseInt(input[2]);
            
            int floor = N % H == 0 ? H : N % H;
            int room = (N - 1) / H + 1;
            
            sb.append(floor * 100 + room).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}