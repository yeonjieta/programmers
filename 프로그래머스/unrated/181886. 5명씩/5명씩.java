import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        // 배열의 길이를 모르기 때문에 list로 먼저 만든다.
        List<String> answer = new ArrayList<>();
        // 첫번째 원소는 무조건 들어가야하기 때문에 0번쨰 원소를 추가해두고
        answer.add(names[0]);
        for(int i = 1; i < names.length; i++){
            // 그 이후엔 5명씩 묶는거기 때문에 인덱스를 5로 나눴을 때 나머지가 0인걸 추가한다.
            if(i % 5 == 0){
                answer.add(names[i]);
            }
        }
        // 그리고 다시 배열로 바꿔 출력해준다.
        String[] arr = answer.toArray(new String[answer.size()]);
        return arr;
    }
}