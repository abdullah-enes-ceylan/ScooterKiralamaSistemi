public abstract class Arac implements ISarjEdilebilir{
    protected String aracId;
    protected int sarjYuzdesi;
    protected String konum;
    private boolean kiradaMi;

    public Arac(String aracId, int sarjYuzdesi, String konum, boolean kiradaMi) {
        this.aracId = aracId;
        this.sarjYuzdesi = sarjYuzdesi;
        this.konum = konum;
        this.kiradaMi = kiradaMi;
    }

    public abstract double ucretHesapla(int dakika);


    public String getAracId() {
        return aracId;
    }

    public void setAracId(String aracId) {
        this.aracId = aracId;
    }

    public int getSarjYuzdesi() {
        return sarjYuzdesi;
    }

    public void setSarjYuzdesi(int sarjYuzdesi) {
        this.sarjYuzdesi = sarjYuzdesi;
    }

    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }

    public boolean KiradaMi() {
        return kiradaMi;
    }

    public void setKiradaMi(boolean kiradaMi) {
        this.kiradaMi = kiradaMi;
    }



}
