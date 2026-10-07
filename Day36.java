import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {

    // Latihan: Menentukan bilangan ganjil atau genap.

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan ganjil");
        }

        input.close();
    }
}
