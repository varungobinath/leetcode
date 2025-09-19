class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1) return 1;
        int[] count = new int[n+1];
        for(int[] i : trust){
            count[i[0]]--;
            count[i[1]]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]==n-1) return i;
        }
        return -1;
    }
}