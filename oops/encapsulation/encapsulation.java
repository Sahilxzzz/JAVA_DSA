package oops.encapsulation;

class Human{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a ;
    }

}



public class encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setName("Sahil");
        obj.setAge(20);

        System.out.println("My name is "+ obj.getName()+" and age is "+obj.getAge() );
    }
}
