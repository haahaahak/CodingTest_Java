import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        String ab = a + b;
        
        int numResult = Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c);
        int strResult = Integer.parseInt(ab) - Integer.parseInt(c);
        
        System.out.println(numResult);
        System.out.println(strResult);
    }
}