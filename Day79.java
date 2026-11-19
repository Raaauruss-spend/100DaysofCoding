import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] anime = new String[5];

        for (int i = 0; i < anime.length; i++) {
            System.out.print("Masukkan nama anime: ");
            anime[i] = input.nextLine();
        }

        System.out.println("\nDaftar Anime:");

        System.out.println(anime[0]);
        System.out.println(anime[1]);
        System.out.println(anime[2]);
        System.out.println(anime[3]);
        System.out.println(anime[4]);

    }
}
