
package bioskop;


// Superclass
public class Bioskop {
    private String nama; //ini buat encaptulation
    private String lokasi; //deklarasikan atributnya dengan hak akses private

    // Constructor, tidak ada void dan tidak ada return value
    // Setiap jumlah parameter yang di deklarasikan di method atau constructor, ketika dipanggil
    // di class lain atau dengan objek, maka objek tersebut harus wajib juga di deklarasikan
      // jumlah parameternya sesuai dengan deklarasi parameter di method. 
    public Bioskop(String nama, String lokasi) {
        this.nama = nama; // this itu untuk mengakses atribut pada class itu sendiri
        this.lokasi = lokasi; // itu kan atribut sama parameternya sama, kl ga pake this ntr ngambil
        // di parameter, nnti jdnya null
    }

    // Getter methods, ini biar class lain bisa mengakses atribut yang private itu
    public String getNama() {
        return nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    //memberikan nilai default jika tidak ada informasi yang spesifik untuk dikembalikan
    // Tambahkan metode untuk mendapatkan judul film
    public String getJudulFilm() {
        return ""; // Atau kembalikan nilai default yang sesuai
    }

    // Tambahkan metode untuk mendapatkan harga tiket
    public int getHargaTiket() {
        return 0; // Atau kembalikan nilai default yang sesuai
    }
}
