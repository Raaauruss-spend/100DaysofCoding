import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {

    // Operator Ternary
      
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = in.nextInt();

        String hasil = (nilai >= 60) ? "Lulus" : "Tidak Lulus";

        System.out.println("Hasil: " + hasil);

        in.close();
    }
}
