class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toUpperCase();
        pat = pat.toUpperCase();
        // 대소문자 구분하지 않고 하니 다 대문자로 변경 후 실행
        
        if(myString.contains(pat)){
            answer = 1;
        }
        else {
            answer = 0;
        }
        return answer;
    }
}