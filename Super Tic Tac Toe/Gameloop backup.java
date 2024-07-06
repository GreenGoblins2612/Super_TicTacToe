import java.util.Scanner;

public class Gameloop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gameloop obj2 = new Gameloop();
        Board obj1 = new Board();
        obj1.display();
        sc.close();
    }
}

class Board {
    public void display() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n\n----------------------------------------------------------\n");
            for (int j = 1; j <= 3; j++) {
                if (j == 1)
                    System.out.print("|  ");
                System.out.print("-------------   ");
                System.out.print("|  ");
            }
            System.out.println();
            for (int j = 1; j <= 3; j++) {
                if (j == 1)
                    System.out.print("|  ");
                System.out.print("| a | b | c |   ");
                System.out.print("|  ");
            }
            System.out.println();
            for (int j = 1; j <= 3; j++) {
                if (j == 1)
                    System.out.print("|  ");
                System.out.print("|---|---|---|   ");
                System.out.print("|  ");
            }
            System.out.println();
            for (int j = 1; j <= 3; j++) {
                if (j == 1)
                    System.out.print("|  ");
                System.out.print("| d | e | f |   ");
                System.out.print("|  ");
            }
            System.out.println();
            for (int j = 1; j <= 3; j++) {
                if (j == 1)
                    System.out.print("|  ");
                System.out.print("|---|---|---|   ");
                System.out.print("|  ");
            }
            System.out.println();
            for (int j = 1; j <= 3; j++) {
                if (j == 1)
                    System.out.print("|  ");
                System.out.print("| g | h | i |   ");
                System.out.print("|  ");
            }
            System.out.println();
            for (int j = 1; j <= 3; j++) {
                if (j == 1)
                    System.out.print("|  ");
                System.out.print("-------------   ");
                System.out.print("|  ");
            }
            if (i == 3)
                System.out.println("\n\n----------------------------------------------------------");
        }
    }
}