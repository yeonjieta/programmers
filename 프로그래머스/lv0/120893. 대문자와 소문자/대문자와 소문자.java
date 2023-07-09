class Solution {
    public String solution(String my_string) {
        char[] ch = my_string.toCharArray();
        for(int i = 0; i < my_string.length(); i++){
            if(Character.isUpperCase(ch[i]) == true){
                ch[i] = Character.toLowerCase(ch[i]);
            }
            else {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        String answer = String.valueOf(ch);
        return answer;
    }
}