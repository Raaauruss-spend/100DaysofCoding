import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {

    //Operator Increment dan Decrement (++, --)

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai x: ");
        int x = input.nextInt();

        System.out.println("Nilai awal: " + x);

        x++;
      
        System.out.println("Setelah increment: " + x);

        x--;
      
        System.out.println("Setelah decrement: " + x);
    }
}
