public class Main {
    public static void main(String[] args) {
        KiralamaFacade facade = new KiralamaFacade();
        KullaniciArayuzu arayuz = new KullaniciArayuzu(facade);
        arayuz.baslat();
    }
}