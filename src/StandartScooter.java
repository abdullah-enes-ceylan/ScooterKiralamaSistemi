public class StandartScooter extends Arac {
    private final FiyatlandirmaStratejisi fiyatlandirma;

    public StandartScooter(String aracId, int sarjYuzdesi, String konum, AracDurumu durum) {
        super(aracId, sarjYuzdesi, konum, durum);
        this.fiyatlandirma = new StandartFiyatlandirma();
    }

    @Override
    public double ucretHesapla(int dakika) {
        return fiyatlandirma.ucretHesapla(dakika);
    }

    @Override
    public String getAracTipi() {
        return "Standart";
    }

    @Override
    public String toString() {
        return "StandartScooter " +
                "aracId = '" + getAracId() + '\'' +
                ", sarjYuzdesi = " + getSarjYuzdesi() +
                ", konum = '" + getKonum() + '\'' +
                ", durum = " + getDurum();
    }
}