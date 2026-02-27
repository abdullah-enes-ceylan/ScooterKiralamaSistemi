import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class KiralamaSistemi{

    private static final int MIN_SARJ_SINIRI = 10;
    private final IVeriKaynagi veriKaynagi;
    private List<Arac> araclar;

    public KiralamaSistemi(IVeriKaynagi veriKaynagi){
        this.veriKaynagi = veriKaynagi;
        this.araclar = veriKaynagi.verileriYukle();
    }



    public void aracEkle(Arac arac){
        veriKaynagi.aracKaydet(arac);
        araclar.add(arac);
    }

    public void aracKirala(String id, int sure) throws YetersizSarjException {
        if (sure <= 0){
            System.err.println("Hata: kiralama süresi 0 Veya negatif olamaz");
            return;
        }
        for (Arac a : araclar) {
            if (a.getAracId().equalsIgnoreCase(id)) {
                if (a.getSarjYuzdesi() < MIN_SARJ_SINIRI) {
                    a.setDurum(AracDurumu.SARJI_YETERSIZ);
                    veriKaynagi.durumGuncelle(a.getAracId(), AracDurumu.SARJI_YETERSIZ);
                    throw new YetersizSarjException("Aracın şarjı %20'nin altında, kiralanamaz!");
                }
                if (a.getDurum() == AracDurumu.MUSAIT) {
                    System.out.println("Araç kiralandı. Ücret : " + a.ucretHesapla(sure));
                    a.setDurum(AracDurumu.KIRADA);
                    veriKaynagi.durumGuncelle(a.getAracId(), AracDurumu.KIRADA);
                } else {
                    System.out.println("Hata : " + a.getDurum());
                }
                return;
            }
        }
        System.out.println("Hata : Araç bulunamadı");
    }

    public void tumAraclariListele(){
        for (Arac arac : araclar){
            System.out.println(arac);
        }
    }

    public boolean idKontrol(String id){
        for (Arac arac : araclar){
            if(id.equalsIgnoreCase(arac.getAracId())){
                System.out.println("Araç zaten mevcut");
                return true;
            }
        }
        return false;
    }

    public boolean musaitlikSorgulama(String id){
        for (Arac arac : araclar){
            if (arac.getAracId().equalsIgnoreCase(id)){
                if (arac.getDurum() != AracDurumu.MUSAIT || arac.getSarjYuzdesi() < MIN_SARJ_SINIRI){
                    System.out.println("Araç şuan müsait değil");
                    System.out.println("Durum: " + arac.getDurum());
                    return false;
                }
                else{
                    System.out.println("Araç şuan müsait");
                    return true;
                }
            }
        }
        System.out.println("girilen id ye sahip araç bulunamadı!");
        return false;
    }


}
