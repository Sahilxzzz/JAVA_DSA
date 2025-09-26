/*public class arrays {
    public static void main (String []args){
        String [] car = {"LAMBO", "Porsche","Buggati"};

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[0]);

    }
}}

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int number[] = new int[size];

        for ( int i=0; i<size; i++) {
            System.out.print("Enter the array nos: " );
            number[i] = sc.nextInt();
            
    }
        for (int i=0; i<size; i++){
            System.out.println(number[i]);
            
        }
        System.out.println(" the array is: " +  number);
}
}

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();  // Fixed: size is an int, not int[]

        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            number[i] = sc.nextInt();
        }

        System.out.print("Find the place of the number: ");
        int x =  sc.nextInt();


        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(number[i]);
        }
        System.out.println("");
        System.out.print("The elements of x found  at index: " );
        for (int i = 0; i < number.length; i++) {
             if (number[i] == x) {
                System.out.print(i);
        }
    }
        sc.close();  // Good practice to close the scanner
    }
}


import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        String names[] = new String[size];

        for (int i=0;i<size;i++){
            names[i] = sc.next();
        }

        for(int i=0;i<size;i++){
            System.out.println(names[i]);
        }
    }
}



import java.util.*;


public class arrays {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];


      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }


      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
     
       for(int i=0; i<numbers.length; i++) {
           if(numbers[i] < min) {
               min = numbers[i];
           }
           if(numbers[i] > max) {
               max = numbers[i];
           }
       }
 System.out.println("Max: " + max);
 System.out.println("Min: " + min);
 }
 }
*/

import java.util.*;


public class arrays {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];


      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }


      boolean isAscending = true;
 for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
           if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
               isAscending = false;
           }
       }


       if(isAscending) {
           System.out.println("The array is sorted in ascending order");
       } else {
           System.out.println("The array is not sorted in ascending order");
       }
      
   }
}
