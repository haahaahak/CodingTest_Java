import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine().toUpperCase();
        int[] count = new int[26]; // 알파벳 개수 크기만큼 배열 생성
        
        for (char ch : input.toCharArray()) {
            count[ch - 'A']++;
        }
        
        int max = 0;
        char result = '?';
        
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            } else if (count[i] == max) {
                result = '?';
            }
        }
        
        System.out.print(result);
	}
}