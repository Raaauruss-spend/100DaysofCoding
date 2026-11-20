import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] anime = {"Rimuru", "Asta", "Gojo", "Luffy", "Naruto"};

        System.out.println("Daftar Anime:");
        System.out.println("0. " + anime[0]);
        System.out.println("1. " + anime[1]);
        System.out.println("2. " + anime[2]);
        System.out.println("3. " + anime[3]);
        System.out.println("4. " + anime[4]);

        System.out.print("\nMasukkan indeks anime: ");
        int indeks = input.nextInt();

        System.out.println("Anime pilihan: " + anime[indeks]);
    }
}
