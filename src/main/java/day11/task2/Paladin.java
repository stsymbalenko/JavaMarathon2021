package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack, MagicAttack{
    private int health; //(здоровье)
    private int physDef; //(процент поглощения физического урона)
    private int magicDef; //(процент поглощения магического урона)
    private int physAtt; //(величина физической атаки), по необходимости
    private int magicAtt; //(величина магической атаки), по необходимости

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPhysDef() {
        return physDef;
    }

    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }



    public Paladin() {
        this.health = 100;
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
    public void physicalAttack(Hero hero) {
        double a = hero.getPhysDef();
        int i = (int) (physAtt - physAtt*(a/100));
        int zh = hero.getHealth() - i;
        if(zh >= 0){
            hero.setHealth(zh);
        }else{
            hero.setHealth(HEALTH_MIN);
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
