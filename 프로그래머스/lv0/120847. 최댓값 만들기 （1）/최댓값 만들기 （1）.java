import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);       // 오름차순으로 배열을 정렬해주고
        int length = numbers.length;
        int answer = numbers[length-1] * numbers[length-2]; 
        // 마지막과 그 전을 곱해준다
        
        
        return answer;
    }
}