class Solution {
    public int solution(String my_string) {                     
        String str = my_string.replaceAll("[^0-9]", "");  
        // replaceAll함수와 정규표현식을 사용해 0-9 자연수를 제외한 수를 제거한다.
        int answer = 0;
        for(int i = 0; i < str.length(); i++ ){
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        } 
        // 반복문을 통해 answer에 문자열 안 수의 합을 구하는데
        // 문자를 문자열로 문자열을 정수로 형변환하여 값을 구한다.
        return answer;
    }
}