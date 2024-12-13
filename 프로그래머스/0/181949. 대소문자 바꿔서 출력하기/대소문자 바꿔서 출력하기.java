import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] ch = a.toCharArray();
        
        String answer = "";
        
        for (char c: ch) {
            if (Character.isUpperCase(c)) answer += Character.toLowerCase(c);
            if (Character.isLowerCase(c)) answer += Character.toUpperCase(c);
        }
        
        System.out.println(answer);
    }
}