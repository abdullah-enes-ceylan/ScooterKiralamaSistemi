import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProScooterTest {

    @Test
    void should_DogruUcreti_Dondurmeli_When_60DakikaVerilirse() {
        ProScooter scooter = new ProScooter("P1", 100, "Merkez", AracDurumu.MUSAIT);

        double ucret = scooter.ucretHesapla(60);

        assertEquals(250.0, ucret);
    }
}