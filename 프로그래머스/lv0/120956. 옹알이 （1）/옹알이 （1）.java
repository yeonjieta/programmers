class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++){
             // 옹알이 문자를 " "로 대체한 후 다시 ""로 대신해 비교후 결과 도출
            // 처음부터 "" 이렇게 한다면 "wyeoo"와 같이
            // ye가 대체되면 woo가되고 그럼 오류가 발생 
            babbling[i] = babbling[i].replace("aya", " ")
                                     .replace("ye", " ")
                                     .replace("woo", " ")
                                     .replace("ma", " ")
                                     .replace(" ", "");
            if(babbling[i].equals("")){
                answer++;
            }
            }
        return answer;
    }
}