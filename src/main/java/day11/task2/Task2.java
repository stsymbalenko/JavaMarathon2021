package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();
        Paladin paladin = new Paladin();

        warrior.physicalAttack(paladin);
        System.out.println("Paladin = " + paladin.getHealth());

        paladin.physicalAttack(magician);
        System.out.println("Magician = " + magician.getHealth());

        shaman.healTeammate(magician);
        System.out.println("Magician = " + magician.getHealth());

        magician.magicalAttack(paladin);
        System.out.println("Paladin = " + paladin.getHealth());

        shaman.physicalAttack(warrior);
        System.out.println("Warrior = " + warrior.getHealth());

        paladin.healHimself();
        System.out.println("Paladin = " + paladin.getHealth());

        warrior.physicalAttack(magician);
        System.out.println("Magician = " + magician.getHealth());
        warrior.physicalAttack(magician);
        System.out.println("Magician = " + magician.getHealth());
        warrior.physicalAttack(magician);
        System.out.println("Magician = " + magician.getHealth());
        warrior.physicalAttack(magician);
        System.out.println("Magician = " + magician.getHealth());
        warrior.physicalAttack(magician);
        System.out.println("Magician = " + magician.getHealth());
    }
}
