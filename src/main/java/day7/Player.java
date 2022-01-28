package day7;

public class Player {
    public final static int MAX_STAMINA = 100;

    public final static int MIN_STAMINA = 0;
    public int stamina;
    public static  int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6){
            countPlayers++;
        }


    }

    public int getStamina() {
        return stamina;    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run(){
        if(stamina > MIN_STAMINA){
            stamina--;
            if(stamina==0){
                countPlayers--;


            }
        }
    }
    public static void info(){
        if(0< countPlayers && countPlayers < 6){
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        }else{
            System.out.println("На поле нет свободных мест");
        }
    }


}
