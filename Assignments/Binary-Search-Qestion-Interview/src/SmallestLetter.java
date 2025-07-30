//public class SmallestLetter {
//    public static void main(String[] args) {
//        char[] letters = {'c','f','j'};
//        //char[] letters = {'x','x','y','y'};
//        char ans = nextGreatestLetter(letters,'c');
//        System.out.println(ans);
//    }
//     static  char nextGreatestLetter(char[] letters, char target) {
//        int start = 0;
//        int end = letters.length -1;
//        while(start < end){
//            int mid = start + (end - start) / 2;
//            if (target > letters[mid]){
//                start = mid +1;
//            }else {
//                end = mid -1;
//            }
//        }
//             return letters[start % letters.length];
//
//     }
//}


public class SmallestLetter {

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
