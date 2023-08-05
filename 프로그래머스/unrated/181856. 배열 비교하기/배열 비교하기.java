class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        // 길이가 같을 경우 합 비교를 위한 변수 생성
        int total1 = 0;
        int total2 = 0;
        // 길이를 비교하여 각각의 수를 대입
        if(arr1.length > arr2.length){ 
            answer = 1;
        } else if(arr1.length < arr2.length){
            answer = -1;
            // 길이가 같은 경우엔 반복문을 통한 각 배열의 합으로 비교
        } else if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                total1 +=arr1[i];
                total2 +=arr2[i];
            }
            if(total1 > total2){
                answer = 1;
            }
            else if(total1 < total2){
                answer = -1;
            }
            else{
                answer = 0;
            }
        }
        return answer;
    }
}