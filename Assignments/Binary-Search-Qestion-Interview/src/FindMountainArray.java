public class FindMountainArray {
    public static void main(String[] args) {


    }
     int search(int[] arr,int target,int start ,int end){
        int peak = FindPeakValue(arr);
        int firstTry = orderAgnosticArray(arr,target, 0,peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticArray(arr,target,peak+1,arr.length - 1);
    }
     int FindPeakValue (int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            if (arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
        }
        return end;
    }
     int orderAgnosticArray (int[] arr,int target,int start,int end){

        boolean isDes = arr[start] > arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if(isDes){
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }
            else {
                if(target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return - 1;
    }
}
