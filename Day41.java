import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    //Latihan : Menentukan Temperature Ruangan menggunakan if

        System.out.print("Masukkan suhu ruangan Rimuru: ");
        int suhu = input.nextInt();

        if (suhu < 18) {
            System.out.println("Ruangan Rimuru terasa Dingin!");
        } else if (suhu <= 25) {
            System.out.println("Temperatur ruangan Normal!");
        } else {
            System.out.println("Ruangan Rimuru terasa Panas!");
        }

        input.close();
    }
}
