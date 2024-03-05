package bioskop;

// Polymorphism class untuk pengujian
public class Polymorphism {
    public static void main(String[] args) {
        
        Bioskop bioskop1 = new BioskopFilm("XXI Mall A", "Jakarta", "Spider-Man: No Way Home", 75000);
        
        System.out.println("Bioskop: " + bioskop1.getNama()); // ini harus dipanggil pake getter method
        System.out.println("Lokasi: " + bioskop1.getLokasi()); // jadi ga bisa lgsg ambil atributnya
        System.out.println("Judul Film: " + bioskop1.getJudulFilm()); // karena, hak aksesnya adalah private
        System.out.println("Harga Tiket: " + bioskop1.getHargaTiket());

        
        BioskopMakanan bioskop2 = new BioskopMakanan("XXI Mall A", "Jakarta", "Popcorn", 25000);
        
        System.out.println("Jenis Makanan: " + bioskop2.getJenisMakanan());
        System.out.println("Harga Makanan: " + bioskop2.getHargaMakanan());

        // (BioskopFilm) bioskop1 itu biar bioskop1 menjadi class turunan BioskopFilm
        // karena constructor Pemesanan membutuhkan objek BioskopFilm sebagai argumen pertama
        Pemesanan pemesananBudi = new Pemesanan((BioskopFilm) bioskop1, bioskop2);
        
        Polymorphism polymorphism = new Polymorphism();
        polymorphism.tampilkanInfoPemesanan(pemesananBudi);
    }

    // Method untuk menampilkan informasi pemesanan
    public void tampilkanInfoPemesanan(Pemesanan pemesanan) {
        System.out.println("Budi memesan film berjudul " + pemesanan.getFilm().getJudulFilm() + " dengan harga " + pemesanan.getFilm().getHargaTiket());
        System.out.println("Budi juga membeli makanan " + pemesanan.getMakanan().getJenisMakanan() + " dengan harga " + pemesanan.getMakanan().getHargaMakanan());
        int totalBiaya = pemesanan.getFilm().getHargaTiket() + pemesanan.getMakanan().getHargaMakanan();
        System.out.println("Total yang harus dibayarkan Budi adalah " + totalBiaya);
    }
}