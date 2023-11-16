import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        // list를 생성하여 my_string 각 문자를 list에 저장한다.
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            list.add(my_string.charAt(i));
        }
        // 정렬을 해야 인덱스가 변하지 않으므로 꼭 해줘야함
        Arrays.sort(indices);
        // 역순으로 리스트를 순회해야 index가 변하지 않기 때문에 역순으로 해야함
        for (int i = indices.length - 1; i >= 0; i--) {
            // 역순으로 해당 인덱스의 원소를 제거한다.
            list.remove(indices[i]);
        }
        // 문자열에 각 문자를 더해서 답을 추출
        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }
        System.out.print(list);
        return answer;
    }
}