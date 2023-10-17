import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        // list를 생성하고
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++){
            // substring을 이용해 인덱스 s 부터 s에 l을 더한 인덱스로 범위를 잡고
            // 형변환을 한 후 k 보다 크다면 list에 추가한다.
            if(Integer.parseInt(intStrs[i].substring(s, s+l)) > k){
                list.add(Integer.parseInt(intStrs[i].substring(s, s+l)));
            }
        }
        // list에서 array로 변환
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        System.out.print(list);
        return answer;
    }
}