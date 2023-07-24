public class Solution {

    public String[] solution(String my_str, int n) {
        int length = my_str.length();
        int arrayLength = length / n + (length % n == 0 ? 0 : 1); // 잘라낸 문자열의 개수
        String[] answer = new String[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int startIndex = i * n;
            int endIndex = startIndex + n;
            if (endIndex > length) {
                endIndex = length;
            }
            answer[i] = my_str.substring(startIndex, endIndex);
        }

        return answer;
    }
    
}