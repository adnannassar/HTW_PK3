package Uebungen.Uebung_001.AudioAufgabe.Muster_001_ohne_Vererbung;

public class Application {
    public static void main(String[] args) {
        Radio grandmasOldRadio = new Radio();
        System.out.println( grandmasOldRadio.isOn() ); // true
        System.out.println( grandmasOldRadio.getVolume() ); // 20
        System.out.println( grandmasOldRadio.getFrequency() ); // 88.7
        grandmasOldRadio.volumeUp();
        grandmasOldRadio.volumeUp();
        grandmasOldRadio.volumeDown();
        grandmasOldRadio.volumeUp();
        System.out.println( grandmasOldRadio.getVolume() ); // 22
        System.out.println( grandmasOldRadio.toString() ); // Radio[frequency = 88.7, volume = 22, is on]
        System.out.println( grandmasOldRadio ); // Radio[frequency = 88.7, volume = 22, is on]
        grandmasOldRadio.setFrequency(99.0);
        grandmasOldRadio.switchOff();
        System.out.println( grandmasOldRadio ); // Radio[frequency = 99.0, volume = 22, is off]
        Radio granpasOldRadio = new Radio(false, 0, 99.5);
        System.out.println( granpasOldRadio ); // Radio[frequency = 99.5, volume = 0, is off]
    }
}
