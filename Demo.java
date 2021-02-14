package WhileLoopExercise;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();


        while(!name.equals("end")){
            int age = Integer.parseInt(scanner.nextLine());
            System.out.printf("This is %s %d years old.%n", name, age);

            name = scanner.nextLine();
        }

    }
}
