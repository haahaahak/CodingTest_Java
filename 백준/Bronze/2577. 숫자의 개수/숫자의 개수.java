import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int multi = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        
        String result = String.valueOf(multi);
        
        int[] count = new int[10];
        
        for (char ch : result.toCharArray()) {
            count[ch - '0']++;
        }
        
        for (int i = 0; i < count.length; i++) {
            sb.append(count[i]).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}