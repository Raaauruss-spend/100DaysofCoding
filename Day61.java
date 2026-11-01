import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {

    // Latihan: Mengalikan angka 1-N

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = input.nextInt();

        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }

        System.out.println("Hasil perkalian = " + hasil);

        input.close();
    }
}
