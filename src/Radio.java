public class Radio {

	private boolean isOn;
	private int volume;
	double frequenz;
	
	public Radio() {
		
	}
	
	public Radio(boolean isOn, int volume, double frequenz) {
		this.isOn = isOn;
		this.volume = volume;
		this.frequenz = frequenz;
	}
	
	public boolean getIsOn() {
		return isOn;
	}
	
	public void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public double getFrequenz() {
		return frequenz;
	}
	
	public void setFrequenz(double frequenz) {
		frequenz = Math.ceil(Math.random() * 120);
		if (frequenz >= 110.0 | frequenz <= 85.0) {
			frequenz = 99.9;
		}
		this.frequenz = frequenz;
	}
	
	public void volumeUp() {
		if (volume < 10) {
			volume = volume + 1;
			System.out.println("Lautstärke beträgt: " + volume);
		} else {
			System.out.println("Die Lautstärke ist nicht zulässig.");
		}
	}
	
	public void volumeUnder() {
		if (volume > 1) {
			volume = volume - 1;
			System.out.println("Lautstärke beträgt: " + volume);
		} else {
			System.out.println("Die Lautstärke ist nicht zulässig.");
		}
	}
	
	public void on() {
		if (isOn) {
			System.out.println("Radio ist eingeshaltet");
		} else {
			System.out.println("Radio ist nicht eingeshaltet");
		}
		
		isOn = !isOn;
		
		if (isOn) {
			System.out.println("Radio ist eingeshaltet");
		} else {
			System.out.println("Radio ist nicht eingeshaltet");
		}
	}
	
	public void selectProgram() {
		frequenz = Math.ceil(Math.random() * 120);
		if (frequenz >= 110.0 | frequenz <= 85.0) {
			frequenz = 99.9;
		}
		System.out.println("Das Programm ist: " + frequenz);
	}
	
	public void infoToString() {
		System.out.println("Radio: " + getIsOn() + ", Frequenz: " + getFrequenz() + ", Lautschtärke: " + getVolume());
	}
}
