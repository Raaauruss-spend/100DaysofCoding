
import java.util.Scanner;

public class Day83 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] angka = new int[5];
        int total = 0;

        // Mengisi array
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = in.nextInt();
        }

        // Menampilkan dan menjumlahkan array
        System.out.println("\nIsi Array:");

        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
            total += angka[i];
        }

        System.out.println("Jumlah seluruh elemen: " + total);

        in.close();
    }
}
