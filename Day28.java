import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {

    //Operator Perbandingan == dan !=
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("Apakah sama? " + (a == b));
        System.out.println("Apakah berbeda? " + (a != b));
    }
}
