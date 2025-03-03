import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int changes = Integer.parseInt(br.readLine());
            
            int q = changes / 25;
            changes %= 25;
            
            int d = changes / 10;
            changes %= 10;
            
            int n = changes / 5;
            changes %= 5;
            
            System.out.println(q + " " + d + " " + n + " " + changes);
        }
    }
}