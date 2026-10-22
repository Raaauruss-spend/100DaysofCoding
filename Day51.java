import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {

    // Perulangan for
      
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();

        for (int i = 1; i <= angka; i++) {
            System.out.println(i);
        }
    }
}
