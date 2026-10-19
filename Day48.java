import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {

    // Latihan: Membuat Kalkulator Menggunakan Switch-case
      
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double angka1 = in.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double angka2 = in.nextDouble();

        System.out.print("Pilih operator (+, -, *, /, %): ");
        char operator = in.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Hasil: " + (angka1 + angka2));
                break;

            case '-':
                System.out.println("Hasil: " + (angka1 - angka2));
                break;

            case '*':
                System.out.println("Hasil: " + (angka1 * angka2));
                break;

            case '/':
                if (angka2 != 0) {
                    System.out.println("Hasil: " + (angka1 / angka2));
                } else {
                    System.out.println("Tidak bisa dibagi dengan nol!");
                }
                break;

            case '%':
                if (angka2 != 0) {
                    System.out.println("Hasil: " + (angka1 % angka2));
                } else {
                    System.out.println("Tidak bisa modulus dengan nol!");
                }
                break;

            default:
                System.out.println("Operator tidak valid!");
        }

        in.close();
    }
          }
