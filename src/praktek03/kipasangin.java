package praktek03;
public class kipasangin {

private String merk;
private String warna;
private String bentuk;
private double harga;


void cetakInfo(){
    System.out.println("Merk\t           : " +merk+"\n"+
            "Warna \t           : " +warna+"\n"+
            "Bentuk \t           : " +bentuk+"\n"+
            "Harga \t           : " +harga);
        
}

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBentuk() {
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

}
