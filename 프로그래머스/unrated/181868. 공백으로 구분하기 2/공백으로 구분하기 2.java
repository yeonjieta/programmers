class Solution {
    public String[] solution(String my_string) {
        // trim 함수를 써 앞 뒤 공백은 제거
        // \\s 는 정규표현식으로 공백 문자 하나를 의미한다.
        // \\s 뒤에 +를 붙이면 하나 이상 반복되는걸 의마하기 때문에
        // 하나이상의 연속된 공백이 있을 경우 그걸 기준으로 배열을 형성한다.
        String[] answer = my_string.trim().split("\\s+");
        return answer;
    }
}