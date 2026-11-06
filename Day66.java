import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {

    // Latihan: Membuat Pola Garis Horizontal

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah garis: ");
        int jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("-");
        }

        input.close();
    }
}
