
class Solution {
    public int solution(int num, int k) {
        int answer = 0; 
        String k1 = Integer.toString(k);
        // 문자열 k1을 생성해서 정수 k를 문자열로 변환한다.
        String str = Integer.toString(num);
        // 문자열로 비교하기 위해 num을 문자열로 변환하고
        String[] arr = new String[str.length()];
        // 문자열 배열을 만들어준다.
        for(int i = 0; i < str.length(); i++){
            arr[i] = String.valueOf(str.charAt(i));
            // 문자를 문자열로 변경해 배열에 넣어주고 
            if(arr[i].equals(k1)){
                // 문자열 비교를 통해 
                answer = i+1;
                break;
            }
            else{
                answer=-1;
            }
        }
        return answer;
        // answer 값을 return 시켜준다.
    }
}