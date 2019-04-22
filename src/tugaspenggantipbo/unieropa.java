package tugaspenggantipbo;

public class unieropa extends ciriManusia {

    public void hasil() {
        int rataratatinggi = 183;
        String makananpokok = "Roti/Gandum";
        String warnakulit = "Putih";

        ciriManusia LMBG = new ciriManusia();

        LMBG.inputData("Belanda , Italia , Spanyol , Polandia Dll", "Uni-Eropa", "Blonde/Pirang", 28);
        LMBG.tampilkandata();
        System.out.println("Rata Rata Tinggi Badan :" + rataratatinggi);
        System.out.println("Makanan Pokok :" + makananpokok);
        System.out.println("Rata Rata Warna Kulit :" + warnakulit);

    }
}
