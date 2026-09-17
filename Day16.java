import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {

    //Operator Aritmatika Modulus atau Sisa Bagi (%)
      
        Scanner p = new Scanner(System.in);

        int a = p.nextInt();
        int b = p.nextInt();

        int hasil = a % b;

        System.out.println("Sisa bagi : " +  hasil );
    }
}
