
import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] angka = new int[5];

        // Mengisi array
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = in.nextInt();
        }

        // Menentukan angka terbesar
        int maksimal = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > maksimal) {
                maksimal = angka[i];
            }
        }

        System.out.println("Angka terbesar adalah: " + maksimal);

        in.close();
    }
}
