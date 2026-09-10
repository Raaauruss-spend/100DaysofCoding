public class Day9 {
  public static void main (String[] args) {

// Constanta (Final Variabel).

/*constanta adalah variabel yang nilainya tidak bisa diubah setelah diberi nilai pertama kali (immutable).
Untuk membuat constanta, kita pakai keyword final di depan tipe data.
*/

// final tipeData NAMA_KONSTANTA = nilai; //(Sintaks)


/*Aturan penulisan:
* Pakai keyword final sebelum tipe data
* Nama konstanta biasanya ditulis huruf kapital semua, dan kalau lebih dari satu kata dipisah underscore _ (ini konvensi, bukan aturan wajib dari compiler)
* Harus langsung diberi nilai saat dideklarasikan (atau minimal sebelum dipakai)
*/

//Example:

    final String NAMA_KARAKTER = "Chitanda Eru";
    final String NAMA_SEKOLAH = "SMA Kamiyama";
    final String NAMA_KLUB = "Klub Sastra Klasik";
    final String CATCHPHRASE = "Watashi, kininarimasu!";

System.out.println(NAMA_KARAKTER + " adalah anggota " + NAMA_KLUB + " di " + NAMA_SEKOLAH);
System.out.println(NAMA_KARAKTER + ": \"" + CATCHPHRASE + "\"");

System.out.println("");


//Kalau dicoba diubah:

/*
final int TAHUN_BERDIRI = 1998;
TAHUN_BERDIRI = 2000; // ERROR! Cannot assign a value to final variable
*/

//Baris kedua akan menyebabkan compile error, karena nilai constanta tidak boleh diubah setelah inisialisasi awal.

/*Kapan dipakai?

Constanta cocok dipakai untuk nilai yang memang tetap dan tidak seharusnya berubah selama program berjalan, misalnya:
      * Nilai matematika (π, gravitasi)
      * Batas maksimum/minimum (kapasitas, umur minimum)
      * Nilai konfigurasi tetap (nama aplikasi, versi)
*/


  }
}
