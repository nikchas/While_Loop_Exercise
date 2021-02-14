package WhileLoopExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int totalPieces = length * width;

        String input = scanner.nextLine();

        while (!input.equals("STOP")){
            int cakePieces = Integer.parseInt(scanner.nextLine());
            totalPieces = totalPieces - cakePieces;

            if (totalPieces <= 0){
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("STOP")){
            System.out.printf("%d pieces are left,", totalPieces);
        }
        else{
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
        }
    }
}