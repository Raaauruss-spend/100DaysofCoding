
import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String username, password;
        String loginUser, loginPass;

        // Membuat akun
        System.out.println("=== BUAT AKUN ===");

        System.out.print("Buat Username: ");
        username = in.nextLine();

        System.out.print("Buat Password: ");
        password = in.nextLine();

        System.out.println("\nAkun berhasil dibuat!");

        // Proses login
        System.out.println("\n=== LOGIN AKUN ===");

        do {
            System.out.print("Username: ");
            loginUser = in.nextLine();

            System.out.print("Password: ");
            loginPass = in.nextLine();

            if (!loginUser.equals(username) ||
                !loginPass.equals(password)) {
                System.out.println("Username atau password salah!");
                System.out.println("Silakan coba lagi.\n");
            }

        } while (!loginUser.equals(username) ||
                 !loginPass.equals(password));

        System.out.println("\nLogin berhasil!");
        System.out.println("Selamat datang, " + username);
        
        in.close();
    }
}
