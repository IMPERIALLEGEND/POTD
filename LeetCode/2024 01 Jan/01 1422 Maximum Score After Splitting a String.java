class Solution {
    public int maxScore(String s) {
        int zeroCount = 0;
        int oneCount = 0;
        int maxScore = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1') oneCount++;
        }

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == '1') oneCount--;
            else zeroCount++;
            maxScore = Math.max(maxScore, oneCount + zeroCount);
        }

        return maxScore;
    }
}