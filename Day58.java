import java.util.Scanner;

public class Day58 {
public static void main(String[] args) {

 // Latihan: Mencetak angka ganjil N-1 dan angka genap N-1

    Scanner in = new Scanner(System.in);

    System.out.print("Masukkan nilai N: ");
    int n = in.nextInt();

    System.out.println("Angka ganjil:");
    for (int i = n - 1; i >= 1; i--) {
        if (i % 2 != 0) {
            System.out.print(i + " ");
        }
    }

    System.out.println("\nAngka genap:");
    for (int i = n - 1; i >= 1; i--) {
        if (i % 2 == 0) {
            System.out.print(i + " ");
        }
    }

    in.close();
}

      }
