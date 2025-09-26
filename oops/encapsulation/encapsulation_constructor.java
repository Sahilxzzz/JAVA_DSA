package oops.encapsulation;
class Area{
    private int length;
    private int width;


    public void getArea(){
        int area = length*width;
        System.out.println("Area "+ area);
    }
    
    Area(int l,int w){
        this.length = l;
        this.width = w;
    }
}


public class encapsulation_constructor {
    public static void main(String[] args) {
        Area rect = new Area(5, 6);
        rect.getArea();
    }
}
