//https://app.codility.com/demo/results/training2ZENH2-JA2/
class Solution11 {
    public int solution(int A, int B, int K) {
    	int result = B / K - A / K;
    	if(A % K == 0)
    		result++;
    	return result;
    }
}
