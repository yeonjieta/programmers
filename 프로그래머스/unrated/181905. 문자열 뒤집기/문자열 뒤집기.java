class Solution {
    public String solution(String my_string, int s, int e) {
        // 일단 answer에 s번째 index 전까지 넣는다.
        String answer = my_string.substring(0, s);
        // index를 뒷 순서부터해서 answer에 더해주고
        for(int i = e; i >= s; i--){
            answer += my_string.charAt(i);
        }
        // 뒤에 남아있던 문자를 더한다.
        answer += my_string.substring(e+1);
        return answer;
    }
}