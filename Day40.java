import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        System.out.print("Apakah membawa KTP Asli (true/false): ");
        boolean ktp = input.nextBoolean();

        if (umur >= 17 && ktp == true) {
            System.out.println("Pendaftaran Diterima! Silakan lanjut ke foto.");
        } else {
            System.out.println("Pendaftaran Ditolak! Usia belum mencukupi atau KTP tidak ada.");
        }

        input.close();
    }
}
