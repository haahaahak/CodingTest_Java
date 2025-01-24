import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] lines = br.readLine().split(" ");
        
        int[] score = new int[N];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(lines[i]);
            score[i] = value;
            max = Math.max(value, max);
        }
        
        double total = 0.0;
        for (int i = 0; i < N; i++) {
            total += (double) score[i] / max * 100;
        }
        
        System.out.print(total / N);
    }
}