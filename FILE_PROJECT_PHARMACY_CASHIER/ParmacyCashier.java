import java.util.Scanner;

public class ParmacyCashier {

    public static void main(String[] args) {
        Scanner chya = new Scanner(System.in);

        // Database untuk stok obat
        String[][] medicineStock = {
                {"Mefenamic", "Rp 5.000", "2023-12-31"},
                {"Promag", "Rp 4.000", "2023-11-30"},
                {"Neozep", "Rp 4.000", "2023-12-31"},
                {"PANADOL", "Rp 6.000", "2024-01-25"},
                {"PARACETAMOL", "Rp 10.000", "2024-02-20"},
                {"MENSES", "Rp 30.000", "2024-02-25"},
                // ... daftar obat lainnya dengan harga dan tanggal kadaluarsa
        };

        // Database untuk login
        String[][] loginCredentials = {
                {"nonmember", "1234"},
                {"member", "4567"}
        };

        // Login
        System.out.println("= = = = = = ");
        System.out.print("USER ID : ");
        String userId = chya.next();
        System.out.println("= = = = = = ");
        System.out.println("= = = = = = ");
        System.out.print("PASSWORD : ");
        String password = chya.next();
        System.out.println("= = = = = = ");
        System.out.println();

        // Cek kecocokan user id dan password
        boolean loggedIn = false;
        for (String[] credentials : loginCredentials) {
            if (credentials[0].equals(userId) && credentials[1].equals(password)) {
                loggedIn = true;
                break;
            }
        }

        if (!loggedIn) {
            System.out.println("Login gagal. Silakan coba lagi.");
            return;
        }

        int totalPurchase = 0;

        // Transaksi
        while (true) {
            System.out.println("==||||| MENU ||||==");
            System.out.println("1. Beli Obat");
            System.out.println("2. Stok Obat");
            System.out.println("3. Struk");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4) : ");
            int choice = chya.nextInt();

            switch (choice) {
                case 1:
                    // Menampilkan jenis obat dan harga
                    System.out.println("JENIS OBAT DAN HARGA");
                    for (int i = 0; i < medicineStock.length; i++) {
                        System.out.println((i + 1) + ". " + medicineStock[i][0] + " - " + medicineStock[i][1]);
                    }

                    // Memasukkan pilihan obat
                    System.out.print("Pilih obat (1-" + medicineStock.length + ") : ");
                    int medicineChoice = chya.nextInt();

                    // Menanyakan apakah ingin menambahkan obat
                    System.out.print("Ingin menambahkan obat ini? (yes/no): ");
                    String addMore = chya.next().toLowerCase();
                    
                    if (addMore.equals("yes")) {
                        // Menghitung total pembelian
                        totalPurchase += Integer.parseInt(medicineStock[medicineChoice - 1][1].replaceAll("[\\D]", ""));
                        System.out.println("Obat berhasil ditambahkan ke keranjang.");
                    } else {
                        System.out.println("Obat tidak ditambahkan ke keranjang.");
                    }
                    break;

                case 2:
                    // Menampilkan stok obat dan waktu kadaluarsa
                    System.out.println("STOK OBAT");
                    for (String[] medicine : medicineStock) {
                        System.out.println(medicine[0] + " - Exp: " + medicine[2]);
                    }
                    break;

                case 3:
                    // Menampilkan struk pembelian
                    System.out.println("==== STRUK PEMBELIAN ====");
                    System.out.println("Total Pembelian: Rp" + totalPurchase);
                    System.out.print("Masukkan jumlah uang: Rp");
                    int money = chya.nextInt();
                    int change = money - totalPurchase;
                    System.out.println("Uang Kembalian: Rp" + change);
                    System.out.println("=========================");
                    return;

                case 4:
                    System.out.println("Keluar dari program. Terima kasih!");
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }
}
