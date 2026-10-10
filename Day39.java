import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {

    // Latihan: Membuat Kalkulator menggunakan if.

        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR RIMURU ===");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        System.out.print("Pilih operasi (1-4): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        if (pilihan == 1) {
            System.out.println("Hasil: " + (a + b));
        } else if (pilihan == 2) {
            System.out.println("Hasil: " + (a - b));
        } else if (pilihan == 3) {
            System.out.println("Hasil: " + (a * b));
        } else if (pilihan == 4) {
            if (b != 0) {
                System.out.println("Hasil: " + (a / b));
            } else {
                System.out.println("Tidak bisa membagi dengan nol!");
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
    }
