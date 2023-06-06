class Solution {
    public int solution(String message) {
        int answer = 0;
        int len = message.length();
        // message의 길이를 구한 후 
        answer = 2 * len;
        // 한 글자 당 2cm 이니 곱하기 2 를 해준다.
        return answer;
    }
}