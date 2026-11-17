import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String nama = "  Rimuru Tempest  ";

        System.out.println("Nama: " + nama);

        System.out.println("Jumlah karakter: " + nama.length());

        System.out.println("Huruf besar: " + nama.toUpperCase());

        System.out.println("Huruf kecil: " + nama.toLowerCase());

        System.out.println("Sama dengan Rimuru? " + nama.equals("Rimuru"));

        System.out.println("Mengandung Rimuru? " + nama.contains("Rimuru"));

        System.out.println("Apakah kosong? " + nama.isEmpty());

        System.out.println("Substring: " + nama.substring(2, 8));

        System.out.println("Replace: " + nama.replace("Rimuru", "Milim"));

        System.out.println("Trim: " + nama.trim());

        in.close();
    }
}
