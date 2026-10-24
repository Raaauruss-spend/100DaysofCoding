import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {

    // Perulangan do-while

        Scanner in = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            angka = in.nextInt();

            System.out.println("Angka: " + angka);

        } while (angka != 0);

        in.close();
    }
}
