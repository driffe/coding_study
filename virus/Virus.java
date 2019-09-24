package virus;

import java.util.Scanner;

public class Virus {
    public static void main(String[] args) {
        int[][] map =
                {{1, 0, 0, 0, 0, 0, 0, 2},
                {0, 0, 2, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {2, 0, 0, 0, 0, 0, 0, 1},};

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        while (true) {
            int countOfZero = 0;

            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[0].length; j++) {
                    if (map[i][j] == 0) {
                        countOfZero++;
                    }
                }
            }
            if (countOfZero == 0) {
                break;
            } else {
                Scanner sc = new Scanner(System.in);
                System.out.println("Choose 1 or 2 to move");
                System.out.print("Enter the X coordinate of what you want to move: ");
                int moveX = sc.nextInt();
                System.out.print("Enter the Y coordinate of what you want to move: ");
                int moveY = sc.nextInt();

                int getType;

                if (map[moveY][moveX] == 0) {
                    System.out.println("Error!");
                } else {
                    System.out.print("Enter X: ");
                    int inputX = sc.nextInt();
                    System.out.print("Enter Y: ");
                    int inputY = sc.nextInt();

                    getType = map[moveY][moveX];
                    if (map[inputY][inputX] == 1 || map[inputY][inputX] == 2) {
                        System.out.println("Error");
                    } else {
                        map[inputY][inputX] = getType;
                        if(inputX == 0 || inputY == 0) {
                            if (map[inputY + 1][inputX + 1] != getType && map[inputY + 1][inputX + 1] != 0) {
                                map[inputY + 1][inputX + 1] = getType;
                            }
                            if (map[inputY + 1][inputX] != getType && map[inputY + 1][inputX] != 0) {
                                map[inputY + 1][inputX] = getType;
                            }
                            if (map[inputY][inputX + 1] != getType && map[inputY][inputX + 1] != 0) {
                                map[inputY][inputX + 1] = getType;
                            }
                            if ((inputX - moveX == 1 || inputX - moveX == -1) || (inputY - moveY == 1 || inputY - moveY == -1)) {
                                map[moveY][moveX] = getType;
                            } else {
                                map[moveY][moveY] = 0;
                            }
                            for (int i = 0; i < map.length; i++) {
                                for (int j = 0; j < map[0].length; j++) {
                                    System.out.print(map[i][j]);
                                }
                                System.out.println();
                            }
                        } else {
                            if (map[inputY + 1][inputX + 1] != getType && map[inputY + 1][inputX + 1] != 0) {
                                map[inputY + 1][inputX + 1] = getType;
                            }
                            if (map[inputY + 1][inputX] != getType && map[inputY + 1][inputX] != 0) {
                                map[inputY + 1][inputX] = getType;
                            }
                            if (map[inputY][inputX + 1] != getType && map[inputY][inputX + 1] != 0) {
                                map[inputY][inputX + 1] = getType;
                            }
                            if (map[inputY + -1][inputX + -1] != getType && map[inputY + -1][inputX + -1] != 0) {
                                map[inputY + -1][inputX + -1] = getType;
                            }
                            if (map[inputY][inputX + -1] != getType && map[inputY][inputX + -1] != 0) {
                                map[inputY][inputX + -1] = getType;
                            }
                            if (map[inputY + -1][inputX] != getType && map[inputY + -1][inputX] != 0) {
                                map[inputY + -1][inputX] = getType;
                            }
                            if (map[inputY + -1][inputX + 1] != getType && map[inputY + -1][inputX + 1] != 0) {
                                map[inputY + -1][inputX + 1] = getType;
                            }
                            if (map[inputY + 1][inputX + -1] != getType && map[inputY + 1][inputX + -1] != 0) {
                                map[inputY + 1][inputX + -1] = getType;
                            }
                            if ((inputX - moveX == 1 || inputX - moveX == -1) || (inputY - moveY == 1 || inputY - moveY == -1)) {
                                map[moveY][moveX] = getType;
                            } else {
                                map[moveY][moveY] = 0;
                            }
                            for (int i = 0; i < map.length; i++) {
                                for (int j = 0; j < map[0].length; j++) {
                                    System.out.print(map[i][j]);
                                }
                                System.out.println();
                            }
                        }
                    }

                }
            }
        }
    }
}
