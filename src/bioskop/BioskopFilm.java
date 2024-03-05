
package bioskop;

// Subclass
public class BioskopFilm extends Bioskop {
    private String judulFilm;
    private int hargaTiket; // Perubahan di sini

    // Constructor
    public BioskopFilm(String nama, String lokasi, String judulFilm, int hargaTiket) {
        super(nama, lokasi); //memanggil constructor dari superclass dengan parameter yang sesuai
        this.judulFilm = judulFilm;
        this.hargaTiket = hargaTiket; // Inisialisasi harga tiket
    }

    // Getter methods
    public String getJudulFilm() {
        return judulFilm;
    }

    @Override
    public int getHargaTiket() {
        return hargaTiket;
    }
}
