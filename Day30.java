import java.util.Scanner;

public class Day30x{
    public static void main(String[] args) {

    //Operator Perbandingan <= dan >=.
      
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        System.out.println("Nilai <= 75: " + (nilai <= 75));
        System.out.println("Nilai >= 75: " + (nilai >= 75));
    }
}
