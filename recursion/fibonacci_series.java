package recursion;

public class fibonacci_series {

    static int f(int n){
        if(n<=1) return n;
        int last = f(n-1);
        int slast = f(n-2);
        return last + slast;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(f(n));
    }
}
