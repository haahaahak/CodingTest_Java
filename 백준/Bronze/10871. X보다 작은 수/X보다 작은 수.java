import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int x = Integer.parseInt(firstLine[1]);
        
        String[] secondLine = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(secondLine[i]);
            if (value < x) {
                sb.append(value).append(" ");
            }
        }
        
        System.out.println(sb.toString());
    }
}