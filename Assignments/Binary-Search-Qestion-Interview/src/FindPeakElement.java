public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {12,13,43,45,67,55,43,23,1};
        int ans = PeakElement(arr);
        System.out.println(ans);
    }
    static int PeakElement (int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        // At the end : Sart and End value point the same largest number
        // Sop we can say that the potential answer is start = end

        return start;  // return end;
    }
}
