import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int i = Integer.parseInt(br.readLine());
        
        System.out.print(str.charAt(i -1));
    }
}