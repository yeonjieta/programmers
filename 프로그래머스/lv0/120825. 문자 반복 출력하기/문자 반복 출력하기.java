class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i =0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            // 일단 문자열에서 문자 하나씩 뽑아낸 후 
            for(int j = 0; j < n; j++){
                answer += ch;
                // n번 반복해 answer에 더해준다
            }
        }
        return answer;
    }
}