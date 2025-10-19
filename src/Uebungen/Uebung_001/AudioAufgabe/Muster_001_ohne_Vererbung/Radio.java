package Uebungen.Uebung_001.AudioAufgabe.Muster_001_ohne_Vererbung;

public class Radio {
    private boolean isOn;
    private int volume;
    private double frequency;

    public Radio() {
        this.isOn = true;
        this.volume = 20;
        this.frequency = 88.7;
    }

    public Radio(boolean isOn, int volume, double frequency) {
        this.isOn = isOn;

        // check volume
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            throw new IllegalArgumentException();
        }
        // check Frequency
        setFrequency(frequency);
    }

    void switchOn() {
        this.isOn = true;
    }

    void switchOff() {
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
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

    public int getVolume() {
        return volume;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        if (frequency >= 87.5 && frequency <= 108.0) {
            this.frequency = frequency;
        } else {
            throw new IllegalArgumentException();
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
        return "Radio [Frequency = " + frequency + ", volume = " + volume + ", is " + status + "]";
    }
}
