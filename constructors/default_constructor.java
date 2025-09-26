package constructors;

class Student{
    String name;
    int id;

    Student(){
        name = "Sahil";
        id = 25;
    }
}

public class default_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.id);
    }
}
