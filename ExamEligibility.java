import java.util.Scanner;

public class ExamEligibility {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     
    System.out.println("Enter percentage attendence: ");
    double attendence= input.nextDouble();

    if (attendence>=75) {
      System.out.println( "Eligible for Exams.");  
    } else if (attendence>=60) { 
        System.out.println("Eligible with a warning letter.");
    } 
    else  {

        System.out.println("Not Eligible for Exams- See the Dean of Students");
    }

    input.close();
}
    
}