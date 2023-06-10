import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        // 일단 배열 array를 오름차순으로 정렬해주고
        for(int i = 0; i < array.length; i++){
            if(array[i] == array[array.length / 2]){
                // array배열길이를 2로 나눈 몫은 딱 중간값을 나타내므로
                // array배열의 i번째 값이 중간값과 같다면 answer에 값을 넣어준다.
                answer = array[i];
            }
            
        }
        return answer;
    }
}