import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {

    // Latihan: do while: Membuat Menu Berulang

        Scanner in = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU MAKANAN ===");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Mie Ayam");
            System.out.println("3. Bakso");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Nasi Goreng");
                    break;

                case 2:
                    System.out.println("Anda memilih Mie Ayam");
                    break;

                case 3:
                    System.out.println("Anda memilih Bakso");
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilihan != 0);

        in.close();
    }
}
