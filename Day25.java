import java.util.Scanner;

public class Day25{
    public static void main(String[] args) {

    //Latihan: Menghitung luas lingkaran.
      
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();
      
        double luas = Math.PI * r * r;

        System.out.printf("Luas lingkaran = %.2f%n", luas);
    }
}
