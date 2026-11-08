import java.util.Scanner;

public class Day68 {
  public static void main(String[] args) {

  // Membuat pola segitiga siku - siku dengan angka berurutan.

    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan angka: ");
    int n = input.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println("");
    }
  }
}
