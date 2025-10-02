package recursion;

public class print_n_to_one {
  
    static void f(int i, int n){
        if(i==0)
        return;
        System.out.println(i);
        f(i-1,n);
    }

    public static void main(String[] args) {
        int n = 4;
        f(4,n);
    }
}
