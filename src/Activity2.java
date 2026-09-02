
import  java.util.Scanner;

public class Activity2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CINEMA TICKET SYSTEM ===");

        System.out.print(("Select Format (1: REGULAR, 2: 3D, 3: IMAX): "));
        int format = sc.nextInt();

        System.out.print("Enter Screening Hour (24-hour Format, e.g, 18): ");
        int hour = sc.nextInt();

        double BasePrice;
        String FormatName;

        switch (format){
            case 1:
                FormatName = "REGULAR";
                BasePrice = 350;
                break;

            case 2:
                FormatName = "3D";
                BasePrice = 400;
                break;

            case 3:
                FormatName = "IMAX";
                BasePrice = 450;
                break;

            default:
                System.out.println("Invalid Format!");
                return;
        }

        double PeakFee = 0;
                if (hour >= 17 && hour <= 20){
                    PeakFee = 50;
                }

        double TotalCost = BasePrice + PeakFee;

        System.out.println("--- TICKET BREAKDOWN ---");
        System.out.println("Screening Format: " + FormatName);
        System.out.printf("Base Ticket Price: PHP %.2f%n", BasePrice);
        System.out.printf("Peak Hour Fee:     PHP %.2f%n", PeakFee);
        System.out.println("--------------------------------");
        System.out.printf("TOTAL TICKET COST:     PHP %.2f%n", TotalCost);
        System.out.println("STATUS:            SEAT RESERVED");



    }


}
