import java.util.Scanner;

    public class vending
    {
        public static void main(String[]args)
        {
            int amount, quarters, dimes, nickles, pennies;

            System.out.println("enter a whole number 1 to 99");
            System.out.println("An I will find your answer in coins");

            Scanner keyboard = new Scanner(System.in);
            amount = keyboard.nextInt();

            quarters = 100/25;
            quarters = 100 % 25;
            dimes = 100/10;
            dimes = 100 % 10;
            nickles = 100/5;
            nickles = 100 % 5;
            pennies = 100 % 5;

            System.out.print("The amount of quartes" + quarters);
            System.out.print("The amount of dimes" + dimes);
            System.out.println("Total amount nickles" + nickles);
            System.out.println("Total amount of pennies" + pennies);

        }

    }



