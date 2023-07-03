class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        int maxIdx = 0;
        // 일단 0번쨰 인덱스의 값을 최댓값으로 정해주고

        for(int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
                maxIdx = i;
            }
            // 반복문을 통해 최대값보다 큰 값이 나타날 경우 그 값을 최대값에 넣어주는걸 반복한다.
            // 인덱스도 같이 출력해야 하므로 함께 해준다. 
            
        }
        int[] answer = {max, maxIdx};
            
        return answer;
    }
}