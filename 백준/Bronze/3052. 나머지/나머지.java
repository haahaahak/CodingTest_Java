import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] remain = new int[10];
        for (int i = 0; i < 10; i++) {
            remain[i] = Integer.parseInt(br.readLine()) % 42;
        }
        
        int count = 0;
        boolean[] isExisted = new boolean[42];
        for (int i = 0; i < remain.length; i++) {
            if (!isExisted[remain[i]]) {
                isExisted[remain[i]] = true;
                count++;
            }
        }
        
        System.out.print(count);
    }
}