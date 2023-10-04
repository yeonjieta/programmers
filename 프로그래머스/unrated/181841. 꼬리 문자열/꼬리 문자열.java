class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i = 0; i < str_list.length; i++){
            // 만약 원소가 ex를 포함하지 않는다면
            if(!str_list[i].contains(ex)){
                // 그 원소를 문자열에 더해준다.
                answer += str_list[i];
            }
        }
        return answer;
    }
}