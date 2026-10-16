import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {

    // Percabangan (switch-case)
        Scanner input = new Scanner(System.in);

        System.out.println("=== SKILL RIMURU ===");
        System.out.println("1. Predator");
        System.out.println("2. Great Sage");
        System.out.println("3. Black Flame");
        System.out.print("Pilih skill: ");

        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Rimuru menggunakan Predator!");
                break;
            case 2:
                System.out.println("Rimuru menggunakan Great Sage!");
                break;
            case 3:
                System.out.println("Rimuru menggunakan Black-Flame!");
                break;
            default:
                System.out.println("Pilihan tidak tersedia!");
        }

        input.close();
    }
    }
