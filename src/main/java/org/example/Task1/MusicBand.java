package org.example.Task1;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    String nameBand;
    List<String> namePlayers;
    int year;

    public MusicBand(String nameBand, int year, List<String> namePlayers) {
        this.nameBand = nameBand;
        this.year = year;
        this.namePlayers = namePlayers;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "Название группы='" + nameBand + '\'' +
                ", Имя учасника=" + namePlayers +
                ", Год основания=" + year +
                '}';
    }

    public String getNameBand() {
        return nameBand;
    }

    public void setNameBand(String nameBand) {
        this.nameBand = nameBand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getNamePlayers() {
        return namePlayers;
    }

    public void setNamePlayers(List<String> namePlayers) {
        this.namePlayers = namePlayers;
    }

    public static void migration(MusicBand musicBand1, MusicBand musicBand2) {

        List play1 = musicBand1.getNamePlayers();
        List play2 = musicBand2.getNamePlayers();
        List<String> play = new ArrayList<>();
        List<String> play1remove = new ArrayList<>();
        play.addAll(play1);
        play.addAll(play2);
        musicBand1.setNamePlayers(play1remove);
        musicBand2.setNamePlayers(play);
    }
}
