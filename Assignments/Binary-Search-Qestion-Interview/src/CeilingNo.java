public class CeilingNo {

    public static void main(String[] args) {
        int[] arr = {102,103,135,157,200,254,269,280};
        int target = 157;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }

    //return index of smallest no >= target

    static int ceiling(int[] num,int target){
        int start = 0;
        int end = num.length - 1;
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
        return start;
    }
}
