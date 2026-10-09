import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {

    //Latihan: Membuat Menu menggunakan if.

        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU KEKUATAN RIMURU ===");
        System.out.println("1. Predator");
        System.out.println("2. Great Sage");
        System.out.println("3. Black Flame");

        System.out.print("Pilih kekuatan (1-3): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Rimuru menggunakan Predator!");
        } else if (pilihan == 2) {
            System.out.println("Rimuru menggunakan Great Sage!");
        } else if (pilihan == 3) {
            System.out.println("Rimuru menggunakan Black Flame!");
        } else {
            System.out.println("Kekuatan tidak tersedia!");
        }

        input.close();
    }
}
