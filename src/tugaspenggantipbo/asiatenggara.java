package tugaspenggantipbo;

public class asiatenggara extends ciriManusia {

    public void hasil() {
        int rataratatinggi = 155;
        String makananpokok = "Beras/Jagung";
        String warnakulit = "Kuning Langsat";

        ciriManusia LMBG = new ciriManusia();

        LMBG.inputData("Indonesia , Malaysia , Singapura , Thailand DLL", "ASEAN", "Hitam", 10);
        LMBG.tampilkandata();

        System.out.println("Rata Rata Tinggi Badan :" + rataratatinggi);
        System.out.println("Makanan Pokok :" + makananpokok);
        System.out.println("Rata Rata Warna Kulit :" + warnakulit);

    }
}
