class Solution {
    public int findBestValue(int[] arr, int target) {
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i : arr){
            max = Math.max(max,i);
        }
        int absolute_diff = Integer.MAX_VALUE;
        int minend = 0;
        int maxend = max;
        while(minend<maxend){
            int mid = (maxend+minend)/2;
            int sum = changeAndSum(arr,mid);
            if(sum>target){
                int abs = Math.abs(sum-target);
                if(abs<absolute_diff){
                    absolute_diff = abs;
                    ans = mid;
                }
                maxend = mid-1;
            }else{
                int abs = Math.abs(sum-target);
                if(abs<absolute_diff){
                    absolute_diff = abs;
                    ans = mid;
                }
                minend = mid+1;
            }
        }
        int abs_minus = ans-1;
        int abs_plus = ans+1;
        int ans_abs_minus = Math.abs(changeAndSum(arr,abs_minus)-target);
        int ans_abs_plus = Math.abs(changeAndSum(arr,abs_plus)-target);
        // System.out.println(abs_plus+" "+abs_minus+" "+absolute_diff);
        // System.out.println(ans_abs_minus+" "+ans_abs_plus);
        if(ans_abs_minus<=absolute_diff && ans_abs_minus<ans_abs_plus) return abs_minus;
else if(ans_abs_plus<absolute_diff && ans_abs_plus<ans_abs_minus) return abs_plus;
        return ans;
    }
    public int sum(int[] arr){
        int s = 0;
        for(int i : arr) s+=i;
        return s;
    }
    public int changeAndSum(int[] arr,int value){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>value){
                sum += value;
            }else{
                sum += arr[i];
            }
        }
        return sum;
    }
}