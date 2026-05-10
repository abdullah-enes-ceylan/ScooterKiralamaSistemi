public class KiralamaLogGozlemcisi implements KiralamaGozlemcisi {

	@Override
	public void kiralamaGerceklesti(Arac arac, int sure) {
		System.out.println("LOG: " + arac.getAracId() +
				" (" + arac.getAracTipi() + ") " + sure + " dakika kiralandı.");
	}
}