import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {

    //Latihan: Mengkombinasikan berbagai operator.
      
        Scanner S = new Scanner(System.in);

        int slime = 100;
        int serangan;

        System.out.print("Masukkan kekuatan serangan Rimuru: ");
        serangan = S.nextInt();

        slime = slime - serangan;

        boolean masihHidup = slime > 0;
        boolean seranganKuat = serangan >= 50;
        boolean hasil = masihHidup && seranganKuat;

        System.out.println("Sisa HP slime: " + slime);
        System.out.println("Slime masih hidup: " + masihHidup);
        System.out.println("Serangan kuat: " + seranganKuat);
        System.out.println("Rimuru berhasil menyerang: " + hasil);

        serangan++;

        System.out.println("Serangan berikutnya: " + serangan);

        S.close();
    }
}
