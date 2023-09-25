class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        // 문자열 비교와 삼항연산자로 해결
        if(ineq.equals(">") && eq.equals("=")){
            answer = n >= m ? 1 : 0;
        }
        if(ineq.equals("<") && eq.equals("=")){
            answer = n <= m ? 1 : 0;
        }
        if(ineq.equals(">") && eq.equals("!")){
            answer = n > m ? 1 : 0;
        }
        if(ineq.equals("<") && eq.equals("!")){
            answer = n < m ? 1 : 0;
        }
        return answer;
    }
}
