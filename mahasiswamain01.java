
public class mahasiswamain01 {
    public static void main(String[] args) {
       

        mahasiswa01 mhs1 = new mahasiswa01();
        mhs1.nama = "Muhammad Ali farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(2.60);
        mhs1.tampilkanInformasi();

        mahasiswa01 mhs2 = new mahasiswa01("Annisa Nabila", "2141720" , 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();;

        mahasiswa01 mhs3 = new mahasiswa01("Arsya Fikri", "244107060121", 3.60, "SIB 1A");
        mhs3.tampilkanInformasi();
    }
}
