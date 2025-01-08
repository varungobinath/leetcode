class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int knownSum = 0;
        for(int i : rolls) knownSum += i;
        int unknownSum = mean*(rolls.length+n)-knownSum;
        if(unknownSum<n || unknownSum>6*n) return new int[]{};
        
        int value = unknownSum/n;
        int extra = unknownSum%n;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = value + ((i<extra)?1:0);
        }
        return res;
    }
}