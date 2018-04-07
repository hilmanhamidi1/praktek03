package praktek03;
public class kipasanginaksi {
    public static void main(String[] args) {
        kipasangin k = new kipasangin();
        k.setMerk("Miyako");
        k.setWarna("Merah");
        k.setBentuk("Berdiri");
        k.setHarga(300000);
        
        k.cetakInfo();
        System.out.println("--------------------");
        System.out.println("Merknya \t     :");
        System.out.println(k.getMerk());
        System.out.println("Warnanya \t     :");
        System.out.println(k.getWarna());
        System.out.println("Bentuknya \t     :");
        System.out.println(k.getBentuk());
        System.out.println("Harganya \t     :");
        System.out.println(k.getHarga());
        
    }
      
}
