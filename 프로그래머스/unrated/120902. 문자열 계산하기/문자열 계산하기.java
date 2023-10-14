class Solution {
    public int solution(String my_string) {
        // 문자열 배열을 생성한 후
        String[] arr = my_string.split(" ");
        // 0번째 요소 부터 연산을 시작해야하므로 answer에 0번째 요소를 넣어준다.
        int answer = Integer.parseInt(arr[0]);
        for(int i = 1; i < arr.length; i++){
            // + 일땐 요소를 정수로 변환해서 더해주고
            if(arr[i].equals("+")){
                answer += Integer.parseInt(arr[i+1]);
            }            
            // - 일땐 요소를 정수로 변환해서 빼준다.
            else if(arr[i].equals("-")){
                answer -= Integer.parseInt(arr[i+1]);
            }
        }
        return answer;
    }
}