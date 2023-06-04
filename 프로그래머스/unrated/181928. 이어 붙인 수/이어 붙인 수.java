class Solution {
    public int solution(int[] num_list) {
        String total1 ="";
        String total2 ="";
        int answer = 0;
        for(int i = 0; i< num_list.length; i++){
            if(num_list[i] % 2 == 0){
                total1 += String.valueOf(num_list[i]);
            }
        }
          for(int i = 0; i< num_list.length; i++){
             if(num_list[i] % 2 != 0){
                total2 += String.valueOf(num_list[i]);
            }
        }
        int total3 = Integer.parseInt(total1);
        int total4 = Integer.parseInt(total2);
        answer = total3 + total4;
        
        return answer;
    }
}