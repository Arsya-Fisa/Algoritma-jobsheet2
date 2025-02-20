public class DosenMain01 {
    public static void main(String[] args) {
        Dosen01 ds1 = new Dosen01();
    ds1.idDosen = "001A";
    ds1.nama = "Dr.Ambatukam";
    ds1.statusAktif = true;
    ds1.tahunBergabung = 2024;
    ds1.bidangKeahlian ="Biologi";
    ds1.tampilinformasi();

    Dosen01 ds2 = new Dosen01("001B","Prof.Rusdi",true,2020,"Geologi");
    ds2.tampilinformasi();

    ds2.setStatusAktif(false);
    System.out.println("Setelah status diubah:");
    System.out.println("======================");
    ds2.tampilinformasi();
    int tahunSekarang = 2025;
    System.out.println("Masa kerja " + ds1.nama + ": " + ds1.hitungMasaKerja(tahunSekarang)+ " Tahun");
    ds1.ubahKeahlian("Seni Budaya");
    System.out.println("Kelahliah diubah menjadi: ");
    System.out.println("======================");
    ds1.tampilinformasi();

    }
}
