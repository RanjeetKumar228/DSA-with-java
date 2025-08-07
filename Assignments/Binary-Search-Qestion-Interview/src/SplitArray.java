public class SplitArray {
    public static void main(String[] args) {

    }
    static int splitArray(int[] nums,int k){
        int start = 0;
        int end = 0;
        for (int j : nums) {
            start = Math.max(start, j);//in the end of the loop this will contain the max item from the array
            end += j;
        }
        // binary search
        while(start < end){
            // try to find the potential ans
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if (sum + num > mid ) {
                    // you cannot add this in this subarray , make a new
                    // say you add this num in new subarray,then sum=num
                    sum = num;
                    pieces++;
                }else {
                    sum += num;
                }
            }
            if (pieces > k){
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return start; // here start==end
    }
}
