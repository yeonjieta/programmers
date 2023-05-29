import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] index_list) {
         String[] answer = new String[index_list.length];
        // 필요한 크기의 answer 배열을 생성하고
		 String[] arr = my_string.split("");
        // my_string 문자열에서 한 문자씩을 요소로 가지는 배열을 만들어준다.
	     for(int i = 0; i < index_list.length; i++){
		    answer[i] = arr[index_list[i]];
    }
        // index_list의 0번째는 16이고 그럼 arr[16]이 되고 answer의 0번째 요소에 index_list의 16번째 요소가 들어가게 되므로 p가 들어가게된다.
        String result = "";
        for(String str : answer){
            result += str;
        }
        // 배열을 문자열로 바꾸기 위한 반복문
          return result;
}
}