package leluluokkaharjoitus;

public class Vieteriauto extends Lelu{

	private int nopeus;
	
	public Vieteriauto() {
		this.nimi = "";
		this.paino = 0;
		this.nopeus = 0;
	}
	
	public Vieteriauto(String nimi, int paino, int nopeus) {
		this.nimi = nimi;
		this.paino = paino;
		this.nopeus = nopeus;
	}
	
	public void kiihdyta() {
		this.nopeus++;
	}
	
	@Override
	public void tulostaTiedot() {
		System.out.println("Lelun nimi: " + this.nimi + ", lelun paino: " + this.paino + ", lelun nopeus: " + this.nopeus);
	}
}
