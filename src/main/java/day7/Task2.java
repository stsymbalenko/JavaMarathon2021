package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int max = 100;
        int min = 90;
        int diff = max - min;
        Random random = new Random();
        int chislo = random.nextInt(diff + 1);
        chislo += min;
        System.out.println(chislo);

       Player player1 = new Player(chislo);
       Player player2 = new Player(chislo);
       Player player3 = new Player(chislo);
       Player player4 = new Player(chislo);
       Player player5 = new Player(chislo);
       Player player6 = new Player(chislo);

      for(int i = 0; i < Player.MAX_STAMINA; i++){
          player1.run();
      }
        player1.info();

        Player player7 = new Player(chislo);
        player7.info();

        Player player8 = new Player(chislo);
        player8.info();

    }
}
