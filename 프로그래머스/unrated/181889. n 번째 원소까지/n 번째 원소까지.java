class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n]; // 크기가 n인 새로운 배열을 생성해줘야함
        for(int i =0; i < n; i++){
            answer[i] = num_list[i]; // answer에 num_list의 0 부터 i까지의 원소를담는다.
        }
        
        return answer;
    }
}