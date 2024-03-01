public class MainTas {
    public static void main(String[] args) {

        // instan objek bernama t1
        Tas t1  = new Tas();
        t1.setHarga(100000);
        t1.setMerk("Lola Bag");
        t1.setModel("Ransel");
        t1.setWarna("Pink");
         t1.displayMessage();

        // mendapatkan nilai variabel
        String warna = t1.getWarna();
        System.out.println(warna);

         System.out.println("=====================");

        // instan objek baru t2
        Tas m2 = new Tas();
        t2.setHarga(50000);
        t2.setMerk("Kuvi Bag");
        t2.setModel("Sling Bag");
        t2.setWarna("Ungu");
         t2.displayMessage();
         System.out.println("======================");

        // merubah warna dari objek t1
        System.out.println("Tas pada objek t1 diubah menjadi warna Biru");
        t1.setWarna("Biru");

        // menampilkan hasil perubahan
         t1.displayMessage();

    }
}
