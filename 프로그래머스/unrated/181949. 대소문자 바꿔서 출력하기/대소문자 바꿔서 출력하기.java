import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str = "";
        for(int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            if(Character.isUpperCase(ch)){
                str += Character.toLowerCase(ch);
            }
            else{
                str += Character.toUpperCase(ch);
            }
        }
        System.out.println(str);
    }
}