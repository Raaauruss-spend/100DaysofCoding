import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {

    //Percabangan ( if-else if-else )

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan level kekuatan Asta: ");
        int level = input.nextInt();

        if (level >= 90) {
            System.out.println("Asta menggunakan Devil Union!");
        } else if (level >= 70) {
            System.out.println("Asta menggunakan Black-Form!");
        } else if (level >= 50) {
            System.out.println("Asta menggunakan Anti Magic!");
        } else {
            System.out.println("Asta masih berlatih!");
        }

        input.close();
    }
}
