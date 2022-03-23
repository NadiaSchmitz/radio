import Prog1Tools.IOTools;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Das Radio in der Küche");
		System.out.println("*****");
		
		// Radio in der Küche
		Radio kueche_radio = new Radio(true, 3, 90.0);
		
		// Lauter
		kueche_radio.volumeUp();
		kueche_radio.volumeUp();
		kueche_radio.volumeUp();
		kueche_radio.volumeUp();
		kueche_radio.volumeUp();
		kueche_radio.volumeUp();
		kueche_radio.volumeUp();
		
		// Leiser
		kueche_radio.volumeUnder();
		kueche_radio.volumeUnder();
		kueche_radio.volumeUnder();
		
		// Radio ein- oder ausgeschaltet
		kueche_radio.on();
		
		// Radio Program finden
		kueche_radio.selectProgram();
		
		// Radio Küche Info
		kueche_radio.infoToString();
		
		System.out.println();
		
		System.out.println("Das Radio im Wohnzimmer");
		System.out.println("*****");
		
		// Radio im Wohnzimmer
		Radio wohnzimmer_radio = new Radio(false, 6, 100.0);
		
		// Lauter
		wohnzimmer_radio.volumeUp();
		wohnzimmer_radio.volumeUp();
		wohnzimmer_radio.volumeUp();
		wohnzimmer_radio.volumeUp();
		wohnzimmer_radio.volumeUp();
		
		// Leiser
		wohnzimmer_radio.volumeUnder();
		
		// Radio ein- oder ausgeschaltet
		wohnzimmer_radio.on();
		
		// Radio Program finden
		wohnzimmer_radio.selectProgram();
		
		// Radio Wohnzimmer Info
		wohnzimmer_radio.infoToString();
		
		System.out.println();
		
		System.out.println("Das Radio im Badezimmer");
		System.out.println("*****");
		
		// Radio im Badezimmer
		Radio badezimmer_radio = new Radio();
		
		// Set 
		badezimmer_radio.setIsOn(true);
		badezimmer_radio.setVolume(9);
		badezimmer_radio.setFrequenz(0);
		
		// Radio im Badezimmer Info
		badezimmer_radio.infoToString();
		
	}

}
