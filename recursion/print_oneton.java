package recursion;

public class print_oneton{
    
    static void f(int i,int n){
        if (i>n)
        return;
        System.out.println(i);
        f(i+1,n);
    }
    public static void main(String[] args) {
        int n = 4;
        f(1,n);
    }
}