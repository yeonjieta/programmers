class Solution {
    public int solution(String my_string, String is_suffix) {
        // endsWith 함수를 사용하여 
        // my_string이 is_suffix로 끝난다면 1을 반환 그 외는 0을 반환
        if(my_string.endsWith(is_suffix)){
            return 1;
        }
        else{
            return 0;
        }
    }
}