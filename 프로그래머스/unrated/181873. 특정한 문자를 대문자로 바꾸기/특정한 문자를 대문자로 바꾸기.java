class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        // 문자열 길이만큼 반복문을 돌리면서
        for(int i = 0; i < my_string.length(); i++){
            // alp와 같은 문자가 있다면 
            if(my_string.charAt(i) == alp.charAt(0)){
                // 그 문자를 대문자로 변환해 결과에 추가한다.
                answer += Character.toUpperCase(my_string.charAt(i));
            }
            // 그렇지 않을 경우엔
            else{
                // 원래의 문자를 결과에 추가한다.
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}

