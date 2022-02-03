package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack{
    private int magicAtt; //(величина магической атаки), по необходимости

    public Shaman() {
        this.physDef = 20;
        this.magicDef = 20;
        this.physAtt = 10;
        this.magicAtt = 15;
    }
    public int getMagicAtt() {
        return magicAtt;
    }

    @Override
    public void healHimself() {
        if(health<=50){
            health = health + 50;
        }else{
            health = HEALTH_MAX;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if(health<=70){
            hero.setHealth(getHealth() + 30);
        }else{
            hero.setHealth(HEALTH_MAX);
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double a = hero.getMagicDef();
        int i = (int) (magicAtt - magicAtt*(a/100));
        int zh = hero.getHealth() - i;
        if(zh >= 0){
            hero.setHealth(zh);
        }else{
            hero.setHealth(HEALTH_MIN);
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
