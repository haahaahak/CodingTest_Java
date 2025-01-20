import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String[] line = br.readLine().split(" ");
            
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int c = Integer.parseInt(line[2]);
            
            if (a == 0 && b == 0 && c == 0) break;
            
            int max = Math.max(a, Math.max(b, c));
            int others = a * a + b * b + c * c - max * max;
            
            if (others == max * max) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}