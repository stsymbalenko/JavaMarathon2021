package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    private int magicAtt; //(величина магической атаки), по необходимости

    public Magician() {
        this.physDef = 0;
        this.magicDef = 80;
        this.physAtt = 5;
        this.magicAtt = 20;
    }

    public int getMagicAtt() {
        return magicAtt;
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
        return "Magician{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
