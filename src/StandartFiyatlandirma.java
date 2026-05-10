public class StandartFiyatlandirma implements FiyatlandirmaStratejisi{
	private static final int DK_BASI_UCRET = 2;
	private static final int ACILIS_UCRETI = 5;

	@Override
	public double ucretHesapla(int dakika) {
		return (DK_BASI_UCRET * dakika) + ACILIS_UCRETI;
	}
}
