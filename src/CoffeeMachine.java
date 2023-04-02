import java.util.Scanner;

public class CoffeeMachine {
    private int availableMoney = 550;
    private int availableWater = 400;
    private int availableMilk = 540;
    private int availableCoffee = 120;
    private int availableCups = 9;

    public int getAvailableMoney() {
        return this.availableMoney;
    }

    public int getAvailableWater() {
        return this.availableWater;
    }

    public int getAvailableMilk() {
        return this.availableMilk;
    }

    public int getAvailableCoffee() {
        return this.availableCoffee;
    }

    public int getAvailableCups() {
        return this.availableCups;
    }

    public void printInfo() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water\n", availableWater);
        System.out.printf("%d ml of milk\n", availableMilk);
        System.out.printf("%d g of coffee beans\n", availableCoffee);
        System.out.printf("%d disposable cups\n", availableCups);
        System.out.printf("$%d of money\n", availableMoney);
    }

    public void giveMoney() {
        System.out.printf("I gave you $%d\n\n", this.availableMoney);
        this.availableMoney = 0;
        printInfo();
    }

    public void fillSupplies(Scanner scanner) {
        System.out.println("Write how many ml of water you want to add:");
        int waterAdded = scanner.nextInt();
        this.availableWater = this.availableWater + waterAdded;

        System.out.println("\nWrite how many ml of milk you want to add:");
        int milkAdded = scanner.nextInt();
        this.availableMilk = this.availableMilk + milkAdded;

        System.out.println("\nWrite how many grams of coffee beans you want to add:");
        int coffeeAdded = scanner.nextInt();
        this.availableCoffee = this.availableCoffee + coffeeAdded;

        System.out.println("\nWrite how many disposable cups you want to add:");
        int cupsAdded = scanner.nextInt();
        this.availableCups = this.availableCups + cupsAdded;

        printInfo();
    }

    public void buyCoffee(Scanner scanner) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int userChoice = scanner.nextInt();

        Coffee userCoffee;

        if (userChoice == 1) {
            userCoffee = new Espresso();
        } else if (userChoice == 2) {
            userCoffee = new Latte();
        } else {
            userCoffee = new Cappuccino();
        }

        //Update coffee machine inventory
        this.availableMoney = this.availableMoney + userCoffee.getPrice();
        this.availableWater = this.availableWater - userCoffee.getRequiredWater();
        this.availableMilk = this.availableMilk - userCoffee.getRequiredMilk();
        this.availableCoffee = this.availableCoffee - userCoffee.getRequiredCoffee();
        this.availableCups = this.availableCups - 1;

        printInfo();
    }


}
