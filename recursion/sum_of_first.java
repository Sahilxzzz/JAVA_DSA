package recursion;

public class sum_of_first {
    static void f(int i,int sum){
        if(i<1){
        System.out.println(sum);
        return;
        }
        f(i-1,sum+i);
    }

    public static void main(String[] args) {
        int n = 3;
        f(n,0);
    }
}
