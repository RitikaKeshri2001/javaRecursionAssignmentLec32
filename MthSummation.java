import java.util.*;
public class MthSummation {

    public static int sum(int n) {
        return n*(n+1)/2;
    }
    public static int mthSum(int n, int m) {
        if(m == 0) {
            return 0;
        }
        if(m == 1) {
            return sum(n);
        }
        return mthSum(mthSum(n, m-1), 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and m:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(mthSum(n, m));
    }
}