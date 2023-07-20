// 문자로 비교
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String number = ""; // 문자열을 하나 생성해두고 
        for(int num = i; num <= j; num++){
            number += String.valueOf(num);  // 문자열에 일단 i 부터 j까지의 수를 추가해준다
        }
        for(int s = 0; s < number.length(); s++){
            if (number.charAt(s) == Character.forDigit(k, 10)) { // k도 문자로 형변환해서 문자를 하나하나 비교한다. 
                answer++; // 같을경우 answer의 수 1증가
            }
        }
        return answer;
    }
}