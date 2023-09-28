class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        // bin1, bin2 를 2진수를 10진수로 변환한다.
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        // 두수의 합을 구한 후
        int sum = num1 + num2;
        // 다시 2진수로 변환해준다.
        answer = Integer.toBinaryString(sum);
        
        return answer;
    }
}