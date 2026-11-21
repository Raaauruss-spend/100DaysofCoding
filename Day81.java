
import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] anime = new String[5];

        // Mengisi elemen array
        for (int i = 0; i < anime.length; i++) {
            System.out.print("Masukkan nama anime ke-" + (i + 1) + ": ");
            anime[i] = in.nextLine();
        }

        // Menampilkan semua elemen array
        System.out.println("\nDaftar Anime:");

        for (int i = 0; i < anime.length; i++) {
            System.out.println((i + 1) + ". " + anime[i]);
        }

        in.close();
    }
}
