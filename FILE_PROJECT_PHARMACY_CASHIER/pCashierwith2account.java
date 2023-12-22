import java.util.Scanner;

/**
 * test2
 */
public class pCashierwith2account {

    static int choice;
    static boolean quit = false;

    // DEKLARASI KALKULASI HARGA OBAT (FITUR 2)
    static int price = 0;
    static int price_item[] = { 2000, 3500, 5900, 4000, 3300, 2500, 5000, 1500, 3000, 2500, 3500, 4000, 2500, 4500, 3500 };
    static String menu = null;
    static String selected;
    static int total;
    static int input_item;
    static int amount;
    static int paying;

    // MEDICINE DETAIL
    static int MedicineDetail;

    // PAYMENT METHOD
    static String methodPayment;

    // DISCOUNT CALCULATION
    static int assuranceType;
    static double discount = 0;
    static double discountperList;
    static int totHarga;
    static double totDiscount;
    static int pembayaran;
    static double change;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("LOGGED IN WITH AN ACCOUNT?");
            System.out.println("1.Kasir");
            System.out.println("2.Manager");
            System.out.print("Choose (1/2) : ");
            int choose1 = scanner.nextInt();
            switch (choose1) {
                case 1:
                    tamplianKasir();
                    break;
                case 2:
                    tampilanManager();
                default:
                    break;

            }
        } while (!quit);
        
    }

    static void tamplianKasir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("||================================================||");
        System.out.println("||                      WELCOME TO                ||");
        System.out.println("||                  JTI PHARMACY CASHIER          ||");
        System.out.println("||================================================||");
        System.out.println();

        do {
            menu();

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    medicineDetail(scanner);
                    break;
                case 2:
                    purchaaseTotal(scanner);
                    break;
                case 3:
                    paymentMethod(scanner);

                case 4:
                    typeOfassurance(scanner);
                    break;
                case 5:
                    System.out.println("back menu login");
                    return;
                case 6:
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

    public static void menu() {
        System.out.println("-----------------==||||| MENU ||||==----------------");
        System.out.println("1. MEDICINE DETIAL SEARCHING");
        System.out.println("2. PURCHASE TOTAL MEDICINE ");
        System.out.println("3. METHOD PAYMENT ");
        System.out.println("4. CALCULATE DISKON WITH ASSURANCE");
        System.out.println("5. BACK TO LOGIN ACCOUNT");
        System.out.println("6. EXIT PROGRAM");
        System.out.print("Choose the menu (1/2/3/4/5/6) : ");

    }

    public static void medicineDetail(Scanner sc) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println();
        System.out.println("========================================================================================");
        System.out.println("===============================!!!!! Directions for use !!!!!===========================");
        System.out.println("========================================================================================\n"); 
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
            System.out.print(
                    "CHOOSE THE MEDICINE YOU WANT TO KNOW (1/2/3/4/5/6/7/8/9/10/11/12/13/14/15 (16 Go back to menu) : ");
            MedicineDetail = sc1.nextInt();
            System.out.println();
            if (MedicineDetail == 1) {
                System.out.println("============================== PROMAG =============================");
                System.out.println("Class of drug     : Obat bebas");
                System.out.println("Benefits          : Mengatasi sakit maag, GERD, dan perut kembung");
                System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥6 tahun");
                System.out.println("===================================================================");
                System.out.println();
            } else if (MedicineDetail == 2) {
                System.out.println("=============================== DEMACOLIN =========================");
                System.out.println("Class of drug     : Obat bebas terbatas");
                System.out.println("Benefits          : Meringankan gejala flu ");
                System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥6 tahun");
                System.out.println("===================================================================");
                System.out.println();
            } else if (MedicineDetail == 3) {
                System.out.println("============================ ASAM MEFENAMAT =============================");
                System.out.println("Class of drug     : Obat resep");
                System.out.println("Benefits          : Meredakan nyeri dan peradangan");
                System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥14 tahun");
                System.out.println("=========================================================================");
                System.out.println();
            } else if (MedicineDetail == 4) {
                System.out.println("============================== VITACIMIN =================================");
                System.out.println("Class of drug     : Obat bebas dan resep");
                System.out.println("Benefits          : Mencegah dan mengatasi kekurangan vitamin C");
                System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥6 tahun");
                System.out.println("=========================================================================");
                System.out.println();
            } else if (MedicineDetail == 5) {
                System.out.println("================================= NEOZEP =============================");
                System.out.println("Class of drug     : Obat bebas terbatas");
                System.out.println("Benefits          : Meredakan gejala flu");
                System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥6 tahun");
                System.out.println("======================================================================");
                System.out.println();
            } else if (MedicineDetail == 6) {
                System.out.println("================================ PANADOL =====================================");
                System.out.println("Class of drug     : Obat bebas dan obat bebas terbatas");
                System.out.println("Benefits          : Meredakan demam, gejala flu, sakit kepala, dan sakit gigi");
                System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥6 tahun");
                System.out.println("==============================================================================");
                System.out.println();
            } else if (MedicineDetail == 7) {
                System.out.println("========================== PARACETAMOL ============================");
                System.out.println("Class of drug     : Obat bebas");
                System.out.println("Benefits          : Meredakan demam dan nyeri");
                System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥6 tahun");
                System.out.println("===================================================================");
                System.out.println();
            } else if (MedicineDetail == 8) {
                System.out.println("========================== MENSES ==================================");
                System.out.println("Class of drug     : Obat Haid");
                System.out.println("Benefits          : Mengatasi nyeri/keram pada perut");
                System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥10 tahun");
                System.out.println("====================================================================");
                System.out.println();
            } else if (MedicineDetail == 9) {
                System.out.println("========================== AMBEVEN ================================");
                System.out.println("Class of drug     : Obat Wasir");
                System.out.println("Benefits          : Mengatasi nyeri pada dubur");
                System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥10 tahun");
                System.out.println("===================================================================");
                System.out.println();
            } else if (MedicineDetail == 10) {
                System.out.println("========================== MIXAGRIB ===============================");
                System.out.println("Class of drug     : Obat bebas terbatas");
                System.out.println("Benefits          : Meredakan gejala flu");
                System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥10 tahun");
                System.out.println("===================================================================");
                System.out.println();
            } else if (MedicineDetail == 11) {
                System.out.println("======================================== INPEPSA =================================");
                System.out.println("Class of drug     : Obat Resep");
                System.out.println("Benefits          : Mengatasi tukak lambung, ulkus duodenum, atau gastritis kronis");
                System.out.println("To be consumed by : Dewasa ");
                System.out.println(
                        "====================================================================================");
                System.out.println();
            } else if (MedicineDetail == 12) {
                System.out.println("================================ ANTIMO =================================");
                System.out.println("Class of drug     : Obat bebas terbatas");
                System.out.println("Benefits          : Meredakan mabuk perjalanan dan gejala masuk angin");
                System.out.println("To be consumed by : Dewasa dan anak-anak ");
                System.out.println("=========================================================================");
                System.out.println();
            } else if (MedicineDetail == 13) {
                System.out.println("============================= AMPICILIN ===============================");
                System.out.println("Class of drug     : Antibiotik penisilin");
                System.out.println("Benefits          : Mengobati infeksi bakteri");
                System.out.println("To be consumed by : Dewasa dan anak-anak ");
                System.out.println("=======================================================================");
                System.out.println();
            } else if (MedicineDetail == 14) {
                System.out.println("=========================== EverE250 ===============================");
                System.out.println("Class of drug     : Multivitamin");
                System.out.println("Benefits          : Menjaga Kesehatan Kulit ");
                System.out.println("To be consumed by : Dewasa dan anak-anak ");
                System.out.println("===================================================================");
                System.out.println();
            } else if (MedicineDetail == 15) {
                System.out.println("========================== CENTRIZINE ============================");
                System.out.println("Class of drug     : Obat Resep");
                System.out.println("Benefits          : Meredakan gejala alergi");
                System.out.println("To be consumed by : Dewasa dan anak-anak usia  ≥2 tahun");
                System.out.println("===================================================================");
                System.out.println();
            } else if (MedicineDetail == 16) {
                break;
            } else {
                System.out.println("YOUR SELECTION IS INVALID, Please select correctly.");
                System.out.println();
                continue;
            }
        }
    }

    public static void purchaaseTotal(Scanner sc) {
        Scanner sc2 = new Scanner(System.in);
        while (true) {
            for (selected = "Y"; selected.equals("Y") || selected.equals("y");) {
                System.out.println("");
                System.out.println("|_______________________________________________|");
                System.out.println("|                       MENU                    |");
                System.out.println("|                   PHARMACY JTI                |");
                System.out.println("|_______________________________________________|");
                System.out.println("|          Name               |     Price       |");
                System.out.println("|_____________________________|_________________|");
                System.out.println("| 1. Promag                   |   Rp 2000       |");
                System.out.println("| 2. Demacolin                |   Rp 3500       |");
                System.out.println("| 3. Asam Mefenamat           |   Rp 5900       |");
                System.out.println("| 4. Viticaimin               |   Rp 4000       |");
                System.out.println("| 5. Neozep                   |   Rp 3300       |");
                System.out.println("| 6. Panadol                  |   Rp 2500       |");
                System.out.println("| 7. Paractemol               |   Rp 5000       |");
                System.out.println("| 8. Menses                   |   Rp 1500       |");
                System.out.println("| 9. Ambeven                  |   Rp 3000       |");
                System.out.println("| 10. Mixagrib                |   Rp 2500       |");
                System.out.println("| 11. Inpespa                 |   Rp 3500       |");
                System.out.println("| 12. Antimo                  |   Rp 4000       |");
                System.out.println("| 13. Ampicilin               |   Rp 2500       |");
                System.out.println("| 14. EverE250                |   Rp 4500       |");
                System.out.println("| 15. CENTERIZINE             |   Rp 3500       |");
                System.out.println("|_____________________________|_________________|");
                System.out.println("");

                System.out.println("________________________________________________");
                System.out.print("Enter Item Number : ");
                input_item = sc2.nextInt();

                System.out.print("Enter the number of Items: ");
                amount = sc2.nextInt();
                System.out.println("________________________________________________");

                if (input_item == 1) {
                    menu = " promag ";
                    price = price + price_item[0] * amount;
                    total = price_item[0] * amount;
                    System.out.println("Your Order Menu : " + menu + "    x" + amount + "   |  Rp. " + total);

                } else if (input_item == 2) {
                    menu = " Demacolin ";
                    price = price + price_item[1] * amount;
                    total = price_item[1] * amount;
                    System.out.println("Your Order Menu : " + menu + "    x" + amount + "   |  Rp. " + total);
                } else if (input_item == 3) {
                    menu = " Asamnefenamat ";
                    price = price + price_item[2] * amount;
                    total = price_item[2] * amount;
                    System.out.println("Your Order Menu : " + menu + "    x" + amount + "   |  Rp. " + total);
                } else if (input_item == 4) {
                    menu = " Vitacimin ";
                    price = price + price_item[3] * amount;
                    total = price_item[3] * amount;
                    System.out.println("Your Order Menu : " + menu + "    x" + amount + "   |  Rp. " + total);
                } else if (input_item == 5) {
                    menu = " Neozep ";
                    price = price + price_item[4] * amount;
                    total = price_item[4] * amount;
                    System.out.println("Your Order Menu : " + menu + "    x" + amount + "   |  Rp. " + total);
                } else if (input_item == 6) {
                    menu = " panadol ";
                    price = price + price_item[5] * amount;
                    total = price_item[5] * amount;
                    System.out.println("Your Order Menu : " + menu + "    x" + amount + "   |  Rp. " + total);
                } else if (input_item == 7) {
                    menu = " Paracetamol ";
                    price = price + price_item[6] * amount;
                    total = price_item[6] * amount;
                    System.out.println("Your Order Menu : " + menu + "    x" + amount + "   |  Rp. " + total);
                } else if (input_item == 8) {
                    menu = " Menses ";
                    price = price + price_item[7] * amount;
                    total = price_item[7] * amount;
                    System.out.println("Your Order Menu : " + menu + "    x" + amount + "   |  Rp. " + total);
                } else if (input_item == 9) {
                    menu = " Ambeven ";
                    price = price + price_item[8] * amount;
                    total = price_item[8] * amount;
                    System.out.println("Your Order Menu : " + menu + "    x" + amount + "   |  Rp. " + total);
                } else if (input_item == 10) {
                    menu = " Mixagrib ";
                    price = price + price_item[9] * amount;
                    total = price_item[9] * amount;
                    System.out.println("Your Order Menu : " + menu + "    x" + amount + "   |  Rp. " + total);
                } else if (input_item == 11) {
                    menu = " Insepsa ";
                    price = price + price_item[10] * amount;
                    total = price_item[10] * amount;
                    System.out.println("Your Order Menu : " + menu + "    x" + amount + "   |  Rp. " + total);
                } else if (input_item == 12) {
                    menu = " Antimo ";
                    price = price + price_item[11] * amount;
                    total = price_item[11] * amount;
                    System.out.println("Your Order Menu : " + menu + "    x" + amount + "   |  Rp. " + total);
                } else if (input_item == 13) {
                    menu = " Ampicilin ";
                    price = price + price_item[12] * amount;
                    total = price_item[12] * amount;
                    System.out.println("Your Order Menu : " + menu + "    x" + amount + "   |  Rp. " + total);
                } else if (input_item == 14) {
                    menu = " EverE250 ";
                    price = price + price_item[13] * amount;
                    total = price_item[13] * amount;
                    System.out.println("Your Order Menu : " + menu + "    x" + amount + "   |  Rp. " + total);
                } else if (input_item == 15) {
                    menu = " Centerizine ";
                    price = price + price_item[14] * amount;
                    total = price_item[14] * amount;
                    System.out.println("Your Order Menu : " + menu + "    x" + amount + "   |  Rp. " + total);
                } else {
                    System.out.println("The menu you selected is not available.");
                }
                System.out.print("Would you like to order again? ? (Y/T) : ");
                selected = sc2.next();
            }
            
            paying = price;

            System.out.println();
            System.out.println("________________________________________________");
            System.out.println("                   PAYMENT AMOUNT               ");
            System.out.println("                        " + price);
            System.out.println("________________________________________________");
            System.out.println();
            break;
        }
    }

    public static void paymentMethod(Scanner sc) {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("________________________________________________");
        System.out.println("===================PAYMENT METHOD===============");
        System.out.println("________________________________________________");
        System.out.println("                    QRIS / TUNAI                ");
        System.out.println("________________________________________________");
        System.out.print("Choose payment method (Qris/Tunai) :");
        methodPayment = sc3.next();
    }

    public static void typeOfassurance(Scanner sc) {
        Scanner sc4 = new Scanner(System.in);
        while (true) {
            System.out.println("--- ASURANCE TYPE---");
            System.out.println("1. Allianz");
            System.out.println("2. BPJS");
            System.out.println("3. PDW");
            System.out.println("4. PRUDENTIAL");
            System.out.println("5. Not have assurance");
            System.out.print("CHOOSE MENU ASSURANCE TYPE (1/2/3/4/5) : ");
            
            assuranceType = sc4.nextInt();

            
            switch (assuranceType) {
                case 1:
                    discountperList = 0.10;
                    break;
                case 2:
                    discountperList = 0.20;
                    break;
                case 3:
                    discountperList = 0.30;
                    break;
                case 4:
                    discountperList = 0.40;
                    break;
                case 5:
                    discountperList = 0.00;
                    break;
                default:
                    System.out.println("invalid assurance type");
                    continue;
            }
            System.out.print("Input total price : ");
            totHarga = sc4.nextInt();

            discount = totHarga * discountperList;
            totDiscount = totHarga - discount;

            System.out.println();
            System.out.println("________________________________________________");
            System.out.println("Total kalkulasi harga barang    : Rp." + totHarga);
            System.out.println("Total Diskon                    : Rp." + discount);
            System.out.println("Total yang harus anda bayar     : Rp." + totDiscount);
            System.out.println("________________________________________________");
            System.out.print("Jumlah uang yang diberikan      :  RP.");
            pembayaran = sc4.nextInt();
            change = pembayaran - totDiscount;
            System.out.println("Metode pembayaran               :     " + methodPayment);
            System.out.println("Kembalian Anda Sebesar          :  Rp." + change);
            System.out.println("________________________________________________");
            System.out.println("           Terimakasih atas kunjungannya.       ");
            System.out.println("________________________________________________");
            System.out.println();
            break;
        }
        
    }

    // Declration of displayManager

    static int jumlahKasir = 3;
    static int jumlahBulan = 3;
    static String[] namaKasir = new String[jumlahKasir];
    static double[][] totalPendapatan = new double[jumlahKasir][jumlahBulan];
    static double[] pendapatanKasir = new double[jumlahKasir];

    static void tampilanManager() {
        do {
            Scanner sc8 = new Scanner(System.in);
            System.out.println("============     SELAMAT DATANG      ============");
            System.out.println("|       1. TENTANG PENDAPATAN APOTEK            |");
            System.out.println("|       2. KEMBALI                              |");
            System.out.println("|       3. EXIT PROGRAM                         |");
            System.out.println("------------------------------------------------");
            System.out.print("Choose the menu (1/2/3): ");
            int choose3 = sc8.nextInt();

            switch (choose3) {
                case 1:
                    feedbackInput();
                    reportValue();
                    break;
                case 2:
                    System.out.println("BACK LOGIN MENU!");
                    return;
                case 3:
                    System.out.println("Thank you for using our program!");
                    quit = true;
                    break;
                default:
                    System.out.println("Pilihan anda Tidak valid , pilih 1-2");
                    break;
            }
        } while (!quit);

    }

    static void reportValue() {
        System.out.println("\n============ BERIKUT TAMPILAN PENDAPATAN DARI APOTEK ===============");
        for (int i = 0; i < jumlahKasir; i++) {
            System.out.print("Kasir ke-" + (i + 1) + " (" + namaKasir[i] + "): ");
            System.out.println(pendapatanKasir[i]);
        }
    }

    static void feedbackInput() {
        Scanner sc9 = new Scanner(System.in);
        for (int i = 0; i < jumlahKasir; i++) {
            System.out.println("======== Masukkan nama penanggung jawab kasir ke-" + (i + 1) + " =========");
            namaKasir[i] = sc9.next();

            for (int bulan = 0; bulan < jumlahBulan; bulan++) {
                System.out.println(
                        "====== Input Pendapatan " + namaKasir[i] + " untuk Bulan ke-" + (bulan + 1) + " =======");
                double totalPendapatanBulan = 0.0;

                for (int minggu = 0; minggu < 4; minggu++) {
                    System.out.print("Pendapatan Kasir " + namaKasir[i] + " minggu ke-" + (minggu + 1) + ": ");
                    double pendapatanMingguan = sc9.nextDouble();
                    totalPendapatanBulan += pendapatanMingguan;
                }

                totalPendapatan[i][bulan] = totalPendapatanBulan;
                pendapatanKasir[i] += totalPendapatanBulan;
            }
        }
        
    }

}