import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
		for(int i =n; i !=0; i--) {
			System.out.print(str);
			n+=1;
    }
}
}