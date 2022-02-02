package day12.task5;
import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> artistBand1 = new ArrayList<>();
        List<MusicArtist> artistBand2 = new ArrayList<>();

        MusicArtist artist1 = new MusicArtist("Alex Ivavob", 60);
        MusicArtist artist2 = new MusicArtist("Oleg Nike", 65);
        MusicArtist artist3 = new MusicArtist("Sergey Noro", 55);
        MusicArtist artist4 = new MusicArtist("Devid Brom", 58);
        MusicArtist artist5 = new MusicArtist("Mike Terin", 50);
        MusicArtist artist6 = new MusicArtist("Vesa Ginet", 60);
        MusicArtist artist7 = new MusicArtist("Kevin Sobor", 63);

        artistBand1.add(artist1);
        artistBand1.add(artist2);
        artistBand1.add(artist3);
        artistBand2.add(artist4);
        artistBand2.add(artist5);
        artistBand2.add(artist6);
        artistBand2.add(artist7);

        MusicBand group1 = new MusicBand("The Beatles", 1990, artistBand1);
        MusicBand group2 = new MusicBand("Nirvana", 2001, artistBand2);

        System.out.println(group1.getMembers());
        System.out.println(group2.getMembers());

        MusicBand.transferMembers(group1, group2);

        System.out.println(group1.getMembers());
        System.out.println(group2.getMembers());
    }
}
