import java.util.Scanner;
public class test {

    public static void main(String[] args) {
        //DEKLARASI MENU
        int choice;
        boolean quit = false;

        //DEKLARASI KALKULASI HARGA OBAT (FITUR 2)
        int price =0;
        int price_item[] = {2000, 3500, 5900, 4000, 3300, 2500, 5000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000};
        String menu = null;
        String selected;
        int total;
        int input_item;
        int amount;
        int paying;

        //MEDICINE DETAIL
        int MedicineDetail;

        //PAYMENT METHOD
        int methodPayment;

        // DISCOUNT CALCULATION
        int assuranceType;
        double Discon=0;
        double discountPercetage;
        int totHarga;
        double totDisount;
        int pembayaran;
        double change;


        do {
            printMenu();
            
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                System.out.println();
                System.out.println("!!!!! Directions for use !!!!!");
                System.out.println("- Read the ingredients, rules and instructions for use of the medicine before taking it.");
                System.out.println("- Always talk to your doctor about any allergies you have before starting any medication.");
                System.out.println("- Consult your doctor if in doubt about the use of the medicine.");
                System.out.println("- Pay attention to the expiration date of the medicine, and discard the medicine if it has passed the expiration date.");
                System.out.println();
                while (true) {
                    System.out.println("++ Knowing Of Medicine : ++");
                    System.out.println("1. PROMAG");
                    System.out.println("2. DEMACOLIN");
                    System.out.println("3. Asam Mefenamat");
                    System.out.println("4. VITACIMIN");
                    System.out.println("5. NEOZEP");
                    System.out.println("6. PANADOL");
                    System.out.println("7. PARACETAMOL");
                    System.out.println("8. MENSES");
                    System.out.println("9. AMBEVEN");
                    System.out.println("10. MIXAGRIB");
                    System.out.println("11. INPEPSA");
                    System.out.println("12. ANTIMO");
                    System.out.println("13. AMPICILIN");
                    System.out.println("14. EverE250");
                    System.out.println("15. CENTRIZINE");
                    System.out.println("16. back to menu ");
                    System.out.println("===================================================================");
                    System.out.print("CHOOSE THE MEDICINE YOU WANT TO KNOW (1/2/3/4/5/6/7/8/9/10/11/12/13/14/15/16.Go back to menu) : ");
                    MedicineDetail = scanner.nextInt();
                    System.out.println();
                    if (MedicineDetail == 1) {
                        System.out.println("============================== PROMAG =============================");
                        System.out.println("Class of drug     : Obat bebas");
                        System.out.println("Benefits          : Mengatasi sakit maag, GERD, dan perut kembung");
                        System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥6 tahun");
                        System.out.println("===================================================================");
                        System.out.println();
                        }else if(MedicineDetail ==2) {
                        System.out.println("=============================== DEMACOLIN =========================");
                        System.out.println("Class of drug     : Obat bebas terbatas");
                        System.out.println("Benefits          : Meringankan gejala flu ");
                        System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥6 tahun");
                        System.out.println("===================================================================");
                        System.out.println();
                        }else if(MedicineDetail == 3) {
                        System.out.println("============================ ASAM MEFENAMAT =============================");
                        System.out.println("Class of drug     : Obat resep");
                        System.out.println("Benefits          : Meredakan nyeri dan peradangan");
                        System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥14 tahun");
                        System.out.println("=========================================================================");
                        System.out.println();
                        }else if(MedicineDetail == 4){
                        System.out.println("============================== VITACIMIN =================================");
                        System.out.println("Class of drug     : Obat bebas dan resep");
                        System.out.println("Benefits          : Mencegah dan mengatasi kekurangan vitamin C");
                        System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥6 tahun");
                        System.out.println("=========================================================================");
                        System.out.println();
                        }else if(MedicineDetail == 5){
                        System.out.println("================================= NEOZEP =============================");
                        System.out.println("Class of drug     : Obat bebas terbatas");
                        System.out.println("Benefits          : Meredakan gejala flu");
                        System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥6 tahun");
                        System.out.println("======================================================================");
                        System.out.println();
                        }else if(MedicineDetail == 6){
                        System.out.println("================================ PANADOL =====================================");
                        System.out.println("Class of drug     : Obat bebas dan obat bebas terbatas");
                        System.out.println("Benefits          : Meredakan demam, gejala flu, sakit kepala, dan sakit gigi");
                        System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥6 tahun");
                        System.out.println("==============================================================================");
                        System.out.println();
                        }else if(MedicineDetail == 7){
                        System.out.println("========================== PARACETAMOL ============================");
                        System.out.println("Class of drug     : Obat bebas");
                        System.out.println("Benefits          : Meredakan demam dan nyeri");
                        System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥6 tahun");
                        System.out.println("===================================================================");
                        System.out.println();
                        }else if(MedicineDetail == 8){
                        System.out.println("========================== MENSES ==================================");
                        System.out.println("Class of drug     : Obat Haid");
                        System.out.println("Benefits          : Mengatasi nyeri/keram pada perut");
                        System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥10 tahun");
                        System.out.println("====================================================================");
                        System.out.println();
                        }else if(MedicineDetail == 9){
                        System.out.println("========================== AMBEVEN ================================");
                        System.out.println("Class of drug     : Obat Wasir");
                        System.out.println("Benefits          : Mengatasi nyeri pada dubur");
                        System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥10 tahun");
                        System.out.println("===================================================================");
                        System.out.println();
                        }else if(MedicineDetail == 10){
                        System.out.println("========================== MIXAGRIB ===============================");
                        System.out.println("Class of drug     : Obat bebas terbatas");
                        System.out.println("Benefits          : Meredakan gejala flu");
                        System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥10 tahun");
                        System.out.println("===================================================================");
                        System.out.println();
                        }else if(MedicineDetail == 11){
                        System.out.println("======================================== INPEPSA =================================");
                        System.out.println("Class of drug     : Obat Resep");
                        System.out.println("Benefits          : Mengatasi tukak lambung, ulkus duodenum, atau gastritis kronis");
                        System.out.println("To be consumed by : Dewasa ");
                        System.out.println("====================================================================================");
                        System.out.println();
                        }else if(MedicineDetail == 12){
                        System.out.println("================================ ANTIMO =================================");
                        System.out.println("Class of drug     : Obat bebas terbatas");
                        System.out.println("Benefits          : Meredakan mabuk perjalanan dan gejala masuk angin");
                        System.out.println("To be consumed by : Dewasa dan anak-anak ");
                        System.out.println("=========================================================================");
                        System.out.println();
                        }else if(MedicineDetail == 13){
                        System.out.println("============================= AMPICILIN ===============================");
                        System.out.println("Class of drug     : Antibiotik penisilin");
                        System.out.println("Benefits          : Mengobati infeksi bakteri");
                        System.out.println("To be consumed by : Dewasa dan anak-anak ");
                        System.out.println("=======================================================================");
                        System.out.println();
                        }else if(MedicineDetail == 14){
                        System.out.println("=========================== EverE250 ===============================");
                        System.out.println("Class of drug     : Multivitamin");
                        System.out.println("Benefits          : Menjaga Kesehatan Kulit ");
                        System.out.println("To be consumed by : Dewasa dan anak-anak ");
                        System.out.println("===================================================================");
                        System.out.println();
                        }else if(MedicineDetail == 15){
                        System.out.println("========================== CENTRIZINE ============================");
                        System.out.println("Class of drug     : Obat Resep");
                        System.out.println("Benefits          : Meredakan gejala alergi");
                        System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥2 tahun");
                        System.out.println("===================================================================");
                        System.out.println();   
                        }else if (MedicineDetail == 16){
                            break;
                            } else {
                                System.out.println("YOUR SELECTION IS INVALID, Please select correctly.");
                                System.out.println();
                            continue;
                            }
                        }
                        break;
                case 2:
                while (true) {
                for (selected = "Y"; selected.equals("Y")||selected.equals("y"); )
                {
                System.out.println("");
                System.out.println("|_______________________________________________|");
                System.out.println("|                       MENU                    |");
                System.out.println("|                   PHARMACY JTI                |");
                System.out.println("|_______________________________________________|");
                System.out.println("|          Name               |     Price       |");
                System.out.println("|_____________________________|_________________|");
                System.out.println("| 1. Promag                   |   Rp 20000      |");
                System.out.println("| 2. Demacolin                |   Rp 35000      |");
                System.out.println("| 3. Asam Mefenamat           |   Rp 59000      |");
                System.out.println("| 4. Viticaimin               |   Rp 63000      |");
                System.out.println("| 5. Neozep                   |   Rp 120000     |");
                System.out.println("| 6. Panadol                  |   Rp 180000     |");
                System.out.println("| 7. Paractemol               |   Rp 5000       |");
                System.out.println("| 8. Menses                   |   Rp 2000       |");
                System.out.println("| 9. Ambeven                  |   Rp 2000       |");
                System.out.println("| 10. Mixagrib                |   Rp 2000       |");
                System.out.println("| 11. Inpespa                 |   Rp 2000       |");
                System.out.println("| 12. Antimo                  |   Rp 2000       |");
                System.out.println("| 13. Ampicilin               |   Rp 2000       |");
                System.out.println("| 14. EverE250                |   Rp 2000       |");
                System.out.println("| 15. CENTERIZINE             |   Rp 2000       |");
                System.out.println("|_____________________________|_________________|");
                System.out.println("");

                System.out.println("________________________________________________");
                System.out.print ("Enter Item Number : ");
                input_item = scanner.nextInt();
                
                System.out.print("Enter the number of Items: ");
                amount = scanner.nextInt();
                System.out.println("________________________________________________");

                if (input_item == 1)
                {
                menu = " mefinal ";
                price = price + price_item[0] * amount;
                total= price_item[0] * amount;
                System.out.println("Your Order Menu : " + menu +"    x"+ amount+"   |  Rp. "+ total);
                
                }
                else if (input_item == 2)
                {
                menu = "promag ";
                price = price + price_item[1] * amount;
                total= price_item[1] * amount;
                System.out.println("Your Order Menu : " + menu +"    x"+ amount+"   |  Rp. "+ total);
                }
                else if (input_item == 3)
                {
                menu = " vitacimin ";
                price = price + price_item[2] * amount;
                total= price_item[2] * amount;
                System.out.println("Your Order Menu : " + menu +"    x"+ amount+"   |  Rp. "+ total);
                }
                else if (input_item == 4)
                {
                menu = " antangin ";
                price = price + price_item[3] * amount;
                total= price_item[3] * amount;
                System.out.println("Your Order Menu : " + menu +"    x"+ amount+"   |  Rp. "+ total);
                }
                else if (input_item == 5)
                {
                menu = " amoxcilin ";
                price = price + price_item[4] * amount;
                total= price_item[4] * amount;
                System.out.println("Your Order Menu : " + menu +"    x"+ amount+"   |  Rp. "+ total);
                }
                else if (input_item == 6)
                {
                menu = " madu tj ";
                price = price + price_item[5] * amount;
                total= price_item[5] * amount;
                System.out.println("Your Order Menu : " + menu +"    x"+ amount+"   |  Rp. "+ total);
                }
                else if (input_item == 7)
                {
                menu = " Handsaplast ";
                price = price + price_item[6] * amount;
                total= price_item[6] * amount;
                System.out.println("Your Order Menu : " + menu +"    x"+ amount+"   |  Rp. "+ total);
                }
                else if (input_item == 8)
                {
                menu = " Obat penambah darah ";
                price = price + price_item[7] * amount;
                total= price_item[7] * amount;
                System.out.println("Your Order Menu : " + menu +"    x"+ amount+"   |  Rp. "+ total);
                }
                else if (input_item == 9)
                {
                menu = " Obat penambah darah ";
                price = price + price_item[8] * amount;
                total= price_item[8] * amount;
                System.out.println("Your Order Menu : " + menu +"    x"+ amount+"   |  Rp. "+ total);
                }
                else if (input_item == 10)
                {
                menu = " Obat penambah darah ";
                price = price + price_item[9] * amount;
                total= price_item[9] * amount;
                System.out.println("Your Order Menu : " + menu +"    x"+ amount+"   |  Rp. "+ total);
                }
                else if (input_item == 11)
                {
                menu = " Obat penambah darah ";
                price = price + price_item[10] * amount;
                total= price_item[10] * amount;
                System.out.println("Your Order Menu : " + menu +"    x"+ amount+"   |  Rp. "+ total);
                }
                else if (input_item == 12)
                {
                menu = " Obat penambah darah ";
                price = price + price_item[11] * amount;
                total= price_item[11] * amount;
                System.out.println("Your Order Menu : " + menu +"    x"+ amount+"   |  Rp. "+ total);
                }
                else if (input_item == 13)
                {
                menu = " Obat penambah darah ";
                price = price + price_item[12] * amount;
                total= price_item[12] * amount;
                System.out.println("Your Order Menu : " + menu +"    x"+ amount+"   |  Rp. "+ total);
                }
                else if (input_item == 14)
                {
                menu = " Obat penambah darah ";
                price = price + price_item[13] * amount;
                total= price_item[13] * amount;
                System.out.println("Your Order Menu : " + menu +"    x"+ amount+"   |  Rp. "+ total);
                }
                else if (input_item == 15)
                {
                menu = " Obat penambah darah ";
                price = price + price_item[14] * amount;
                total= price_item[14] * amount;
                System.out.println("Your Order Menu : " + menu +"    x"+ amount+"   |  Rp. "+ total);
                }
                else
                {
                System.out.println("The menu you selected is not available.");
                }
                System.out.print("Would you like to order again? ? (Y/T) : ");
                selected =scanner.next();    
                }
                
                paying = price;

                System.out.println();
                            System.out.println("________________________________________________");
                            System.out.println("                   PAYMENT AMOUNT               ");
                            System.out.println("                        "+price);
                            System.out.println("________________________________________________");
                            System.out.println();
                    break;
            }
            break;

                case 3:
                System.out.println("___________________PAYMENT METHOD_______________");
                System.out.println("1. QRIS ");
                System.out.println("2. Tunai");
                System.out.println("________________________________________________");
                System.out.print("Choose payment method (1/2) :");
                methodPayment = scanner.nextInt();
                switch (methodPayment) {
                    case 1:
                    System.out.println();
                    System.out.println("________________________________________________");
                    System.out.println("----------------------QRIS----------------------");
                    System.out.println("________________________________________________");
                    System.out.println();
                    break;
                    
                    case 2:
                    System.out.println();
                    System.out.println("________________________________________________");
                    System.out.println("---------------------TUNAI----------------------");
                    System.out.println("________________________________________________");
                    System.out.println();
                    break;
                }
                //break;
                case 4:
                    while (true) {
                        System.out.println("--- ASURANCE TYPE---");
                        System.out.println("1. Allianz");
                        System.out.println("2. BPJS");
                        System.out.println("3. PDW");
                        System.out.println("4. PRUDENTIAL");
                        System.out.println("5. Not have assurance");
                        System.out.print("CHOOSE MENU ASSURANCE TYPE (1/2/3/4/5) : ");
                        assuranceType = scanner.nextInt();

                        switch (assuranceType) {
                            case 1:
                                discountPercetage = 0.10;
                                break;
                            case 2:
                                discountPercetage = 0.20;
                                break;
                            case 3:
                                discountPercetage = 0.30;
                                break;
                            case 4:
                                discountPercetage = 0.40;
                                break;
                            case 5:
                            discountPercetage = 0.00;
                            break;
                            default:
                            System.out.println("invalid assurance type");
                            continue;
                        }
                        System.out.print("Input total price : ");
                        totHarga = scanner.nextInt();

                        Discon = totHarga * discountPercetage;
                        totDisount= totHarga - Discon;

                        System.out.println();
                        System.out.println("________________________________________________");
                        System.out.println("Total kalkulasi harga barang    : Rp."+ totHarga);
                        System.out.println("Total Diskon                    : Rp."+Discon);
                        System.out.println("Total yang harus anda bayar     : Rp."+ totDisount);
                        System.out.println("________________________________________________");
                        System.out.print  (" Jumlah uang yang diberikan   :  RP.");
                        pembayaran = scanner.nextInt();

                        change = pembayaran-totDisount;
                        System.out.println("Kembalian Anda Sebesar       :  Rp."+ change);
                        System.out.println("________________________________________________");
                        System.out.println("           Terimakasih atas kunjungannya.       ");
                        System.out.println("________________________________________________");
                        System.out.println();
                        break;
                    }
                    break;
                

                case 5:
                    System.out.println("Thank you for using our program!");
                    quit = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice, please try again!!!.");
                    break;
            }

        } while (!quit);
    }

    private static void printMenu() {
        System.out.println("||================================================||");
        System.out.println("||                      WELCOME TO                ||");
        System.out.println("||                  JTI PHARMACY CASHIER          ||");
        System.out.println("||================================================||");
        System.out.println();
        System.out.println("-----------------==||||| MENU ||||==----------------");
        System.out.println("1. MEDICINE DETIAL SEARCHING");
        System.out.println("2. PURCHASE TOTAL MEDICINE ");
        System.out.println("3. METHOD PAYMENT ");
        System.out.println("4. CALCULATE DISKON WITH ASSURANCE");
        System.out.println("5. Exit Program");
        System.out.print("Choose the menu (1/2/3/4/5) : ");
    }
}