package leluluokkaharjoitus;

public class Main {

	public static void main(String[] args) {
		Lelu nukke = new Lelu("Mollamaija", 350);
		Vieteriauto auto = new Vieteriauto("ralliauto", 200, 5);
		
		nukke.tulostaTiedot();
		auto.tulostaTiedot();
		
		auto.kiihdyta();
		
		auto.tulostaTiedot();

	}

}
