package leluluokkaharjoitus;

public class Main {

	public static void main(String[] args) {
		Lelu nukke = new Lelu("Mollamaija", 350);
		Vieteriauto auto = new Vieteriauto("ralliauto", 200, 5);
		RobottiKoira Robo = new RobottiKoira("Rekku", 750, "Ruskea");
		
		nukke.tulostaTiedot();
		auto.tulostaTiedot();
		Robo.tulostaTiedot();
		
		auto.kiihdyta();
		Robo.noudaPallo();
		
		auto.tulostaTiedot();
		Robo.tulostaTiedot();
		
		

	}

}

class Lelu {
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

class Vieteriauto extends Lelu{

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

class RobottiKoira extends Lelu{
	private String vari;
	private int akkuaJaljella;
	
	public RobottiKoira() {
		this.nimi = "";
		this.paino =0;
		this.vari = "";
		this.akkuaJaljella = 100;
	}
	
	public RobottiKoira(String nimi, int paino, String vari) {
		this.nimi = nimi;
		this.paino = paino;
		this.vari = vari;
		this.akkuaJaljella = 100;
	}
	
	public void noudaPallo() {
		this.akkuaJaljella = this.akkuaJaljella - 5;
		if (this.akkuaJaljella < 0) {
			this.akkuaJaljella = 0;
			System.out.println("Akku loppui kesken matkan");
		}
		else {
			System.out.println(this.nimi + " nouti pallon!");
		}
	}
	
	@Override
	public void tulostaTiedot() {
		System.out.println("Lelun nimi: " + this.nimi + 
							", lelun paino: " + this.paino +
							", lelun väri: " + this.vari +
							", akkua jäljellä: " + this.akkuaJaljella);
	}
}
