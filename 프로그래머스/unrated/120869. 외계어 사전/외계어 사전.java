class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(int i = 0; i < dic.length; i++){
            // count를 생성하고
            int count = 0;           
            for(int j = 0; j < spell.length; j++){
                // dic의 i 번째 요소에 spell의 j번쨰 요소가 포함된다면
                if(dic[i].contains(spell[j])){
                // count에 1을 더해준다.
                    count++;
                }
            }
            // count가 spell의 길이와 같다면 다 포함된거니
            // 1을 반환하고 break를 걸어주고
            if(count == spell.length){
                answer = 1;
                break;
            }
            // 아닌 경우는 2를 반환
            else{
                answer = 2;
            }
            }
        return answer;
        }
        
    }
