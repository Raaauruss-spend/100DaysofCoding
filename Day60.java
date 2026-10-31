import java.util.Scanner;

public class Dayo1 {
    public static void main(String[] args) {

    // Latihan: Menjumlahkan angka 1-N
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka N: ");
        int n = in.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }

        System.out.println("Hasil penjumlahan: " + total);

        in.close();
    }
}
