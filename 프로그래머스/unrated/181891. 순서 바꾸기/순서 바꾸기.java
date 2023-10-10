class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        // StringBuilder를 이용해 배열을 문자열로 바꾼다.
        StringBuilder str = new StringBuilder();
        for(int num : num_list){
            str.append(num);
        }
        // 원하는 결과값을 substring을 이용해 문자열로 바꾸고
        String result = str.substring(n) + str.substring(0, n);
        // 문자열을 배열로 변환 후
        String[] arr = result.split("");
        // 정수 배열로 변환한다.
        for(int i = 0; i < arr.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}