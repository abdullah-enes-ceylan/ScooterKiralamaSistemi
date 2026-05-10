public class SarjUyariGozlemcisi implements KiralamaGozlemcisi {
	private static final int DUSUK_SARJ_SINIRI = 30;

	@Override
	public void kiralamaGerceklesti(Arac arac, int sure) {
		if (arac.getSarjYuzdesi() < DUSUK_SARJ_SINIRI) {
			System.out.println("⚠️ UYARI: " + arac.getAracId() +
					" aracının şarjı düşük (%"+ arac.getSarjYuzdesi() + "). Şarj önerilir!");
		}
	}
}