class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int add = 0;
        int mul = 1;
        for(int i = 0; i <num_list.length; i++){
            add += num_list[i];
        }
         for(int i = 0; i <num_list.length; i++){
            mul *= num_list[i];
        }
        if(mul < add*add ){
            answer = 1;
        }
        else{
            answer = 0;
        }
        return answer;
    }
}