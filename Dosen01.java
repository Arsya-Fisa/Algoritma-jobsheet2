public class Dosen01 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian; 

    public Dosen01 (){

    }
    public Dosen01 (String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    void tampilinformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " +  nama);
        System.out.println("Status aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif") );
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang kieahlian: " + bidangKeahlian);
    }
    void setStatusAktif(boolean status){
        statusAktif = status;
    }
    int hitungMasaKerja(int tahunSekarang){
        return tahunSekarang - tahunBergabung;
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
