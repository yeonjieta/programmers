class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = my_string.length()-1; i >= 0; i--){
            // 거꾸로 뒤집어야하니 뒤 인덱스부터 추출하기 위해 
            // my_string.length()-1 인덱스 부터 0까지로 범위를 설정해준다.
            char ch = my_string.charAt(i);
            // 문자를 하나씩 뽑아내고
            answer += ch; // answer에 더해준다.
        }
        return answer;
    }
}