import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {

    // Latihan: Membuat Pola Persegi

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n) {
                    System.out.print("- ");
                } else if (j == 1 || j == n) {
                    System.out.print("| ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        input.close();
    }
}
