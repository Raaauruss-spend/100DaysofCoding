import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {

    // Latihan: Mencetak hasil M pangkat N

        Scanner input = new Scanner(System.in);

        int M, N;
        int hasil = 1;

        System.out.print("Masukkan nilai M: ");
        M = input.nextInt();

        System.out.print("Masukkan nilai N: ");
        N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            hasil = hasil * M;
        }

        System.out.println("Hasil " + M + " pangkat " + N + " = " + hasil);

        input.close();
    }
          }
