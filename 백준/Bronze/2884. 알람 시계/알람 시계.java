import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] time = br.readLine().split(" ");
        int h = Integer.parseInt(time[0]);
        int m = Integer.parseInt(time[1]);
        
        m -= 45;
        if (m < 0) {
            m += 60;
            h -= 1;
            if (h < 0) {
                h = 23;
            }
        }
        System.out.println(h + " " + m);
    }
}