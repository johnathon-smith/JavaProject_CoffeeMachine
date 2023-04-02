import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create scanner
        Scanner scanner = new Scanner(System.in);

        //Create coffee machine
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        //create variable to store the user action choice
        String userAction;

        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            userAction = scanner.nextLine();

            if ("buy".equals(userAction)) {
                coffeeMachine.buyCoffee(scanner);
            } else if ("fill".equals(userAction)) {
                coffeeMachine.fillSupplies(scanner);
            } else if ("take".equals(userAction)){
                coffeeMachine.giveMoney();
            } else if ("remaining".equals(userAction)){
                coffeeMachine.printInfo();
            }
        } while(!"exit".equals(userAction));

    }
}