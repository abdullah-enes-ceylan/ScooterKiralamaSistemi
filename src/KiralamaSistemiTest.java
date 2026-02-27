import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class KiralamaSistemiTest {


    KiralamaSistemi sistem;

    @BeforeEach
    void setUp() {
        SahteVeriKaynagi sahteVeri = new SahteVeriKaynagi();
        sistem = new KiralamaSistemi(sahteVeri);

        Arac arac = new StandartScooter("S1", 100, "Merkez", AracDurumu.MUSAIT);
        sistem.aracEkle(arac);
    }


    class SahteVeriKaynagi implements IVeriKaynagi {

        private final Map<String, Arac> araclar = new HashMap<>();

        @Override
        public void tabloOlustur() {}

        @Override
        public Map<String, Arac> verileriYukle() {
            return araclar;
        }

        @Override
        public void aracKaydet(Arac arac) {
            araclar.put(arac.getAracId(), arac);
        }

        @Override
        public void durumGuncelle(String id, AracDurumu yeniDurum) {
            if (araclar.containsKey(id)) {
                araclar.get(id).setDurum(yeniDurum);
            }
        }
    }


    @Test
    void should_AracKirada_When_BasariliKiralama() throws YetersizSarjException {
        sistem.aracKirala("S1", 60);

        assertEquals(AracDurumu.KIRADA, sistem.getArac("S1").getDurum());
    }



    @Test
    void should_ThrowException_When_SarjYetersiz() {
        Arac dusukSarjliArac = new StandartScooter("S2", 5, "Merkez", AracDurumu.MUSAIT);
        sistem.aracEkle(dusukSarjliArac);

        assertThrows(YetersizSarjException.class, () -> sistem.aracKirala("S2", 60));
    }


    @Test
    void should_DurumDegismemeli_When_AracMusaitDegil() throws YetersizSarjException {
        sistem.getArac("S1").setDurum(AracDurumu.KIRADA);

        sistem.aracKirala("S1", 60);

        assertEquals(AracDurumu.KIRADA, sistem.getArac("S1").getDurum());
    }



    @Test
    void should_HataDondurmeli_When_SureNegatif() throws YetersizSarjException {
        sistem.aracKirala("S1", -1);

        assertEquals(AracDurumu.MUSAIT , sistem.getArac("S1").getDurum());
    }


}