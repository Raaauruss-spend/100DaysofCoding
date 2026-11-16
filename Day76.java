public class Day76 {
    public static void main(String[] args) {

    // Method String untuk Manipulasi (substring(), replace(), trim()).

        String nama = "   Rimuru Tempest   ";

        // Menghapus spasi di awal dan akhir
        String bersih = nama.trim();

        // Mengambil kata Rimuru
        String potong = bersih.substring(0, 6);

        // Mengganti Rimuru menjadi Diablo
        String ganti = bersih.replace("Rimuru", "Diablo");

        System.out.println("Nama asli  : " + nama);
        System.out.println("Nama bersih : " + bersih);
        System.out.println("Substring   : " + potong);
        System.out.println("Replace     : " + ganti);
    }
}
