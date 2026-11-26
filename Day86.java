import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = {10, 20, 30, 40, 50};

        System.out.print("Masukkan angka yang dicari: ");
        int cari = input.nextInt();

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                System.out.println("Angka ditemukan pada indeks " + i);
                break;
            }
        }

        input.close();
    }
}
