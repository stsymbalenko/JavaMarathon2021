package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> artists = new ArrayList<>();

    public MusicBand(String name, int year, List<MusicArtist> artists) {
        this.name = name;
        this.year = year;
        this.artists = artists;
    }

    public List<MusicArtist> getMembers() {
        return artists;
    }

    public void setMembers(List<MusicArtist> artists) {
        this.artists = artists;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", artists=" + artists +
                '}';
    }

    public static void transferMembers(MusicBand group1, MusicBand group2){
        for(MusicArtist artist: group1.artists){
            group2.artists.add(artist);
        }
        group1.artists.clear();
    }

    public void printMembers(){
            System.out.println(artists.toString());
    }

}
