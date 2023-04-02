import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* NOTES
        One cup of coffee contains:
            - 200mL of water
            - 50mL of milk
            - 15g of coffee beans
        */

        final int waterPerCup = 200;
        final int milkPerCup = 50;
        final int coffeePerCup = 15;

        //Create scanner
        Scanner scanner = new Scanner(System.in);

        //Determine available resources
        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print("> ");
        int availableWater = scanner.nextInt();

        System.out.println("\nWrite how many ml of milk the coffee machine has:");
        System.out.println("> ");
        int availableMilk = scanner.nextInt();

        System.out.println("\nWrite how many grams of coffee beans the coffee machine has:");
        System.out.print("> ");
        int availableCoffee = scanner.nextInt();

        //How many cups need to be made?
        System.out.println("Write how many cups of coffee you will need:");
        System.out.print("> ");
        int numCoffees = scanner.nextInt();

        //How many cups can the coffee machine make?
        int maxCups = 0;
        int maxCupsByWater = availableWater / waterPerCup;
        int maxCupsByMilk = availableMilk / milkPerCup;
        int maxCupsByCoffee = availableCoffee / coffeePerCup;
        maxCups = Math.min(Math.min(maxCupsByWater, maxCupsByMilk), maxCupsByCoffee);

        //Can the coffee machine make the desired amount of coffee?
        if (maxCups > numCoffees) {
            System.out.printf("\nYes, I can make that amount of coffee (and even %d more than that)\n", maxCups - numCoffees);
        } else if (maxCups < numCoffees) {
            System.out.printf("\nNo, I can only make %d cup(s) of coffee\n", maxCups);
        } else {
            System.out.println("\nYes, I can make that amount of coffee\n");
        }

        /*
        System.out.printf("\nFor %d cups of coffee you will need:\n", numCoffees);
        System.out.printf("%d ml of water\n", numCoffees * waterPerCup);
        System.out.printf("%d ml of milk\n", numCoffees * milkPerCup);
        System.out.printf("%d g of coffee beans\n", numCoffees * coffeePerCup);
        */





        /*
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        */
    }
}