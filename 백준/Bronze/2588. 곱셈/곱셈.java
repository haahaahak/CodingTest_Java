import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        
        int one = A * (B % 10);
        int ten = A * ((B / 10) % 10);
        int hund = A * (B / 100);
        int total = A * B;
        
        System.out.println(one);
        System.out.println(ten);
        System.out.println(hund);
        System.out.println(total);
	}
}