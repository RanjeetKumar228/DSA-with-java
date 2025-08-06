public class FindInfiniteArray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 100;
        System.out.println(ans(arr,target));
    }
    static int ans (int[] arr, int target){
        //Find the range of the box
        //First start with a box of size 2
        int start = 0;
        int end  =1;
        // condition for the target lie in the range
        while(target > arr[end]){
            int temp = end + 1;  // this is new start
            // double the size of the box
            // end = previous + size of the box *2
            end = (end - start + 1) * 2;
            start = temp;
        }
        return BinarySearch(arr, target,start,end);
    }
    static int BinarySearch (int[] num, int target, int start ,int end){
        while(start <= end){
            int mid  = start + (end - start) / 2;
            if(target > num[mid]){
                start = mid + 1;
            } else if (target < num[mid]){
                end = mid -1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
