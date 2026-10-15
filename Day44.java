import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {

    // Latihan: Program Predikat Nilai (A,B,C,D,E)
        Scanner p = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = p.nextLine();

        System.out.print("Masukkan nilai: ");
        int nilai = p.nextInt();

        System.out.println("Nama Mahasiswa: " + nama);

        if (nilai > 100 || nilai < 0) {
            System.out.println("Nilai tidak valid!");
        } else if (nilai >= 90) {
            System.out.println("Nilai predikat: A");
        } else if (nilai >= 80) {
            System.out.println("Nilai predikat: B");
        } else if (nilai >= 70) {
            System.out.println("Nilai predikat: C");
        } else if (nilai >= 60) {
            System.out.println("Nilai predikat: D");
        } else {
            System.out.println("Nilai predikat: E");
        }

        p.close();
    }
                                }
