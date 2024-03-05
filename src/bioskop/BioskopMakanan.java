
package bioskop;


// Subclass dari bioskop
public class BioskopMakanan extends Bioskop { //
    private String jenisMakanan;
    private int hargaMakanan;

    // Constructor, tidak ada void dan tidak ada return value
    // Setiap jumlah parameter yang di deklarasikan di method atau constructor, ketika dipanggil
    // di class lain atau dengan objek, maka objek tersebut harus wajib juga di deklarasikan
    // jumlah parameternya sesuai dengan deklarasi parameter di method. 
    public BioskopMakanan(String nama, String lokasi, String jenisMakanan, int hargaMakanan) {
        super(nama, lokasi); //untuk memanggil parameter nama dan lokasi yang ada di superclass
        this.jenisMakanan = jenisMakanan;
        this.hargaMakanan = hargaMakanan;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    public int getHargaMakanan() {
        return hargaMakanan;
    }
}