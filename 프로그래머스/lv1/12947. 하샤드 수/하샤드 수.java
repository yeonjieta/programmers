class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        // 숫자를 한자리씩 다 더해주기 위해 배열을 만든다.
        // 문자열로 바꾼 후 문자배열을 만들어준다.
        String str = String.valueOf(x);
        char[] arr = str.toCharArray();
        // 전체 합을 위한 변수를 생성하고
        int total = 0;
        // 반복문을 통해 합을 구한다. 배열이 문자로 구성돼있기 때문에
        // 문자 > 문자열 > 정수 로 변환한다.
        for(int i = 0; i < arr.length; i++){
            total += Integer.parseInt(String.valueOf(arr[i]));
        }
        // 만약 x에서 x의 전체자리수 합을 나눴을 때 0이 아니라면 false를 반환
        if(x % total != 0){
            answer = false;
        }
        return answer;
    }
}