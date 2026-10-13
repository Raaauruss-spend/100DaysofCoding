import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    // Latihan: Menentukan Gaji Bersih.

        System.out.print("Masukkan nama karyawan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = input.nextDouble();

        double pajak;

        if (gajiPokok > 5000000) {
            pajak = gajiPokok * 10 / 100;
        } else {
            pajak = gajiPokok * 5 / 100;
        }

        double gajiBersih = gajiPokok - pajak;

        System.out.println("\nNama Karyawan: " + nama);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Pajak: Rp" + pajak);
        System.out.println("Gaji Bersih: Rp" + gajiBersih);

        input.close();
    }
}
