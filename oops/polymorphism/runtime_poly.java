package oops.polymorphism;

class Maths{
    static int Multiply(int a, int b){
        return a*b;
    }
    static double Multiply(double a, double b){
        return a*b;    
    }
}

public class runtime_poly {
    public static void main(String[] args) {
       Maths m = new Maths();
        System.out.println(m.Multiply(2.0222, 3.43433));
        System.out.println(m.Multiply(4, 10));
    }
}                       
