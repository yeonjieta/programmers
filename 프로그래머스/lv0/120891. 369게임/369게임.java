// order를 배열로 바꾼 후 order 안에 3의 배수가 있다면 answer에 +1읗 해준다.
// int를 string으로 바꾼 후 배열로 만들어준다.
class Solution {
    public int solution(int order) {
        String game = String.valueOf(order);
        int[] arr = new int[game.length()];
        int answer = 0;
        for(int i = 0; i< game.length(); i++){
        // 3의 배수인지 확인하기 위해서 문자 > 문자열 > 숫자로 변환 시켜준 뒤 확인한다.
            arr[i] = Integer.parseInt(String.valueOf(game.charAt(i)));
            if(arr[i] % 10 == 3 || arr[i] % 10 == 6 || arr[i] % 10 == 9){
                answer +=1;
            }
        }
        return answer;
    }
}