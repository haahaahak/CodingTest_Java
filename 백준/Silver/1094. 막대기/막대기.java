import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());
        int stick = 64;
        int sum = 0;
        int count = 0;
        while (sum < X) {
            if (stick > X - sum) {
                stick /= 2;
            } else {
                sum += stick;
                count++;
            }
        }
        
        System.out.print(count);
    }
}