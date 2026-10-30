import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {

    // Latihan: Mencetak bilangan kelipatan M dari 1-N

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai M: ");
        int M = input.nextInt();

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.println(i);
            }
        }
    }
}
