package leetcode_problems;

public class Q34 {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans ={-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0]= start;
        ans[1]= end;
        return ans;

    }

    static int search(int[]arr, int target, boolean findStartIndex){
        int start = 0;
        int end = arr.length - 1;
        int ans= -1;

        while (start <= end) {
            // find the mid element
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end = mid-1;

            } else if (target>arr[mid]) {
                start= mid+1;

            }
            else{
                //this can be an answer
                ans = mid;
                if (findStartIndex){
                    end= mid-1;

                }
                else {
                    start = mid+1;
                }
            }

        }
        return ans;
    }
}
