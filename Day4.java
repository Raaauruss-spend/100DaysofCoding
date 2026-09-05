public class Day4 {
  public static void main(String[] args) {

// Tipe Data Numerik Bilangan Bulat (byte, short, int, long).

/*
* Tipe data numerik bilangan bulat (integer) di Java terdiri dari byte, short, int, dan long, yang dibedakan berdasarkan kapasitas memori dan jangkauan angkanya.
*/

/* 1. Byte
      Menggunakan memori 8-bit (1 byte). Jangkauan nilai sangat kecil, yaitu dari -128 sampai 127.
*/

/*Example:
  Jumlah Bijuu (Monster Berekor) di Naruto yang berjumlah 9 ekor.
*/

byte JumlahBiju = 9;

System.out.println(JumlahBiju); 
//outputnya hanya berupa angka 9
    
System.out.println("");
    
System.out.println("Jumlah Monster berekor : " + JumlahBiju);   
//outputnya berupa "Jumlah Monster Berekor : 9"

System.out.println("");


/* 2. Short
      Menggunakan memori 16-bit (2 byte). Jangkauan nilai dari -32.768 sampai 32.767.      
*/

/*Example:
  Jumlah penonton yang memadati stadion nasional saat pertandingan final turnamen musim semi (Spring High) di Haikyuu!!.
*/

short PenontonStadion = 15500;

System.out.println(PenontonStadion); 
//outputnya hanya berupa angka 15500
    
System.out.println("");
    
System.out.println("Jumlah penonton : " + PenontonStadion);   
//outputnya berupa "Jumlah penonton : 15500"

System.out.println("");


/* 3. int (integer)
      Menggunakan memori 32-bit (4 byte). Jangkauan nilai dari -2.147.483.648 sampai 2.147.483.647.       
*/

/*Example:
  Total Mana atau pasokan sihir yang dimiliki oleh para Ksatria Sihir tingkat tinggi atau Raja Penyihir (Wizard King) di anime "Black-Clover".
*/

int Mana = 7500000;

System.out.println(Mana); 
//outputnya hanya berupa angka 7500000
    
System.out.println("");
    
System.out.println("Mana Lumiere Black-Clover : " + Mana);   
//outputnya berupa "Mana Lumiere Black-Clover : 7500000"

System.out.println("");


/* 4. Long
      Menggunakan memori 64-bit (8 byte). Jangkauan nilai sangat luas dari -9.223.372.036.854.775.808 hingga 9.223.372.036.854.775.807. Diakhiri huruf L di belakang angka.       
*/

/*Example:
  Total Mana atau statistik poin milik Sung Jin-Woo setelah menjadi Shadow Monarch di akhir cerita Solo Leveling.
*/

long ManaShadowMonarch = 85000000000L;

System.out.println(ManaShadowMonarch); 
//outputnya hanya berupa angka 85000000000
    
System.out.println("");
    
System.out.println("Total Mana Shadow Monarch : " + ManaShadowMonarch);   
//outputnya berupa "Total Mana Shadow Monarch : 85000000000"

System.out.println("");


  }
}
