public class Main {
    public static void main(String[] args) {
        int fix = 100;
        System.out.println("На вашем счете 100 рублей");
        int increase= 1100;
        System.out.println("Вы пополнили счет на " + increase);
              if (increase >= 1000) {
                  int bonus = increase/100;
                  int ent = fix + bonus +increase;
                  System.out.println("Баланс Вашего счета с учетом бонуса равен " + ent);
              }
                  else{
                      int ent = fix + increase;
                      System.out.println("Ваш Баланс " + ent);
                  }
              }

    }

