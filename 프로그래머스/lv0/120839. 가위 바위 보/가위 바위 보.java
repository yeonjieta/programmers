// 2 > 0, 0 > 5, 5 > 2
class Solution {
    public String solution(String rsp) {
        char[] ch = rsp.toCharArray();
        // 문자열을 문자배열로 변환 후 
        // 반복문을 돌려 각각의 수를 바꿔준다.
        for (int i = 0; i < rsp.length(); i++) {
            if (ch[i] == '2') {
                ch[i] = '0';
            } 
            else if (ch[i] == '0') {
                ch[i] = '5';
            } 
            else if (ch[i] == '5') {
                ch[i] = '2';
            }
        }
        // 다시 문자를 문자열로 바꿔 return
        String answer = String.valueOf(ch);
        return answer;
    }
}