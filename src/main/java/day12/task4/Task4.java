package day12.task4;
import java.util.ArrayList;
import java.util.List;

import static day12.task4.MusicBand.transferMembers;

public class Task4 {
    public static void main(String[] args) {
        List<String> member1 = new ArrayList<>();
        member1.add("Alex Ivanov");
        member1.add("Serg Hals");
        member1.add("Halk Hunter");
        member1.add("Endryu Overmars");
        MusicBand group1 = new MusicBand("The Beatles", 1990, member1);

        System.out.println(group1.getMembers());
        group1.printMembers();

        List<String> member2 = new ArrayList<>();
        member2.add("Dmitry Petrov");
        member2.add("Mike Horn");
        member2.add("Gorn Nike");
        member2.add("Dryu Kurt");

        MusicBand group2 = new MusicBand("Nirvana", 2001, member2);

        group2.printMembers();

        transferMembers(group1, group2);
        System.out.println("----------------------------");
        group1.printMembers();
        group2.printMembers();

    }
}
