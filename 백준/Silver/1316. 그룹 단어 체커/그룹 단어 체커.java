import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            if (isGroup(br.readLine())) {
                count++;
            }
        }
        
        System.out.print(count);
	}
    
    public static boolean isGroup(String str) {
        boolean[] check = new boolean[26];
        char prev = ' ';
        
        for (char ch : str.toCharArray()) {
            if (ch != prev) {
                if (check[ch - 'a']) {
                    return false;
                }
                check[ch - 'a'] = true;
            }
            prev = ch;
        }
        
        return true;
    }
}