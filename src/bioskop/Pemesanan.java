package bioskop;

// Kelas Pemesanan
public class Pemesanan {
    private BioskopFilm film; // jenis data dari kelas BioskopFilm 
    private BioskopMakanan makanan;

    // Constructor
    public Pemesanan(BioskopFilm film, BioskopMakanan makanan) {
        this.film = film;
        this.makanan = makanan;
    }

    
    public BioskopFilm getFilm() {
        return film;
    }

    
    public BioskopMakanan getMakanan() {
        return makanan;
    }
}