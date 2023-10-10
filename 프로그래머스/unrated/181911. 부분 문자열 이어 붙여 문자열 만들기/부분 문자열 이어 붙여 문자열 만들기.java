class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i = 0; i < my_strings.length; i++){
            // 이차배열에서 안 배열의 원소를 사용하기 위해 
            // 새로운 변수를 만든다.
            int[] currentPart = parts[i];
            // substring을 이용하여 자른 문자열을 정답에 더해준다.
            answer += my_strings[i].substring(currentPart[0], currentPart[1] +1);
        }
        return answer;
    }
}