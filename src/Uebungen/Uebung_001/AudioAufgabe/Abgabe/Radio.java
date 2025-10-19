package Uebungen.Uebung_001.AudioAufgabe.Abgabe;

public class Radio extends AudioDevice {
    private double frequency;

    public Radio() {
        super(true, 20);
        this.frequency = 88.7;
    }

    public Radio(boolean isOn, int volume, double frequency) {
        super(isOn, volume);
        setFrequency(frequency);
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
        if (isOn()) {
            status = "On";
        } else {
            status = "Off";
        }
        return "Radio [Frequency = " + frequency + ", volume = " + getVolume() + ", is " + status + "]";
    }

    public static double stationNameToFrequency(String stationName) {
        if(stationName == null){
            return 0.0;
        }else{
            if (stationName.equals("News Radio")) {
                return 88.9;
            } else if (stationName.equals("Pop Radio")) {
                return 98.2;
            } else if (stationName.equals("Classic Radio")) {
                return 103.4;
            } else {
                return 0.0;
            }
        }

    }
}
