import java.util.Scanner;

public class Gameloop {
    char[][] ls = {
        { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' },
        { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' },
        { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' },
        { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' },
        { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' },
        { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' },
        { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' },
        { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' },
        { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board obj1 = new Board();
        Gameloop obj2=new Gameloop();
        obj1.display(obj2.ls);
        sc.close();
    }
}

class Board{
    public void display(char[][] ls) {
        for (int i = 0; i < 3; i++) {
            System.out.println("\n\n----------------------------------------------------------\n");
            for (int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.print("|  ");
                System.out.print("-------------   ");
                System.out.print("|  ");
            }
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.print("|  ");
                System.out.print("| a | b | c |   ");
                System.out.print("|  ");
            }
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.print("|  ");
                System.out.print("|---|---|---|   ");
                System.out.print("|  ");
            }
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.print("|  ");
                System.out.print("| d | e | f |   ");
                System.out.print("|  ");
            }
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.print("|  ");
                System.out.print("|---|---|---|   ");
                System.out.print("|  ");
            }
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.print("|  ");
                System.out.print("| g | h | i |   ");
                System.out.print("|  ");
            }
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.print("|  ");
                System.out.print("-------------   ");
                System.out.print("|  ");
            }
            if (i == 3)
                System.out.println("\n\n----------------------------------------------------------");
        }
    }
}