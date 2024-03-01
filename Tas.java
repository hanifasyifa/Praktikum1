public class Tas {
    private String merk;
    private String warna;
    private String model;
    private int harga;

    public void setMerk(String m) {
        merk = m;
    }

    public void setWarna(String m) {
        warna = m;
    }

    public void setModel(String m){
        model = m;
    }

    public void setHarga(String i){
        harga = i
    }

    public int getHarga() {
        return harga;
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public void displayMessage() {
        System.out.println("Tas anda memiliki merk : " + merk);
        System.out.println("berwarna : " + warna);
        System.out.println("dengan model : " + model);
        System.out.println("seharga : Rp." + harga);
    }

}
