class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int total =0;
        int multiply=1;
        if(num_list.length >= 11){
            for(int i = 0; i < num_list.length; i ++ ){
                total += num_list[i];
            }
             answer = total;
        }
        else {
            for(int i = 0; i < num_list.length; i ++ ){
                multiply *= num_list[i];
            }
             answer = multiply;
        }
        return answer;
    }
}
