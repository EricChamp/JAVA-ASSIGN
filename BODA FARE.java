import java.util.Scanner;

public class BodaFareTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double BASE_FARE = 2000.0;
        final double RATE_PER_KM = 500.0;

        System.out.println("Enter the maximum distance in km");
        int maxDistance = input.nextInt();

        System.out.println("Boda fare table");

        for(int distance = 1; distance <= maxDistance; distance++ ) {
            double fare = BASE_FARE+(RATE_PER_KM*distance);

            System.out.println(distance + " km->UGX "+fare);
        }

        input.close();
    }
}