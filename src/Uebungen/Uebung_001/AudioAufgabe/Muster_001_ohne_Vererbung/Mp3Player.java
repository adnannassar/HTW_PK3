package Uebungen.Uebung_001.AudioAufgabe.Muster_001_ohne_Vererbung;

public class Mp3Player {
    private boolean isOn;
    private int volume;
    private boolean isPlaying;

    public Mp3Player() {
        this.isOn = true;
        this.volume = 20;
        this.isPlaying = false;
    }

    public Mp3Player(boolean isOn, int volume, boolean isPlaying) {
        this.isOn = isOn;
        this.volume = volume;
        this.isPlaying = isPlaying;
    }

    void startPlaying() {
        this.isPlaying = true;
    }

    void stopPlaying() {
        this.isPlaying = false;
    }

    boolean isPlaying() {
        return this.isPlaying;
    }

    void switchOn() {
        this.isOn = true;
    }

    void switchOff() {
        this.isOn = false;
        stopPlaying();
    }

    boolean isOn() {
        return this.isOn;
    }

    void volumeUp() {
        if (volume < 100) {
            this.volume++;
        }

    }

    void volumeDown() {
        if (volume > 0) {
            this.volume--;
        }

    }

    @Override
    public String toString() {
        String status;
        if (isOn) {
            status = "On";
        } else {
            status = "Off";
        }
        return "Mp3Player [is Playing = " + isPlaying + ", volume = " + volume + ", is " + status + "]";
    }
}
