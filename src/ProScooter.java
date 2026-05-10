public class ProScooter extends Arac {
    private final FiyatlandirmaStratejisi fiyatlandirma;

    public ProScooter(String aracId, int sarjYuzdesi, String konum, AracDurumu durum) {
        super(aracId, sarjYuzdesi, konum, durum);
        this.fiyatlandirma = new ProFiyatlandirma();
    }

    @Override
    public double ucretHesapla(int dakika) {
        return fiyatlandirma.ucretHesapla(dakika);
    }

    @Override
    public String getAracTipi() {
        return "Pro";
    }

    @Override
    public String toString() {
        return "ProScooter " +
                "aracId = '" + getAracId() + '\'' +
                ", sarjYuzdesi = " + getSarjYuzdesi() +
                ", konum = '" + getKonum() + '\'' +
                ", durum = " + getDurum();
    }
}