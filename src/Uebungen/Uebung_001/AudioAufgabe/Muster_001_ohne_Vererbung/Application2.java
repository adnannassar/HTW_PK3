package Uebungen.Uebung_001.AudioAufgabe.Muster_001_ohne_Vererbung;

public class Application2 {
    public static void main(String[] args) {
        Radio pocketRadio = new Radio();
        System.out.println( pocketRadio ); // Radio[frequency = 88.7, volume = 20, is on]
        Mp3Player mp3Player = new Mp3Player();
        mp3Player.startPlaying();
        System.out.println( mp3Player ); // Mp3Player[is playing, volume = 20, is on]
        mp3Player.stopPlaying();
        System.out.println( mp3Player ); // Mp3Player[not playing, volume = 20, is on]
        mp3Player.switchOff();
        System.out.println( mp3Player ); // Mp3Player[not playing, volume = 20, is off]
        mp3Player.switchOn();
        System.out.println( mp3Player ); // Mp3Player[not playing, volume = 20, is on]
        mp3Player.volumeUp();
        mp3Player.volumeUp();
        mp3Player.switchOff();
        System.out.println( mp3Player ); // Mp3Player[not playing, volume = 22, is off]
    }
}
