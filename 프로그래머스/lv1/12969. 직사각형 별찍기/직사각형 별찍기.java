import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // 열이니까 먼저 위쪽에 반복문을 돌리고
        for(int i = 0; i < m; i++){
            //행이니까 안쪽에 반복문을 돌린다 
            for(int j = 0; j < n; j++){
                // 별을 찍고
                System.out.print("*");
            }
            // 한 줄 씩 띄워야 하니까 
            System.out.println();
        }
    }
}