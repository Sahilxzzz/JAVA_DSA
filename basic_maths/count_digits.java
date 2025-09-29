package basic_maths;

public class count_digits {
    public static void main(String[] args) {
        int n = 778679;
        int count = 0;

        while(n>0){
            n = n/10;
            count++;
        } System.out.println(count);
    }
}
