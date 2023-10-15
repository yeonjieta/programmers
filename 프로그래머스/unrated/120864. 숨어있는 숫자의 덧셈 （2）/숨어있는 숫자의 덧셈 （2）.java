
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // 문자열 안에 있는 알파벳 소,대문자들을 빈 문자열로 대체한 후 배열생성 
        String[] strs = my_string.replaceAll("[a-zA-Z]"," ").split(" ");
        // strs안에서 빈원소는 제외하고 answer에 더해준다.
        for(String str : strs){
            if(!str.equals("")){
                answer += Integer.valueOf(str);
            }
        }
       
        return answer;
    }
}