class Solution {
    public int solution(String number) {
        int answer = 0;
        int total = 0;
        // 배열을 만든후
        String[] arr = number.split("");
        // 반복문을 통해
        for(int i = 0; i < arr.length; i++){
            // 각 원소들을 정수로 변환 후 total에 더한다.
            total += Integer.parseInt(arr[i]);         
        }
        // 그리고 나머지를 구한다.
        answer = total % 9;
        return answer;
    }
}