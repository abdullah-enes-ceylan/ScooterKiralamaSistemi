public class ProFiyatlandirma implements FiyatlandirmaStratejisi{
	private static final int DK_BASI_UCRET = 4;
	private static final int ACILIS_UCRETI = 10;

	@Override
	public double ucretHesapla(int dakika) {
		return (DK_BASI_UCRET * dakika) + ACILIS_UCRETI;
	}

}
