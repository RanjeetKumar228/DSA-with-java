public class DuplicateRotationArray {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,9};
        int ans = search(arr,2);
        System.out.println(ans);
    }
    static int search(int[] arr, int target){
        int duplicateRA = duplicateRotatedArray(arr);
        if (duplicateRA == -1){
            return BinarySearch(arr,target,0,arr.length -1);
        }
        // when you find the pivot
        if (arr[duplicateRA] == target) {
            return duplicateRA;
        }
        if (target >= arr[0]) {
            return BinarySearch(arr,target,0,duplicateRA-1);
        }
        return BinarySearch(arr,target,duplicateRA+1,arr.length -1);
    }
    static int duplicateRotatedArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // if element at mid, start, end are equal than skip the duplicate element

            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // check start element is pivot or not
                if (arr[start] > arr[start+1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end-1]) {
                    return end -1;
                }
                end--;
            }
            // left side is sorted array
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end] ) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int BinarySearch(int[] arr, int target, int start,int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
