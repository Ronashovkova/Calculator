import java.util.Scanner;

public class ReadEntered {

    public int readNextInt() {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        if (scan.hasNextInt()) {
            i = scan.nextInt();
        } else {
            System.out.println("Лише ціле число, будь ласка :) ");
        }
        return i;
    }
}

