import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    // Latihan: Penjumlahan Angka (berhenti ketika menginputkan angka negatif)

        int angka;
        int total = 0;

        System.out.print("Masukkan angka: ");
        angka = input.nextInt();

        while (angka >= 0) {
            total += angka;

            System.out.print("Masukkan angka: ");
            angka = input.nextInt();
        }

        System.out.println("Total penjumlahan: " + total);

        input.close();
    }
          }
