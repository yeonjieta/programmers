class Solution {
    public String solution(String cipher, int code) {
        char[] ch = cipher.toCharArray();
        // cipher를 char 배열로 만들어준 후 
         String answer ="";
        for(int i = 0; i <cipher.length(); i++){
            if((i+1) % code == 0){
                // 인덱스가 code 의 배수인지를 확인하기위해 0부터 시작하니 +1을 한 후  code로 나눠떨                    어지면 조건에 충족하므로
                answer += ch[i];
                // answer에 더해준다.
            }
        }
        return answer;
    }
}