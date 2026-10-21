import java.util.Scanner;

public class Coba {
    public static void main(String[] args) {

    // Latihan: Membuat Program Ganjil Genap menggunakan ternary

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Angka " + angka + " adalah " + hasil);

        in.close();
    }
}
