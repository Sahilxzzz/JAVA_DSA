package Functions;

public class area_circum_circle {
    public static void main(String[] args) {
        
    int r = 7;
    double pi = 3.14;

    int area = area();
    double circum = circum();

    System.out.println(area);
    System.out.println(circum);
}
    static int area(){
        int r = 7;
        double pi = 3.14;
        int area = (int)(pi*r*r);
        
        return area;
    }

    static double circum(){
        int r = 7;
        double pi = 3.14;
        double circum = 2*pi*r;
    
        return circum;
    }
}


