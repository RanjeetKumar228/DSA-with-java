public class SubPS {
    public static void main(String[] args) {
        int n = 234;
        result(n);
        System.out.println(result(n));
    }
    static int result (int n){
        int result1 =  digitP(n);
        int result2 = digitS(n);
        return result1 - result2;
    }
    static int digitP (int n){
        int ans = 1;
        int count = 0;
        while (n >0 ){
            int rem = n % 10;
            n /= 10;
            ans = ans * rem;
            count++;
        }
        return ans;
    }
    static int digitS (int n){
        int ans = 0;
        int count = 0;
        while (n >0 ){
            int rem = n % 10;
            n /= 10;
            ans = ans + rem;
            count++;
        }
        return ans;
    }
}
