import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {

    // Latihan: Mencetak angka ganjil 1-N dan angka genap 1-N
      
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = in.nextInt();

        System.out.print("Angka ganjil: ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.print("\nAngka genap: ");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        in.close();
    }
  }
