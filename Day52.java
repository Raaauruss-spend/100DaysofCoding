import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {

    // Perulangan while
      
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();

        while (angka <= 5) {
            System.out.println(angka);
            angka++;
        }
    }
}
