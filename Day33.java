import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {

    //Percabangan ( if-else )

        Scanner p = new Scanner(System.in);

        System.out.print("Masukkan kekuatan monster: ");
        int kekuatan = p.nextInt();

        if (kekuatan <= 100) {
            System.out.println("Rimuru menggunakan Predator!");
            System.out.println("Monster berhasil diserap!");
        } else {
            System.out.println("Monster terlalu kuat!");
            System.out.println("Rimuru harus mundur!");
        }

        p.close();
    }
    }
