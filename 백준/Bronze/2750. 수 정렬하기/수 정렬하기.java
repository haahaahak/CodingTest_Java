import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] org = new int[N];
        for (int i = 0; i < N; i++) {
            org[i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (org[j] > org[j + 1]) {
                    int temp = org[j];
                    org[j] = org[j + 1];
                    org[j + 1] = temp;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int num : org) {
            sb.append(num).append("\n");
        }
        System.out.print(sb);
    }
}