import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {

    // Latihan: Membuat Pola Garis Vertikal

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }

        input.close();
    }
}
