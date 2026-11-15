public class Day75 {
    public static void main(String[] args) {

        String nama = "Rimuru Tempest";
        String nama2 = "rimuru tempest";
        String anime = "Tensei Shitara Slime Datta Ken";
        String kosong = "";

        // equals()
        System.out.println("Nama sama: " + nama.equals(nama2));

        // equalsIgnoreCase()
        System.out.println("Nama sama tanpa membedakan huruf: "
                + nama.equalsIgnoreCase(nama2));

        // contains()
        System.out.println("Mengandung Slime: " + anime.contains("Slime"));

        // isEmpty()
        System.out.println("Data kosong: " + kosong.isEmpty());
    }
}
