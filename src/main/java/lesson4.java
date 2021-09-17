import java.util.Random;
import java.util.Scanner;

public class lesson4 {
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static char [][] map;
    public static final int SIZE = 3;

    public static void main(String[] args) {
        initMap();

        printMap();
        while (true){
            humanTurn();
            printMap();
            if (isWinner(DOT_X)){
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()){
                System.out.println(" Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (isWinner(DOT_O )){
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()){
                System.out.println(" Ничья");
                break;
            }
        }

    }

    public static void initMap() {
        map = new char [SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for( int j = 0; j < SIZE; j++) {
            map [i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x;
        int y;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите координаты в формате x и y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x;
        int y;

        Random random = new Random();

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println(" Компьютер сходил в " + (x+1) + " " + (y+1) );

        map[y][x] = DOT_O;
    }


    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE ) {
            return false;
        }
        if (map [y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static boolean isWinner(char symb) {
        boolean right = true;
        boolean left = true;
        for (int i = 0; i < SIZE; i++) {
            right = right && (map[i][i] == symb);
            left = left && (map[i][SIZE - i - 1] == symb);
        }

        if (right || left) {
            return true;
        }

        for (int i = 0; i < SIZE; i++) {
            boolean horizontal = true;
            boolean vertical = true;
            for (int j = 0; j < SIZE; j++) {
                horizontal = horizontal && (map[i][j] == symb);
                vertical = vertical && (map[j][i] == symb);
            }

            if (vertical || horizontal) {
                return true;
            }
        }

        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map [i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
