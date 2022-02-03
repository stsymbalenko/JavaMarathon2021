package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack{

    public Paladin() {
        this.physDef = 50;
        this.magicDef = 20;
        this.physAtt = 15;
    }

    @Override
    public void healHimself() {
        if(health<=75){
            health = health + 25;
        }else{
            health = HEALTH_MAX;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if(health<=90){
            hero.setHealth(getHealth() + 10);
        }else{
            hero.setHealth(HEALTH_MAX);
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                '}';
    }
}
