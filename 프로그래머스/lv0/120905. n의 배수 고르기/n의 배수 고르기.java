import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = new int[numlist.length]; 
        // answer 배열의 길이를 알 수 없기 때문에 나중에 원하는 길이만큼 복사할 메서드를 쓸 생각으로               최대길이를 길이로 정해준다.
        int index = 0;
        // answer 배열의 index 지정을 위해 변수를 생성해주고 
        for(int i = 0; i< numlist.length; i++){
            if(numlist[i] % n == 0){ 
        // 반복문을 통해 numlist의 요소 중 n으로 나눠지는 것들을
                answer[index] = numlist[i];
        // answer 배열에 채워준다.
                index++;
        // 조건이 맞았을 때 index를 1씩 증가시켜준다.
            }
        }
        return Arrays.copyOf(answer,index);
        // 그리고 index만큼 잘라주면 된다.
        
        
    }
}