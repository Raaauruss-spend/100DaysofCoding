import java.util.Scanner;

//Day12menuju100DaysofCoding

public class Day12 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        Double TinggiBadan = input.nextDouble();

        System.out.print("Masukkan jurusan: ");
        String jurusan = input.next();

      
        System.out.println("\n=== BIODATA ===");
        System.out.println("Nama         : " + namaLengkap);
        System.out.println("Umur         : " + umur + " tahun");
        System.out.println("Tinggi badan : " + TinggiBadan + " cm");
        System.out.println("Jurusan : " + jurusan);


      
        input.close();
      
    }
    
}
