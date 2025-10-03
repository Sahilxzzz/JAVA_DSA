package recursion;

public class factorial1 {

    static void fact(int i,int fact){
        if(i==0){
            System.out.println(fact);
            return;
        }
        fact(i-1,fact*i);
    }
    public static void main(String[] args) {
        int n = 4;
        fact(n,1);
    }
}
