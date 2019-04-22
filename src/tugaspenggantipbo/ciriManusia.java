package tugaspenggantipbo;

public class ciriManusia {

    protected String negara;
    protected String warna;
    protected int jumlahanggota;
    protected String rambut;

    public String Jenisrambut() {
        return rambut;
    }

    public void Rambut(String rambut) {
        this.rambut = rambut;
    }

    public int Jumlahanggota() {
        return jumlahanggota;
    }

    public void Jumlahanggota(int jumlahanggota) {
        this.jumlahanggota = jumlahanggota;
    }

    public String negara() {
        return negara;
    }

    public void merek(String negara) {
        this.negara = negara;
    }

    public String Warna() {
        return warna;
    }

    public void warna(String warna) {
        this.warna = warna;
    }

    public void tampilkandata() {
        System.out.println("Negara Meliputi :" + negara());
        System.out.println("Nama Perhimpunan :" + Warna());
        System.out.println("Jumlah Anggota :" + Jumlahanggota());
        System.out.println("Warna Rambut :" + Jenisrambut());
    }

    public void inputData(String m, String w, String r, int a) {
        merek(m);
        warna(w);
        Rambut(r);
        Jumlahanggota(a);

    }
}
