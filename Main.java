import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Buy coffee");
            System.out.println("2. Fill ingredients");
            System.out.println("3. Take money");
            System.out.println("4. Show ingredients");
            System.out.println("5. Analytics");
            System.out.println("6. Exit");
            int choice = scn.nextInt();

            CoffeeMachine coffeeMachine = new CoffeeMachine();

            switch (choice){
                case 1 :
                    coffeeMachine.buyCoffee();
                    break;
                case 2 :
                    coffeeMachine.fillIngredients();
                    break;
                case 3 :
                    coffeeMachine.takeMoney();
                    break;
                case 4 :
                    coffeeMachine.showIngredients();
                    break;
                case 5:
                    coffeeMachine.showAnalytics();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Oops! That action doesn't seem to be valid. Give it another shot!");

            }
        }
    }
}