package day11.task2;

public abstract class Hero {
    public final int HEALTH_MIN = 0;
    public final int HEALTH_MAX = 100;

    int health; //(здоровье)
    int physDef; //(процент поглощения физического урона)
    int magicDef; //(процент поглощения магического урона)
    int physAtt; //(величина физической атаки), по необходимости

    public Hero() {
        this.health = 100;
    }


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
}
