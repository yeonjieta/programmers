class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++){
            char ch = myString.charAt(i); // 각각의 문자를 비교하기 위해 문자열을 문자로 변환
            if(ch == 'a' || ch == 'A'){  // 만약 문자가 소문자a이거나 대문자 A라면 대문자A로
                ch = 'A';
            }
            else if(Character.isUpperCase(ch)){ // 만약 문자가 대문자이면(이 경우에 대문자 A가 포함될 수 있기 때문에 위 조건에 대문자 A도 포함시킴)
                ch = Character.toLowerCase(ch); // 소문자로 
            }
            answer += ch;  // 그리고 새로운 문자열에 추가한다.
        }
        return answer;
    }
}