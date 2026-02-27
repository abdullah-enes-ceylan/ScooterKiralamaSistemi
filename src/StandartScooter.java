public class StandartScooter extends Arac{
    public StandartScooter(String aracId, int sarjYuzdesi, String konum, AracDurumu durum) {
        super(aracId, sarjYuzdesi, konum, durum);
    }


    @Override
    public double ucretHesapla(int dakika){
        int dkBasiUcret = 2;
        int acilisUcreti = 5;
        return ((dkBasiUcret *dakika) + acilisUcreti);
    }


    @Override
    public String getAracTipi(){
        return "Standart";
    }



    @Override
    public String toString() {
        return "StandartScooter " +
                "aracId = '" + getAracId() + '\'' +
                ", sarjYuzdesi = " + getSarjYuzdesi() +
                ", konum = '" + getKonum() + '\'' +
                ", durum = " + super.getDurum();

    }
}
