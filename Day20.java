import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
      
    // Mengubah Tipe Data Primitif menjadi String.

      Scanner in = new Scanner(System.in);
      
        int umur = in.nextInt();
        double ipk = in.nextDouble();
        boolean mahasiswa = in.nextBoolean();

        String umurString = String.valueOf(umur);
        String ipkString = String.valueOf(ipk);
        String mahasiswaString = String.valueOf(mahasiswa);

        System.out.println("Umur : " + umurString);
        System.out.println("IPK : " + ipkString);
        System.out.println("Status Mahasiswa : " + mahasiswaString);
      
    }
}
