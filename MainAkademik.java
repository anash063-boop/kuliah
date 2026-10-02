public class MainAkademik{
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("SI2025001", "Ibrahim Mah", 40, 3.50);
        Mahasiswa mhs2 = new Mahasiswa("SI2025002", "Ismail Lamdoh", 60, 3.60);

        System.out.println("Data Sebelum Penambahan Nilai");
        mhs1.tampilkanData();
        mhs2.tampilkanData();

        System.out.println("Melakukan Penambahan Nilai Semester");
        mhs1.hitungIPKSemester(3.80);
        System.out.println("Ibrahim Mah : nilai akhir 3.80 (versi 1)");
        mhs2.hitungIPKSemester(3.90, 20);
        System.out.println("Ismail lamdoh : nilai akhir 3.90, bobot 20 SKS (versi 2)");
        System.out.println();

        System.out.println("Data Sesudah Penambahan Nilai");
        mhs1.tampilkanData();
        mhs2.tampilkanData();
    }
}