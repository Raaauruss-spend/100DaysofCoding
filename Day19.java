import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {

    //Konversi Manual/Paksa (Dari Tipe Data Besar ke Kecil).

        Scanner input = new Scanner(System.in);

        double angka = input.nextDouble();

        int hasil = (int) angka;

        System.out.println("Angka awal : " + angka);
        System.out.println("Hasil konversi : " + hasil);
    }
}
