import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] cArr = a.toCharArray();
        
        for(char c : cArr) {
            System.out.println(c);
        }
    }
}