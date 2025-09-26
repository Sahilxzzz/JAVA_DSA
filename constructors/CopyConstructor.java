package constructors;

class Student{
    String name;
    int id;

    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    Student(Student obj2){
        this.name = obj2.name;
        this.id = obj2.id;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Sahil",2005);
        System.out.println(s1.name+" "+ s1.id );

        Student s2 = new Student(s1);
    }
}
