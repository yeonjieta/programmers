import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        // 배열 sides를 오름차순으로 정렬한 후 
        if(sides[0] + sides[1] > sides[2]){ 
        // 반복문을 돌려해도 되지만 배열의 크기는 3으로 무조건 정해져있으니 바로 index를 넣어 풀었다.
            answer = 1;
        }
        else {
            answer = 2;
        }
        return answer;
    }
}