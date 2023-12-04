import java.util.Scanner;
/**
 * pharmacyCashierupdate2
 */

public class PharmachyCasier {

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
                                System.out.println("Golongan         : Obat bebas terbatas");
                                System.out.println("Manfaat          : Meringankan gejala flu ");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥6 tahun");
                                System.out.println("===================================================================");
                                System.out.println();
                            }else if(detailTypeMedic == 3) {
                                System.out.println("============================ Asam Mefenamat =============================");
                                System.out.println("Golongan         : Obat resep");
                                System.out.println("Manfaat          : Meredakan nyeri dan peradangan");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥14 tahun");
                                System.out.println("===================================================================");
                                System.out.println();
                            }else if(detailTypeMedic == 4){
                                System.out.println("============================ VITACIMIN ============================");
                                System.out.println("Golongan         : Obat bebas dan resep");
                                System.out.println("Manfaat          : Mencegah dan mengatasi kekurangan vitamin C");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥6 tahun");
                                System.out.println("===================================================================");
                                System.out.println();
                            }else if(detailTypeMedic == 5){
                                System.out.println("================================= NEOZEP ==========================");
                                System.out.println("Golongan         : Obat bebas terbatas");
                                System.out.println("Manfaat          : Meredakan gejala flu");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥6 tahun");
                                System.out.println("===================================================================");
                                System.out.println();
                            }else if(detailTypeMedic == 6){
                                System.out.println("========================== PANADOL ================================");
                                System.out.println("Golongan         : Obat bebas dan obat bebas terbatas");
                                System.out.println("Manfaat          : Meredakan demam, gejala flu, sakit kepala, dan sakit gigi");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥6 tahun");
                                System.out.println("===================================================================");
                                System.out.println();
                            }else if(detailTypeMedic == 7){
                                System.out.println("========================== PARACETAMOL ============================");
                                System.out.println("Golongan         : Obat bebas");
                                System.out.println("Manfaat          : Meredakan demam dan nyeri");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥6 tahun");
                                System.out.println("===================================================================");
                                System.out.println();
                            }else if(detailTypeMedic == 8){
                                System.out.println("========================== MENSES ============================");
                                System.out.println("Golongan         : Obat Haid");
                                System.out.println("Manfaat          : Mengatasi nyeri/keram pada perut");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥10 tahun");
                                System.out.println("===================================================================");
                                System.out.println();
                                }else if(detailTypeMedic == 9){
                                System.out.println("========================== AMBEVEN ============================");
                                System.out.println("Golongan         : Obat Wasir");
                                System.out.println("Manfaat          : Mengatasi nyeri pada dubur");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥10 tahun");
                                System.out.println("===================================================================");
                                System.out.println();
                                 }else if(detailTypeMedic == 10){
                                System.out.println("========================== MIXAGRIB ============================");
                                System.out.println("Golongan         : Obat bebas terbatas");
                                System.out.println("Manfaat          : Meredakan gejala flu");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥10 tahun");
                                System.out.println("===================================================================");
                                System.out.println();
                                 }else if(detailTypeMedic == 11){
                                System.out.println("========================== INPEPSA ============================");
                                System.out.println("Golongan         : Obat Resep");
                                System.out.println("Manfaat          : Mengatasi tukak lambung, ulkus duodenum, atau gastritis kronis");
                                System.out.println("Di konsumsi oleh : Dewasa ");
                                System.out.println("===================================================================");
                                System.out.println();
                                 }else if(detailTypeMedic == 12){
                                System.out.println("========================== ANTIMO ============================");
                                System.out.println("Golongan         : Obat bebas terbatas");
                                System.out.println("Manfaat          : Meredakan mabuk perjalanan dan gejala masuk angin");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak ");
                                System.out.println("===================================================================");
                                System.out.println();
                                 }else if(detailTypeMedic == 13){
                                System.out.println("========================== AMPICILIN ============================");
                                System.out.println("Golongan         : Antibiotik penisilin");
                                System.out.println("Manfaat          : Mengobati infeksi bakteri");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak ");
                                System.out.println("===================================================================");
                                System.out.println();
                                 }else if(detailTypeMedic == 14){
                                System.out.println("========================== EverE250 ============================");
                                System.out.println("Golongan         : Multivitamin");
                                System.out.println("Manfaat          : Menjaga Kesehatan Kulit ");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak ");
                                System.out.println("===================================================================");
                                System.out.println();
                                 }else if(detailTypeMedic == 15){
                                System.out.println("========================== CENTRIZINE ============================");
                                System.out.println("Golongan         : Obat Resep");
                                System.out.println("Manfaat          : Meredakan gejala alergi");
                                System.out.println("Di konsumsi oleh : Dewasa dan anak-anak usia  ≥2 tahun");
                                System.out.println("===================================================================");
                                System.out.println();   

                            }else if (detailTypeMedic == 16){
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
                        System.out.println("5. NEOZEP       (Rp 8.000)");
                        System.out.println("6. PANADOL      (Rp 5.000)");
                        System.out.println("7. PARACETAMOL  (Rp 10.000)");
                        System.out.println("8. MENSES       (Rp 30.000)");
                        System.out.println("9. AMBEVEN      (Rp 15.000)");
                        System.out.println("10. MIXAGRIB    (Rp 3.000)");
                        System.out.println("11. INPEPSA     (Rp 60.000)");
                        System.out.println("12. ANTIMO      (Rp 10.000)");
                        System.out.println("13. AMPICILIN   (Rp 9.000 )");
                        System.out.println("14. EverE250    (Rp 35.000)");
                        System.out.println("15. CETRIZINE   (Rp 5.000)");

                        System.out.println("16. Finished Order");
        
                        System.out.print("Medicine Type (1/2/3/4/5/6/7/8/9/10/11/12/13/14/15/16): ");
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
                        } else if (option == 5) {
                            totalMedic += 8000;
                        } else if (option == 6) {
                            totalMedic += 5000;
                        } else if (option == 7) {
                            totalMedic += 10000;
                        } else if (option == 8) {
                            totalMedic += 30000;
                        } else if (option == 9) {
                            totalMedic += 15000;
                        } else if (option == 10) {
                            totalMedic += 3000;
                        } else if (option == 11) {
                            totalMedic += 60000;
                        } else if (option == 12) {
                            totalMedic += 10000;
                        } else if (option == 13) {
                            totalMedic += 9000;
                        } else if (option == 14) {
                            totalMedic += 35000;
                        } else if (option == 15) {
                            totalMedic += 5000;   
                        } else if (option == 16) {
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

        
    
