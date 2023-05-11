class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] arr = num_str.split("");
        // split 함수로 문자열을 하나씩 쪼개주고
        for(int i = 0; i <arr.length; i++){
            answer += Integer.parseInt(arr[i]);
            // 숫자로 바꿔야하니 형변환을 해준다.
        }
        return answer;
    }
}