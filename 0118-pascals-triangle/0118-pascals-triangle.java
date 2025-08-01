class Solution {
    public int nCr(int n,int r){
        int result = 1;
        for(int i=0;i<r;i++){
            result *= (n-i);
            result /= (i+1);
        }
        return result;
    }
    public List<Integer> rowOf(int n){
        List<Integer> lst = new ArrayList<>();
        for(int i=1;i<=n;i++){
            lst.add(nCr(n-1,i-1));
        }
        return lst;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            lst.add(rowOf(i));
        }
        return lst;
    }
}