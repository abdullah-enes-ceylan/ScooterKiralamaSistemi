public class HasarGuvenceliScooter extends ScooterDecorator{

    public HasarGuvenceliScooter(Arac arac) {
        super(arac);
    }

    @Override
    public double ucretHesapla(int dakika) {
        // Hasar güvence bedeli olarak sabit 25 TL ek ücret ekleniyor
        return super.ucretHesapla(dakika) + 25.0;
    }

    @Override
    public String getAracTipi() {
        return super.getAracTipi() + " (Hasar Güvenceli)";
    }

}
