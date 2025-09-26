package Functions;


import java.util.Scanner;

public class marks_subject {
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();

        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
           
        }
        
        System.out.println("Total MArks : " + totalMarks);
        // Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;
        System.out.println("Percentage : " + percentage);
        if (percentage % 10  == 0) {
         percentage--;
        }
        switch ((int) percentage  / 10) {
        case 9:
            System.out.println("Grade : AA");
            break;
        case 8:
            System.out.println("Grade : AB");
        case 7:
            System.out.println("Grade :BB");
            break;
        case 6:
            System.out.println("Grade : BC");
            break;
        case 5:
            System.out.println("Grade : CD");
            break;
        case 4:
            System.out.println("Grade : DD");
            break;
        default:
            System.out.println("Grade : Fail");
        }
    }
}