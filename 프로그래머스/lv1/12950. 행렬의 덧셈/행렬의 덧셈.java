class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int length = arr1.length;
        int length2 = arr1[0].length; // arr1의 열의 길이와 동일해야하기 때문
        
        
        // 배열을 생성하고
        int[][] answer = new int[length][length2];
        // 반복문을 통해 각 원소의 값들을 더해 새로운 배열을 만든다
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length2; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
