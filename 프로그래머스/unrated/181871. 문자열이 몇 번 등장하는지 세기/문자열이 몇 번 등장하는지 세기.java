class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        // 범위를 넘지 않고 비교하기 위해 pat 길이만큼 빼줘야한다.
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            // i 번째 부터 그 길이를 더한만큼의 전 인덱스까지 했을 때 pat과 같다면 +한다.
            // contains 할 경우 중복으로 체크될 가능성이 있으므로 eqauls를 사용
            if (myString.substring(i, i + pat.length()).equals(pat)) {
                answer++;
            }
        }
        return answer;
    }
}