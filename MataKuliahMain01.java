public class MataKuliahMain01 {
    public static void main(String[] args) {
        
        MataKuliah01 mk1 = new MataKuliah01();
        mk1.kodeMk = "1A2B";
        mk1.nama = "IPS";
        mk1.sks = 4;
        mk1.jumlahjam = 5;
        mk1.tampilInformasi();

        
        MataKuliah01 mk2 = new MataKuliah01("2B3C", "Matematika", 3, 6);
        mk2.tampilInformasi();
        mk2.tambahJam(3);
        mk2.kurangiJam(2);
        mk2.ubahSKS(5);
        mk2.tampilInformasi();
    }
}
