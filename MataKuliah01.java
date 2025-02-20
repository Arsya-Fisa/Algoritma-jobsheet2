public class MataKuliah01 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahjam;
    public MataKuliah01() {

    }
    public MataKuliah01 (String kodeMk, String nama, int sks, int jumlahjam) {
        this.kodeMk = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }
    void tampilInformasi(){
        System.out.println("Kode Mk: " + kodeMk);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlahjam: " +jumlahjam) ;
    }
    void ubahSKS(int sksbaru) {
        sks = sksbaru;
    }
    void tambahJam (int jam){
        jumlahjam +=jam;
        System.out.println("Jumlah jam sekarang: " + jumlahjam);
    }
    void kurangiJam(int jam) {
        if (jam > jumlahjam) {
            System.out.println("jumlah jam awal lebih kecil dari jam pengurang");
        }else {
            jumlahjam -= jam;
            System.out.println("Jumlah jam sekarang: " + jumlahjam);
        }
    }
}
