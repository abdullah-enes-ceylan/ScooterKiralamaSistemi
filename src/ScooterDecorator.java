public abstract class ScooterDecorator  extends Arac{

    protected Arac dekoreEdilenArac;

    public ScooterDecorator(Arac arac) {
        super(arac.getAracId(), arac.getSarjYuzdesi(), arac.getKonum(), arac.getDurum());
        this.dekoreEdilenArac = arac;
    }

    @Override
    public double ucretHesapla(int dakika) {
        return dekoreEdilenArac.ucretHesapla(dakika);
    }

    @Override
    public String getAracTipi() {
        return dekoreEdilenArac.getAracTipi();
    }

}
