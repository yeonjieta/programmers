class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        // 길이 생성
        int len = s2.length;
        if (s1.length > s2.length) {
            len = s1.length;
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < s2.length; j++) {
                    if (s1[i].equals(s2[j])) {
                        answer++;
                        break;
                    }
                }
            }
        }
        else {
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < s1.length; j++) {
                    if (s2[i].equals(s1[j])) {
                        answer++;
                        break;
                    }
                }
            }
        }
     
        
        return answer;
    }
}