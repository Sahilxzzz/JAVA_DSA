package oops.polymorphism;

class Person{
    void role(){
        System.out.println("Im a person");
    }
}
class Father extends Person{
    @Override
    void role(){
        System.out.println("Im a father");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Person p = new Father();
        p.role();
    }
}
