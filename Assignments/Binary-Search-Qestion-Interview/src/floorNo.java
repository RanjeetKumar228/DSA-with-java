public class floorNo {

    public static void main(String[] args) {
        int[] arr = {3,5,7,9,13,15,17,20};
        int target = 14;
        int ans = floor(arr,target);
        System.out.println(ans);
    }

    //return index of greatest no <= target

    static int floor (int[] arr ,int target){

        int s =0;
        int e = arr.length - 1;

        while(s <= e){
            //find mid value
            int mid = s + (e -s)/2;

            if (target < arr[mid]) {
                e = mid - 1;
            } else if (target > arr[mid]) {
                s = mid +1;
            } else {
                return mid;
            }
        }
        return e;
    }
}
