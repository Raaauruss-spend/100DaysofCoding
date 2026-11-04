import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {

    // Latihan: Membuat Bilangan Faktorial

        Scanner input = new Scanner(System.in);

        int n, hasil = 1;

        System.out.print("Masukkan angka: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }

        System.out.println("Hasil faktorial: " + hasil);
    }
}
