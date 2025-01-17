import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        
        while ((line = br.readLine()) != null) {
            String[] num = line.split(" ");
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);
            
            bw.write((a + b) + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}