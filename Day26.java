import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double PI = 3.14;

        double r = input.nextDouble();

        double luas = PI * r * r ;

        System.out.println(luas);
    }
}
