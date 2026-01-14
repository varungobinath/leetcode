class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int left = 0, right = r*c-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            int midValue = matrix[mid/c][mid%c];

            if(midValue < target) left = mid+1;
            else if(midValue > target) right = mid-1;
            else return true;
        }
        return false;
    }
}