import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        // 길이를 모르기 때문에 일단 ArrayList로 리스트를 만들어준다.
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                list.add(i); 
            }
        }
        // list에 추가를 하려면 add를 이용하여 추가를 해야하고, n으로 나눴을 때 0이 되면 약수이기 때문에 그 수들을 담아준다.
        
        int[] answer = new int[list.size()]; // 이제 answer의 길이를 알 수 있기 때문에 size()로 길이를 적어주고  배열을 생성한다.
        for(int i = 0; i < list.size(); i++){
            answer[i] += list.get(i);
        }  // get을 이용해 list에서 해당 인덱스의 수를 꺼내와 answer에 담아준다.
        return answer;
    }
}