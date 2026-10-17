import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {

    // Latihan: Membuat Menu Menggunakan Switch-case
      
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MUKOUDA ===");
        System.out.println("1. Steak");
        System.out.println("2. Karaage");
        System.out.println("3. Hamburger");
        System.out.print("Pilih menu (1-3): ");

        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Fel menyukai Steak!");
                break;
            case 2:
                System.out.println("Sui menyukai Karaage!");
                break;
            case 3:
                System.out.println("Mukouda membuat Hamburger!");
                break;
            default:
                System.out.println("Menu tidak tersedia!");
        }

        input.close();
    }
                  }
