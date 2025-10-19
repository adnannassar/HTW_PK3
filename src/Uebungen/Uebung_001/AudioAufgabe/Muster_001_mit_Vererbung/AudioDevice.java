package Uebungen.Uebung_001.AudioAufgabe.Muster_001_mit_Vererbung;

public class AudioDevice {
    private boolean isOn;
    private int volume;

    public AudioDevice() {
        this.isOn = true;
        this.volume = 20;
    }

    public AudioDevice (boolean isOn, int volume) {
        this.isOn = isOn;
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void switchOn() {
        this.isOn = true;
    }

    public void switchOff() {
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void volumeUp() {
        if (volume < 100) {
            this.volume++;
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            this.volume--;
        }
    }

    public int getVolume() {
        return volume;
    }
}
