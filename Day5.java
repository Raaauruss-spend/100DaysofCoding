public class Day5 {
  public static void main(String[] args) {

//Tipe Data Pecahan (double, float).

//Tipe data pecahan dipakai untuk menyimpan angka yang memiliki koma (desimal),

/* double
   duble adalah tipe data pecahan dengan ukuran lebih besar (8 byte) dan ketelitian lebih tinggi.  
   ini adalah pilihan default/utama di Java, dan tidak butuh huruf tambahan saat menuliskan angkanya.
*/

//Example:

  double harga = 20000.50;

  System.out.println("Harga Lego Zoro : " + harga); 
  //outputnya berupa "Harga Lego Zoro : 20000.5"

  System.out.println("");


  /* float
     float adalah tipe data pecahan dengan ukuran lebih kecil (4 byte) dan ketelitian lebih rendah.
     cocok dipakai kalau ingin menghemat memori, tapi wajib menambahkan huruf f di akhir angka.
  */

//Example

  float TinggiBadan = 148.8f;

  System.out.println("Tinggi Badan : " + TinggiBadan);
  //outputnya berupa "Tinggi Badan : 148.8"
  
    
  }
}
