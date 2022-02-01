package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack{
    int health; //(здоровье)
    int physDef; //(процент поглощения физи ческого урона)
    int magicDef; //(процент поглощения магического урона)
    int physAtt; //(величина физической атаки), по необходимости
    int magicAtt; //(величина магической атаки), по необходимости

    public Shaman() {
        this.health = 100;
        this.physDef = 20;
        this.magicDef = 20;
        this.physAtt = 10;
        this.magicAtt = 15;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getPhysDef() {
        return physDef;
    }

    @Override
    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    @Override
    public int getMagicDef() {
        return magicDef;
    }

    @Override
    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }

    @Override
    public int getPhysAtt() {
        return physAtt;
    }

    @Override
    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    @Override
    public int getMagicAtt() {
        return magicAtt;
    }

    @Override
    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
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
        return "Shaman{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
