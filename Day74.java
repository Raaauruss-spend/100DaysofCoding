import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        
    // Method String Dasar (length(), toUpperCase(), toLowerCase()).

    Scanner in = new Scanner (System.in);

    System.out.print("Masukkan Nama: ");
    String nm = in.nextLine();

    System.out.println("Nama asli: " + nm);
    System.out.println("Jumlah karakter: " + nm.length());
    System.out.println("Huruf besar: " + nm.toUpperCase());
    System.out.println("Huruf Kecil: " + nm.toLowerCase());

    in.close();
    
    }
}
  
    
