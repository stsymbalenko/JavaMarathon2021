package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> groups = new ArrayList<>();

        MusicBand group1 = new MusicBand("The Beatles", 1990);
        MusicBand group2 = new MusicBand("Nirvana", 2001);
        MusicBand group3 = new MusicBand("Led Zeppelin", 2010);
        MusicBand group4 = new MusicBand("Green Day", 2005);
        MusicBand group5 = new MusicBand("Metallica", 1995);
        MusicBand group6 = new MusicBand("Queen", 1980);
        MusicBand group7 = new MusicBand("The White Stripes", 1996);
        MusicBand group8 = new MusicBand("Bon Jovi", 2015);
        MusicBand group9 = new MusicBand("Scorpions", 1985);
        MusicBand group10 = new MusicBand("Rolling Stones", 1970);

        groups.add(group1);
        groups.add(group2);
        groups.add(group3);
        groups.add(group4);
        groups.add(group5);
        groups.add(group6);
        groups.add(group7);
        groups.add(group8);
        groups.add(group9);
        groups.add(group10);

        Collections.shuffle(groups);

       for(MusicBand group : groups){
           System.out.println(group.toString());
       }
        System.out.println("-----------------------------------------------------");
        for(MusicBand group2000 : groupsAfter2000(groups)){
            System.out.println(group2000.toString());
        }
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> band = new ArrayList<>();
        for (MusicBand band2000 : bands){
            if (band2000.getYear()>=2000){
                band.add(band2000);
            }
        }
        return band;
    }
}
