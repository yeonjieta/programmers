class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // 각각의 개수 비교를 위해 변수 생성
        int p = 0;
        int y = 0;
        for(int i = 0; i < s.length(); i++){
            // 문자로 변환해 모든 문자를 다 소문자로 만든다.
             char ch = s.charAt(i);
             ch = Character.toLowerCase(ch);
            
            // 그런 후 그 문자가 p와 같을 때, y와 같을 때를 구분해 갯술를 더해주고
            if(ch == 'p'){
                p++;
            }
            else if(ch == 'y'){
                y++;
            }
        }
        // 그 개수가 같지않다면 false, 아니면 원래 기본값인 true 반환
        if(p != y){
            answer = false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}