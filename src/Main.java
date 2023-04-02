import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create scanner
        Scanner scanner = new Scanner(System.in);

        //Create coffee machine
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        //print info
        coffeeMachine.printInfo();

        System.out.println("Write action (buy, fill, take):");
        String userAction = scanner.nextLine();

        if ("buy".equals(userAction)) {
            coffeeMachine.buyCoffee(scanner);
        } else if ("fill".equals(userAction)) {
            coffeeMachine.fillSupplies(scanner);
        } else {
            coffeeMachine.giveMoney();
        }

    }
}