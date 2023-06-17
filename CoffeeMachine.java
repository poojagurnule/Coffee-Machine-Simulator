
import java.util.Scanner;

public class CoffeeMachine {
   Scanner scn = new Scanner(System.in);

   private  static  int water = 0;
   private  static  int milk = 0;
   private static  int beans =0;
   private  static  int  money = 0;
   private  static  int latteCount = 0;
   private  static  int espressoCount = 0 ;
   private  static  int cappuccinoCount = 0 ;
   private  int lattePrice = 7 ;
   private int espressoPrice = 4;
   private  int cappuccinoPrice = 6 ;

   public  void buyCoffee(){
       System.out.println("What kind of coffee would you like?: ");

       System.out.println("1:Latte ($" + lattePrice + ")");
       System.out.println("2:Espresso ($" + espressoPrice + ")");
       System.out.println("3:Cappuccino ($" + cappuccinoPrice + ")") ;

       int coffeeChoice = scn.nextInt();
       scn.nextLine();
       switch (coffeeChoice) {
           case 1:

           if (hasEnoughIngredients(Latte.getLatteWater(), Latte.getLatteMilk(), Latte.getLatteBeans())) {
               makeCoffee("Latte", lattePrice, Latte.getLatteWater(), Latte.getLatteMilk(), Latte.getLatteBeans());
               latteCount++;
           } else {
               System.out.println("\"We're sorry, we don't have enough ingredients to make a latte right now. Please fill up the water, milk, and beans before you try again.\"");
           }
           break;
           case 2:
               if (hasEnoughIngredients(Espresso.getEspressoWater(), Espresso.getEspressoMilk(), Espresso.getEspressoBeans())) {
                   makeCoffee("Espresso", espressoPrice, Espresso.getEspressoWater(), Espresso.getEspressoMilk(), Espresso.getEspressoBeans());
                   espressoCount++;
               } else {
                   System.out.println("\"We're sorry, we don't have enough ingredients to make a Espresso right now. Please fill up the water, milk, and beans before you try again.\"");
               }
               break;
           case 3:
               if (hasEnoughIngredients(Cappuccino.getCappuccinoWater(), Cappuccino.getCappuccinoMilk(), Cappuccino.getCappuccinoBeans())) {
                   makeCoffee("Cappuccino", cappuccinoPrice, Cappuccino.getCappuccinoWater(), Cappuccino.getCappuccinoMilk(), Cappuccino.getCappuccinoBeans());
                   cappuccinoCount++;
               } else {
                   System.out.println("\"We're sorry, we don't have enough ingredients to make a Cappuccino right now. Please fill up the water, milk, and beans before you try again.\"");
               }
               break;
           default:
               System.out.println("Invalid coffee choice.");
       }
   }
    private void makeCoffee(String coffeeType, int price, int waterUsed, int milkUsed, int coffeeBeansUsed) {
        System.out.println("Dispensing " + coffeeType + ". Enjoy your coffee!");
        money += price;
        water -= waterUsed;
        milk -= milkUsed;
        beans -= coffeeBeansUsed;
    }


    private boolean hasEnoughIngredients(int requiredWater, int requiredMilk, int requiredCoffeeBeans) {
        if ( water >= requiredWater && milk >= requiredMilk && beans >= requiredCoffeeBeans) {
            return true;
        }
        return false;
    }

    public void fillIngredients() {
        System.out.println("Enter the amount of water to add:");
        water += scn.nextInt();
        System.out.println("Enter the amount of milk to add:");
        milk += scn.nextInt();
        System.out.println("Enter the amount of coffee beans to add:");
        beans += scn.nextInt();
        scn.nextLine();
    }

    public void takeMoney() {
        System.out.println("Taking $" + money + " from the money box.");
        money = 0;
    }

    public void showIngredients() {
        System.out.println("Available ingredients:");
        System.out.println("Water: " + water + " ml");
        System.out.println("Milk: " + milk + " ml");
        System.out.println("Coffee beans: " + beans + " units");
        System.out.println("Money: $" + money);
    }

    public void showAnalytics() {
        System.out.println("Coffee machine analytics:");
        System.out.println("Espresso sold: " + espressoCount);
        System.out.println("Latte sold: " + latteCount);
        System.out.println("Cappuccino sold: " + cappuccinoCount);
        System.out.println("Total earnings: $" + espressoCount * espressoPrice + latteCount * lattePrice + cappuccinoCount * cappuccinoPrice);
        System.out.println("Total water used: " + (espressoCount * Espresso.getEspressoWater() + latteCount * Latte.getLatteWater() + cappuccinoCount * Cappuccino.getCappuccinoWater()) + " ml");
        System.out.println("Total milk used: " + (latteCount * Latte.getLatteMilk() + cappuccinoCount * Cappuccino.getCappuccinoMilk()) + " ml");
        System.out.println("Total coffee beans used: " + (espressoCount * Espresso.getEspressoBeans() + latteCount * Latte.getLatteBeans() + cappuccinoCount * Cappuccino.getCappuccinoBeans()) + " units");
    }

}