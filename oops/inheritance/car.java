package oops.inheritance;
public class car{
    void model(){
        System.out.println("Car is petrol/diesel/EV");
    }
    void color(){
        System.out.println("Black");
    }
}
 class Honda extends car{
    void model(){
        System.out.println("Car is petrol");
    }
    
}

class Toyota extends car{
    void model(){
        System.out.println("Car is EV");
    }
}
class Main {
    public static void main(String[] args) {
        Honda myCar ;
        myCar = new Honda();
       // myCar.model();
        
        //myCar = new Toyota();
        //myCar.model();
       // myCar.tyre();
    } 
}

