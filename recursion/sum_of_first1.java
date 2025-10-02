package recursion;

public class sum_of_first1 {

    static int f(int n){
        if(n==0)
        return 0;
    return n + f(n-1);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(f(3));
    }
}   
