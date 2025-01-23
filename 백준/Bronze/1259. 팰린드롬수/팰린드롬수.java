import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;
        
        while ((input = br.readLine()) != null) {
            if (input.equals("0")) {
                break;
            }
            
            if (isReverse(input)) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }
        
        System.out.print(sb.toString());
    }
    
    private static boolean isReverse(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
