class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0; i < num_list.length; i++){
            int j = num_list.length -i -1 ;
            answer[i] = num_list[j];
        }
        return answer;
    }
}