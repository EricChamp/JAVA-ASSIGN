import java.util.Scanner;

public class MobileMoneyMenu {
 public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int choice;
    do {
System.out.println();
System.out.println("-----Mobile Mobile Menu-----");
    System.out.println("1.Send Money");
    System.out.println("2.Check Balance");
    System.out.println("3.Buy Airtime");
    System.out.println("0.Exit");

System.out.println("Choice an option: ");

choice = input.nextInt();
          switch (choice) {
            case 1: System.out.println("");
                
                break;
                case 2: System.out.println("Your balance is UGX 125,000.");
                
                break;
                case 3: System.out.println("Enter phone number and airtime amount...");
                
                break;
                case 0: System.out.println("Thanks for using MobileMoney.");
                
                break;
          
            default:
                System.out.println("Invalid option try again.");
                break;
          }


    } while (choice != 0); {
       System.out.println("Continue"); 
    }
input.close();
 }
}

