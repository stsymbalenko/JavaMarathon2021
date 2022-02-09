package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;

    private List<String> members = new ArrayList<>();

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
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
                ", members=" + members +
                '}';
    }

    public static void transferMembers(MusicBand group1, MusicBand group2){
        for(String member: group1.members){
            group2.members.add(member);
        }
        group1.members.clear();
    }
    public void printMembers(){
            System.out.println(members.toString());
    }

}
