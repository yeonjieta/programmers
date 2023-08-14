
class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        // 차이를 비교해야하니 일단 절대값으로 최소값을 지정해둔다 (첫번째 원소)
        int min = Math.abs(array[0] - n);
        // 반복문을 통해 비교한다
        for(int i = 1; i < array.length; i++){
            // 차이를 변수로 생성하고
            int diff = Math.abs(array[i] - n);
            // 최소값보다 작은 수가 있으면 최소값을 그 수로 바꾸고 
            // 차이가 똑같다면 더작은 수를 return 해야하니,
            // 차이가 똑같으면서 지금 원소가 answer보다 작은지 확인해준다.
            if(diff < min || (diff == min && array[i] < answer)){
                min = diff;
                answer = array[i];
            }
        }
        return answer;
    }
}
