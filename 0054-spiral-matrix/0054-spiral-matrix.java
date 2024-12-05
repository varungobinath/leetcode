class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        List<Integer> lst = new ArrayList<>();
        int top = 0,left = 0, right = c-1, bottom = r-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++)
                lst.add(matrix[top][i]);
            top++;
            for(int i=top;i<=bottom;i++)
                lst.add(matrix[i][right]);
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--)
                    lst.add(matrix[bottom][i]);
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--)
                    lst.add(matrix[i][left]);
            }
            left++;
        }
        return lst;
    }
}