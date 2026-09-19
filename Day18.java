import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {

    //Konversi otomatis(Dari tipe data kecil ke besar).
      
    Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Angka.. ");
        byte a = in.nextByte();
      
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;

        System.out.println("byte   : " + a);
        System.out.println("short  : " + b);
        System.out.println("int    : " + c);
        System.out.println("long   : " + d);
        System.out.println("float  : " + e);
        System.out.println("double : " + f);
      
    }
}
