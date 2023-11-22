/**
 * pharmacyCashier
 */
import java.util.Scanner;
public class pharmacyCashierUpdate1 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            //Akses login
            System.out.println("= = = = = = ");
            System.out.print("USER ID : ");
            String userid = input.next();
            System.out.println("= = = = = = ");
    
            System.out.println("= = = = = = ");
            System.out.print("PASS ID : ");
            String passid = input.next();
            System.out.println("= = = = = = ");
    
            System.out.println();

            //Tamplian utama
            System.out.println("= = = = = = = = = = = = = = =");
            System.out.println("WELCOME TO PHARMACY CASHIER");
            System.out.println("= = = = = = = = = = = = = = =");
            int totalPrice, change, option, totalMedic=0;

            //Menu Display Tipe obat
            while (true) {
                System.out.println("= = = = = = = = = = = = = =");
                System.out.println("= = = = MEDICINE TYPE = = =");
                System.out.println("= = = = = = = = = = = = = =");
                System.out.println("1. Mefinal      (Rp 5.000)");
                System.out.println("2. Promag       (Rp 4.000)");
                System.out.println("3. Neozep       (Rp 4.000)");
                System.out.println("4. Demacolin    (Rp 6.000)");
                System.out.println("5. Finished Order");

                System.out.print("Medicine Type (1/2/3/4/5): ");
                option = input.nextInt();

                System.out.println();

                //Kalkulasi atau Hasil Looping Harga barang
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
                    System.out.println("Your selection is invalid, Please select an available medicine.");
                }
                
                // Kalkulasi Total Harga
                System.out.println();
                System.out.println("= = = = = = = = = = = = = =");
                System.out.println("Your Total Shopping: Rp" + totalMedic);
                System.out.println("= = = = = = = = = = = = = =");
                System.out.println();
                
                // Kalkulasi diskon dari asuransi kesehatan
                System.out.println("= = = = = = = = = = = = = =");
                System.out.println("= = = = ASURANCE TYPE = = =");
                System.out.println("= = = = = = = = = = = = = =");
                System.out.println("1. ALLIANZ DISC ");
                System.out.println("2. BPJS DISC ");
                System.out.println("3. PRUDENTIAL DISC ");
                System.out.println("5. Finished Order");

                System.out.print("Asurance Type (1/2/3/5): ");
                option = input.nextInt();

                System.out.println();

                
                if (option == 1) {
                    totalMedic += 5000;
                } else if (option == 2) {
                    totalMedic += 4000;
                } else if (option == 3) {
                    totalMedic += 4000;
                } else if (option ==5) {
                    break;
                } else {
                    System.out.println("Your selection is invalid, Please select an availeble TYPE OF ASURANCE.");
                }
            }

            // TOTAL HARGA OBAT DI KURANGI DISKON (RUMUS DISKON DARI HARGA)

            

            //Kalkulasi Kembalian dari Total uang yang di input
            System.out.println("= = = = = = = = = = = = = = =");
            System.out.print("Input Amount Of Money : Rp ");
            totalPrice = input.nextInt();
            System.out.println("= = = = = = = = = = = = = = =");

            System.out.println();

            if (totalPrice >= totalMedic) {
                change = totalPrice - totalMedic;

                System.out.println("= = = = = = = = = = = = = =");
                System.out.println("THANK YOU FOR YOUR PURCHASE");
                System.out.println("= = = = = = = = = = = = = =");

                System.out.println();

                System.out.println("= = = = = = = = = = = = = = = = = = = ");
                System.out.println("THIS IS YOUR TOTAL CHANGE: Rp " + change);
                System.out.println("= = = = = = = = = = = = = = = = = = = ");
            } else {
                System.out.println("Sorry your purchase is not eligible, Please try again.");
            }
            input.close();
        }
    }
} 