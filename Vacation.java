package WhileLoopExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int spendDays = 0;
        boolean isFailed = false;

        while (money < excursionPrice){
            spendDays++;
            days++;
            String command = scanner.nextLine();
            double currentMoney = Double.parseDouble(scanner.nextLine());
            switch (command){
                case "spend":
                    money = money - currentMoney;
                    if (money <= 0){
                        money = 0;
                    }
                    break;
                case "save":
                    spendDays = 0;
                    money = money + currentMoney;
                    break;
            }

            if (spendDays == 5){
                isFailed = true;
                break;
            }
        }

        if (isFailed){
            System.out.printf("You can't save the money.%n%d", days);
        }
        else{
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}