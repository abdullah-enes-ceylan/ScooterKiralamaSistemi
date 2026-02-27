import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StandartScooterTest {

    @Test
    void should_DogruUcreti_Dondurmeli_When_60DakikaVerilirse() {
        StandartScooter scooter = new StandartScooter("S1", 100, "Merkez", AracDurumu.MUSAIT);

        double ucret = scooter.ucretHesapla(60);

        assertEquals(125.0, ucret);
    }
}