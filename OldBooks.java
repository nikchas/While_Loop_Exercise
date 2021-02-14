package WhileLoopExercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        String currentBook = scanner.nextLine();
        int bookCount = 0;

        while (!currentBook.equals("No More Books")){

            if (searchedBook.equals(currentBook)){
                break;
            }
            bookCount++;
            currentBook = scanner.nextLine();
        }
        if (currentBook.equals("No More Books")){
            System.out.printf("The book you search is not here!%n"
                                + "You checked %d books.", bookCount);
        }
        else{
            System.out.printf("You checked %d books and found it.", bookCount);
        }
    }
}