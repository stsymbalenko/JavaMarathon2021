package day11.task2;

public abstract class Hero {
    public final int HEALTH_MIN = 0;
    public final int HEALTH_MAX = 100;

    private int health; //(здоровье)
    private int physDef; //(процент поглощения физического урона)
    private int magicDef; //(процент поглощения магического урона)
    private  int physAtt; //(величина физической атаки), по необходимости
    private  int magicAtt; //(величина магической атаки), по необходимости

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


}
