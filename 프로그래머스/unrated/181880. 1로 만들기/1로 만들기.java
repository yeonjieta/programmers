class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        for(int i = 0; i < num_list.length; i++){
            // 1이 되면 끝내야 하니 조건을 걸어주고
            while(num_list[i] != 1){
                // 각 조건에 맞는 연산식을 실행해 주면서 count에 1씩 더해준다.
                if(num_list[i] % 2 == 0){
                    num_list[i] = num_list[i] / 2;
                    count++;
                }
                else{
                    num_list[i] = (num_list[i] - 1)/2; 
                    count++;  
                }
                
            }
        }
        return count;
    }
}