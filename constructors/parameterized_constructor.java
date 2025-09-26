package constructors;

class Student{
    String name;
    int year;

    Student(String name,int year){
        this.name = name;
        this.year = year;
    }
}

public class parameterized_constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Sahil",2022);
        System.out.println(s1.name );
    }
}
