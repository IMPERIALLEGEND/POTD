class Solution {
    public boolean isValid(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        //System.out.println(s1 + " " +s2);
        for(int i=0;i<n1;i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        int j = n2 - 1;
        for(int i=n1-1;i>=0;i--){
            if(s1.charAt(i) != s2.charAt(j)){
                return false;
            }
            j--;
        }

        return true;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
            if(words[i].length() <= words[j].length() && isValid(words[i], words[j])){
                count++;
            }
            }
        }

        return count;
    }
}