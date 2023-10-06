class Solution {
    public int solution(String my_string, String is_prefix) {
        // is_prefix가 my_string 보다 길이가 길 경우는 무조건 0을 반환
        if(is_prefix.length() > my_string.length()){
            return 0;
        }
        // 그렇지 않은 경우 my_string에 substring을 이용하여
        // is_prefix 길이 만큼 잘랐을 때 같으면 1 아니면 0을 반환
        if(my_string.substring(0, is_prefix.length()).equals(is_prefix)){
            return 1;
        }
        else{
            return 0;
        }
    }
}