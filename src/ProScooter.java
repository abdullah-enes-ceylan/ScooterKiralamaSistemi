public class ProScooter extends Arac{

    public ProScooter(String aracId, int sarjYuzdesi, String konum, AracDurumu durum) {
        super(aracId, sarjYuzdesi, konum, durum);
    }


    @Override
    public double ucretHesapla(int dakika){
        int dkBasiUcret = 4;
        int acilisUcreti = 10;
        return ((dkBasiUcret *dakika) + acilisUcreti);
    }



    @Override
    public String getAracTipi(){
        return "Pro";
    }




    @Override
    public String toString() {
        return "ProScooter " +
                "aracId = '" + getAracId() + '\'' +
                ", sarjYuzdesi = " + getSarjYuzdesi() +
                ", konum = '" + getKonum() + '\'' +
                ", durum = " + super.getDurum();
    }
}
