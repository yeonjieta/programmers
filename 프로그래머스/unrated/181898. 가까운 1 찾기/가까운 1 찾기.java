class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        // idx보다 커야하니 idx 부터 시작
        for(int i = idx; i < arr.length; i++){
            // 1이면 그 인덱스를 반환하고 멈춘다.
            if(arr[i] == 1){
                answer = i;
                break;
            }
            else{
                answer = -1;
            }
        }
        return answer;
    }
}