package Uebungen.Uebung_001.AudioAufgabe.Muster_001_mit_Vererbung;

public class Mp3Player extends AudioDevice {
    private boolean isPlaying;

    public Mp3Player() {
        super(true, 20);
        this.isPlaying = false;
    }

    public Mp3Player(boolean isOn, int volume, boolean isPlaying) {
        super(isOn, volume);
        this.isPlaying = isPlaying;
    }

    public  void startPlaying() {
        this.isPlaying = true;
    }

    public   void stopPlaying() {
        this.isPlaying = false;
    }

    public  boolean isPlaying() {
        return this.isPlaying;
    }

    @Override
    public String toString() {
        String status;
        if (isOn()) {
            status = "On";
        } else {
            status = "Off";
        }
        return "Mp3Player [is Playing = " + isPlaying + ", volume = " + getVolume() + ", is " + status + "]";
    }
}
