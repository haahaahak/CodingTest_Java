import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (String str : numbers) {
            int num = Integer.parseInt(str);
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        System.out.println(min + " " + max);
    }
}