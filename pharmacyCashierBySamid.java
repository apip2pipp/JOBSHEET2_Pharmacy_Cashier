import java.util.Scanner;

public class pharmacyCashierBySamid {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("= = = = = = = = = = = = = = = = = = = = = = =");
System.out.println(       "WELCOME TO PHARMACY CASHIER           ");
System.out.println("= = = = = = = = = = = = = = = = = = = = = = =");
System.out.println(            "MEDICINE TYPE                    ");
System.out.println("= = = = = = = = = = = = = = = = = = = = = = =");
System.out.println(        "1. Mefinal      (Rp 5.000)           ");
System.out.println(        "2. Promag       (Rp 4.000)           ");
System.out.println(        "3. Neozep       (Rp 4.000)           ");
System.out.println(        "4. Demacolin    (Rp 6.000)           ");
System.out.println(        "5. Finished Order                    ");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = =");

        System.out.print("Medicine Type (1/2/3/4/5): ");
        int medicine = input.nextInt();

        System.out.print("Total medicine : ");
        int amount_medicine = input.nextInt();

        int totalMedic = 0; // Initialize totalMedic to 0

        switch (medicine) {
            case 1:
                totalMedic = amount_medicine * 5000;
                System.out.println("Mefinal " + amount_medicine + " + 5000 : Rp" + totalMedic);
                break;
            case 2:
                totalMedic = amount_medicine * 4000;
                System.out.println("Promag " + amount_medicine + " + 4000 : Rp" + totalMedic);
                break;
            case 3:
                totalMedic = amount_medicine * 4000;
                System.out.println("Neozep " + amount_medicine + " + 4000 : Rp" + totalMedic);
                break;
            case 4:
                totalMedic = amount_medicine * 6000;
                System.out.println("Demacolin " + amount_medicine + " + 6000 : Rp" + totalMedic);
                break;
            default:
                System.out.println("Your selection is invalid, please select an available medicine.");
                break;
        }

        System.out.println("Your Total Shopping: Rp" + totalMedic);

        System.out.print("Input Amount Of Money : Rp ");
        int totalPrice = input.nextInt();

        if (totalPrice >= totalMedic) {
            int change = totalPrice - totalMedic;
            System.out.println("Thank you for your purchase, this is your total change: Rp " + change);
        } else {
            System.out.println("Sorry, your purchase is not eligible. Please try again.");
        }

        input.close();
    }
}
