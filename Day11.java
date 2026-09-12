import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {

  // Menerima Input dari Keyboard (pengenalan Scanner).

 
      
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        input.nextLine(); // membersihkan sisa enter setelah nextInt()

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiBadan = input.nextDouble();
        input.nextLine(); // membersihkan sisa enter setelah nextDouble()

        System.out.print("Masukkan kota asal (satu kata): ");
        String kotaAsal = input.next();

        System.out.println("\n===== Biodata =====");
        System.out.println("Nama         : " + namaLengkap);
        System.out.println("Umur         : " + umur + " tahun");
        System.out.println("Tinggi badan : " + tinggiBadan + " cm");
        System.out.println("Kota asal    : " + kotaAsal);

        input.close();
    }
          }
