package Functions;

import java.util.Scanner;

public class sumof_1stnaturalnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int sum = sum(num);
        System.out.println(sum);
    }
    static int sum(int num){
        int addition = 0,i=1;
        while(num>=i){
        addition = addition+i;
        i++;
        }
        return addition;
    }
}
