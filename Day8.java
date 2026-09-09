public class Day8 {
  public static void main (String[] args) {


// Deklarasi, Inisialisasi dan Update Variabel.

/* 1. Deklarasi Variabel   
Deklarasi artinya memberi tahu compiler bahwa kamu akan membuat variabel dengan tipe data dan nama tertentu — tapi belum diisi nilai
Format umumnya: tipeData namaVariabel;.
*/

//Example
int umur;
double tinggiBadan;
char grade;
boolean isLulus;
    
/* 2. Inisialisasi Variabel
Inisialisasi artinya memberi nilai pertama kali ke variabel yang sudah dideklarasikan.
*/

//Example
int umur = 18;
double tinggiBadan = 148.5;
char grade = 'A'; //InsyaAllah (Manifesting)
boolean Mahasiswa = true;

// Deklarasi dan inisialisasi bisa dipisah:
int umur;       // deklarasi
umur = 18;      // inisialisasi

// Atau digabung langsung (ini yang paling umum dipakai):
int umur = 18;  // deklarasi + inisialisasi sekaligus

/* 3. Update Variabel
Update artinya mengganti nilai variabel yang sudah punya nilai sebelumnya.
Bedanya dengan inisialisasi: inisialisasi itu pengisian pertama kali, update itu pengisian yang berikutnya-berikutnya.

*/
//Example
int umur = 18;
umur = 19;        // update biasa
umur = umur + 1;  // update pakai nilai lama, jadi 20
umur += 1;        // sama seperti di atas, jadi 21 (compound assignment)


//Contoh Program Lengkap: 

    
//Example:

  // ===== DEKLARASI =====
        String namaKarakter;
        int level;
        double kekuatanSihir;
        char rank;
        boolean PrimadonalDemon;

  // ===== INISIALISASI =====
        namaKarakter = "Diablo";
        level = 100;
        kekuatanSihir = 9999.9;
        rank = 'S';
        PrimadonalDemon = true;


System.out.println("=== Status Awal ===");
System.out.println("Nama                : " + namaKarakter);
System.out.println("Level               : " + level);
System.out.println("Kekuatan Sihir      : " + kekuatanSihir);
System.out.println("Rank                : " + rank);
System.out.println("Primadonal Demon    : " + PrimadonalDemon);

  // ===== UPDATE =====
    
        level += 9999;             
        // naik level setelah mengalahkan musuh besar
    
        kekuatanSihir *= 2;       
       // kekuatan berlipat ganda
    
        rank = 'S';             
       // naik rank jadi lebih tinggi lagi (SS)


System.out.println("\n=== Setelah Bertarung ===");
System.out.println("Nama                    : " + namaKarakter);
System.out.println("Level                   : " + level);
System.out.println("Kekuatan Sihir          : " + kekuatanSihir);
System.out.println("Rank                    : " + rank);
System.out.println("Primadonal Demon        : " + PrimadonalDemon);

    
  }
  
