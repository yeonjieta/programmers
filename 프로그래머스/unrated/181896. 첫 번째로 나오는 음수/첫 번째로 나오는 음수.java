class Solution {
    public int solution(int[] num_list) {
        int answer = -1; 
        // 음수가 없다면 -1 을 반환해야하기 때문에 -1을 초기값으로 정해준다.
        for(int i = 0; i <num_list.length; i++){
            if(num_list[i] < 0){
               answer = i;
                break;
            }
        }
        return answer;
    }
}