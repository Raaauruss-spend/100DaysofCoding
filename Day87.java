import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = {10, 20, 30, 40, 50};

        System.out.print("Data awal: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }

        System.out.print("\nMasukkan indeks yang ingin diubah: ");
        int indeks = input.nextInt();

        System.out.print("Masukkan angka baru: ");
        int nilai = input.nextInt();

        angka[indeks] = nilai;

        System.out.print("Data setelah diubah: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }

        input.close();
    }
}
