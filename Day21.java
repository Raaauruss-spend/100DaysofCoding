import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {

    ///Mengubah tipe data string ke tipe data primitif 
      
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        String data = input.nextLine();

        int umur = Integer.parseInt(data);

        System.out.println("Umur: " + umur);
    }
}.
