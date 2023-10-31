/**
 * pharmacyCashier
 */
import java.util.Scanner;
public class pharmacyCashier {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Pharmacy JTI");
            int totalPrice, change, option, totalMedic=0;

            while (true) {
                System.out.println();
                System.out.println(" Medicine Type");
                System.out.println("1. Mefinal      (Rp 5.000)");
                System.out.println("2. Promag       (Rp 4.000)");
                System.out.println("3. Neozep       (Rp 4.000)");
                System.out.println("4. Demacolin    (Rp 6.000)");
                System.out.println("5. Finished Order");

                System.out.print("Medicine Type (1/2/3/4/5): ");
                option = input.nextInt();

                System.out.println();

                if (option == 1) {
                    totalMedic += 5000;
                } else if (option == 2) {
                    totalMedic += 4000;
                } else if (option == 3) {
                    totalMedic += 4000;
                } else if (option == 4) {
                    totalMedic += 6000;
                } else if (option ==5) {
                    break;
                } else {
                    System.out.println(" Your selection is invalid, Please select an available medicine.");
                }
                
                System.out.println();
                System.out.println("Your Total Shopping: Rp" + totalMedic);

            }

            System.out.print(" Input Amount Of Money : Rp ");
            totalPrice = input.nextInt();

            if (totalPrice >= totalMedic) {
                change = totalPrice - totalMedic;
                System.out.println("Thank you for your purchase, this is your total change: Rp " + change);
            } else {
                System.out.println("Sorry your purchase is not eligible, Please try again.");
            }
        }
    }
}