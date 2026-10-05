import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {

    // Nested if

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan level Rimuru: ");
        int level = input.nextInt();

        if (level >= 70) {

            System.out.print("Apakah Rimuru memiliki skill Predator? (true/false): ");
            boolean predator = input.nextBoolean();

            if (predator) {
                System.out.println("Rimuru menggunakan Predator!");
            } else {
                System.out.println("Rimuru belum memiliki Predator.");
            }

        } else {
            System.out.println("Level Rimuru belum cukup.");
        }

        input.close();
    }
}
