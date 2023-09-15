class Solution {
    public int solution(String s) {
        int answer = 0;
        // 0 ~ 9까지의 수가 담긴 배열을 만든다
        String[] num 
            = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        // 반복문을 통해, num[i] 의 문자를 숫자로 대신한다.(이 숫자는 문자로 변환)
        for(int i = 0; i < 10; i++){
            s = s.replace(num[i],Integer.toString(i));
        }
        // 그리고 숫자로 답을 내야하기 때문에 변환을 해준다.
        answer = Integer.parseInt(s);
        
        return answer;
    }
}
