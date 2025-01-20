import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int cnt = Integer.parseInt(input[0]);
            String str = input[1];
            
            for (char ch : str.toCharArray()) {
                sb.append(String.valueOf(ch).repeat(cnt));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}