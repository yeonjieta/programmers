class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // queries 2차원 배열의 안 배열은 길이가 무조건 2라서 원소의 인덱스는 0과 1 밖에 없다
        // queires의 길이-1만큼 반복문을 돌려 queries에서 뽑은 요소를 arr index의 범위로 설정해 +1 씩 해준다.   
        for(int j = 0; j < queries.length; j++){
            for(int i = queries[j][0]; i <= queries[j][1]; i++){
                arr[i] +=1;
            }
        }
        return arr;
    }
}