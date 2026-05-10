public class KiralamaFacade {

	private final KiralamaSistemi kiralamaSistemi;

	public KiralamaFacade() {
		IVeriKaynagi veriTabani = VeriTabaniYoneticisi.getInstance();
		veriTabani.tabloOlustur();
		this.kiralamaSistemi = new KiralamaSistemi(veriTabani);
		kiralamaSistemi.gozlemciEkle(new SarjUyariGozlemcisi());
		kiralamaSistemi.gozlemciEkle(new KiralamaLogGozlemcisi());
	}

	public void aracEkle(Arac arac) {
		kiralamaSistemi.aracEkle(arac);
	}

	public void aracKirala(String id, int sure) throws YetersizSarjException {
		kiralamaSistemi.aracKirala(id, sure);
	}

	public boolean musaitlikSorgulama(String id) {
		return kiralamaSistemi.musaitlikSorgulama(id);
	}

	public void tumAraclariListele() {
		kiralamaSistemi.tumAraclariListele();
	}

	public boolean idKontrol(String id) {
		return kiralamaSistemi.idKontrol(id);
	}
}