import java.util.Scanner;
/**
 * pharmacyCashierupdate2
 */

public class PharmacyCashier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Akses login
        System.out.println("= = = = = = ");
        System.out.print("USER ID : ");
        String userid = sc.next();
        System.out.println("= = = = = = ");
        System.out.println("= = = = = = ");
        System.out.print("PASS ID : ");
        String passid = sc.next();
        System.out.println("= = = = = = ");
        System.out.println();
        System.out.println("===============================================");
        System.out.println("            WELCOME TO PHARMACY CASHIER        ");
        System.out.println("                   PHARMACY JTI                ");
        System.out.println("===============================================");
        System.out.println();
        
        //Menu (home)
        while (true) {
            System.out.println("==||||| MENU ||||==");
            System.out.println("1. Medicine detail search");
            System.out.println("2. Purchase and calculation of drugs");
            System.out.println("3. Payment Method");
            System.out.println("4. Exit Program");
            System.out.print("Choose the menu (1/2/3/4) : ");
            int chooseMenu = sc.nextInt();
            switch (chooseMenu) {
                //Detail Obat
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
                        System.out.println("3. ANTANGIN");
                        System.out.println("4. VITACIMIN");
                        System.out.println("5. NEOZEP");
                        System.out.println("6. PANADOL");
                        System.out.println("7. PARACETAMOL");
                        System.out.println("8. back to menu ");
                        System.out.println("===================================================================");
                        System.out.print("CHOOSE THE MEDICINE YOU WANT TO KNOW (1/2/3/4/5/6/7/8.Go back to menu) : ");
                        int detailTypeMedic = sc.nextInt();
                        System.out.println();
                        if (detailTypeMedic == 1) {
                            System.out.println("============================== PROMAG =============================");
                            System.out.println("Golongan         : Obat bebas");
                            System.out.println("Manfaat          : Mengatasi sakit maag, GERD, dan perut kembung");
                            System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥6 tahun");
                            System.out.println("===================================================================");
                            System.out.println();
                            }else if(detailTypeMedic ==2) {
                                System.out.println("=============================== DEMACOLIN =========================");
                                System.out.println("Golongan         : Obat bebas");
                                System.out.println("Manfaat          : Mengatasi sakit maag, GERD, dan perut kembung");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥6 tahun");
                                System.out.println("===================================================================");
                                System.out.println();
                            }else if(detailTypeMedic == 3) {
                                System.out.println("============================ ANTANGIN =============================");
                                System.out.println("Golongan         : Obat bebas");
                                System.out.println("Manfaat          : Mengatasi sakit maag, GERD, dan perut kembung");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥6 tahun");
                                System.out.println("===================================================================");
                                System.out.println();
                            }else if(detailTypeMedic == 4){
                                System.out.println("============================ VITACIMIN ============================");
                                System.out.println("Golongan         : Obat bebas");
                                System.out.println("Manfaat          : Mengatasi sakit maag, GERD, dan perut kembung");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥6 tahun");
                                System.out.println("===================================================================");
                                System.out.println();
                            }else if(detailTypeMedic == 5){
                                System.out.println("================================= NEOZEP ==========================");
                                System.out.println("Golongan         : Obat bebas");
                                System.out.println("Manfaat          : Mengatasi sakit maag, GERD, dan perut kembung");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥6 tahun");
                                System.out.println("===================================================================");
                                System.out.println();
                            }else if(detailTypeMedic == 6){
                                System.out.println("========================== PANADOL ================================");
                                System.out.println("Golongan         : Obat bebas");
                                System.out.println("Manfaat          : Mengatasi sakit maag, GERD, dan perut kembung");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥6 tahun");
                                System.out.println("===================================================================");
                                System.out.println();
                            }else if(detailTypeMedic == 7){
                                System.out.println("========================== PARACETAMOL ============================");
                                System.out.println("Golongan         : Obat bebas");
                                System.out.println("Manfaat          : Mengatasi sakit maag, GERD, dan perut kembung");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥6 tahun");
                                System.out.println("===================================================================");
                                System.out.println();
                            }else if (detailTypeMedic == 8){
                                break;
                            } else {
                                System.out.println("YOUR SELECTION IS INVALID, Please select correctly");
                                System.out.println();
                                continue;
                            }
                        }
                    case 2:
                    int totalPrice, change, option, totalMedic=0;
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
                        option = sc.nextInt();
        
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
                            System.out.println("YOUR SELECTION IS INVALID, Please select an available medicine.");
                        }

                        System.out.println();
                        System.out.println("= = = = = = = = = = = = = =");
                        System.out.println("Your Total Shopping: Rp" + totalMedic);
                        System.out.println("= = = = = = = = = = = = = =");
                        System.out.println();
        
                    }
                        //Pemilihan barang ( obat )
                        //Penambahan atau kalkulasi harga dan barang
                        //Penampilan stok barang
                        //total barang dan harga yang akan di beli
                case 3:
                        System.out.println("==||||| Assurance Type ||||==");
                        System.out.println("1. Allianz");
                        System.out.println("2. BPJS");
                        System.out.println("3. PRUDENTIALd");
                        System.out.println("4. Exit Program");
                        System.out.print("Choose the menu (1/2/3/4) : ");
                        int chooseAsurance = sc.nextInt();

                
                
                    }
                }
            }
        }
                
                    //Metode pembayaran
                    //memasukan total harga dan kembalian
                    //Diskon Assuransi

        
    