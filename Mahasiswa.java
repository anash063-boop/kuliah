public class Mahasiswa {
    public String nim;
    public String nama;
    public int sks;
    public double ipk;

    public Mahasiswa(String nim, String nama, int sks, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.sks = sks;
        this.ipk = ipk;
    }
    public void hitungIPKSemester(double nilaiAkhir){
        this.ipk = (this.ipk + nilaiAkhir) / 2;
    }
    public void hitungIPKSemester(double nilaiAkhir, int bobotSks) {
    this.ipk = ((this.ipk * this.sks) + (nilaiAkhir * bobotSks))
             / (this.sks + bobotSks);

    this.sks = this.sks + bobotSks;
    }
    public void tampilkanData(){
        System.out.println("NIM         : " + this.nim);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Total SKS   : " + this.sks);
        System.out.println("IPK         : " + String.format("%.2f", this.ipk));
        System.out.println("-----------------------------------");
    }
}