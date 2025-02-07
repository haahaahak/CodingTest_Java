import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        long result = 0;
        long pow = 1;
        int prime = 1234567891;
        for (int i = 0; i < L; i++) {
            result += ((str.charAt(i) - 96) * pow);
            pow = (pow * 31) % prime;
        }

        System.out.print(result % prime);
	}
}