public class Main {
    public static void main(String[] args) {

        IVeriKaynagi veriTabani = VeriTabaniYoneticisi.getInstance();
        veriTabani.tabloOlustur();

        KiralamaSistemi sistem = new KiralamaSistemi(veriTabani);

        KullaniciArayuzu arayuz = new KullaniciArayuzu(sistem);
        arayuz.baslat();
    }
}