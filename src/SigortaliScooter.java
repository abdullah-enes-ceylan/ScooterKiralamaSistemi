public class SigortaliScooter extends ScooterDecorator {

    public SigortaliScooter(Arac arac) {
        super(arac);
    }

    @Override
    public double ucretHesapla(int dakika) {
        // Sigorta bedeli olarak sabit 15 TL ek ücret ekleniyor
        return super.ucretHesapla(dakika) + 15.0;
    }

    @Override
    public String getAracTipi() {
        return super.getAracTipi() + " (Sigortalı)";
    }

}
