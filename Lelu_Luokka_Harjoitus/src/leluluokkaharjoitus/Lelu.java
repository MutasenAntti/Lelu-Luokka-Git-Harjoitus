package leluluokkaharjoitus;

public class Lelu {
	protected String nimi;
	protected int paino;
	
	public Lelu() {
		this.nimi = "";
		this.paino = 0;
		
	}
	
	public Lelu(String nimi, int paino) {
		this.nimi = nimi;
		this.paino = paino;
	}
	
	public void tulostaTiedot() {
		System.out.println("Lelun nimi: " + this.nimi + ", lelun paino: " + this.paino);
	}
	
}
