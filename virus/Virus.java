package virus;

import java.util.Scanner;

public class Virus {
    public static void main(String[] args) {
        int[][] map = getMap();
        printMap(map);
        int turn = 1;
        int countPlayer1Score = 0;
        int countPlayer2Score = 0;

        Scanner sc = new Scanner(System.in);
        while (true) {
            showScores(map, countPlayer1Score, countPlayer2Score);
            System.out.println("Player " + playerTurn(turn) + " Turn");

            // Get source coordinates of the cell I want to move.
            System.out.print("Choose X on the map: ");
            int inputX = sc.nextInt();
            System.out.print("Choose Y on the  map: ");
            int inputY = sc.nextInt();

            // Determine player's turn.
            if (map[inputY][inputX] != playerTurn(turn)) {
                System.out.println("It's not your turn");
                continue;
            }

            // Cell must be owned by either player1 or player2.
            if (map[inputY][inputX] != 1 && map[inputY][inputX] != 2) {
                System.out.println("Pick a valid cell!");
                continue;
            }

            //Show where can move.
            int countMove = countAndMove(inputX, inputY, map);

            //If rock that you choose can't be moved, go back.
            if (countMove == 0) {
                System.out.println("You can't move this rock! Choose the other rock");
                continue;
            }
            printMap(map);

            // Erase 5
            resetMap(inputX, inputY, map);
            while(true) {
                // Get destination coordinates of the cell I want to move to.
                System.out.print("input X which you want to move: ");
                int outputX = sc.nextInt();
                System.out.print("input Y which you want to move: ");
                int outputY = sc.nextInt();

                if(map[outputY][outputX] == playerTurn(turn)) {
                    inputX = outputX;
                    inputY = outputY;
                    countAndMove(inputX, inputY, map);
                    printMap(map);
                    resetMap(inputX, inputY, map);
                    continue;
                }

                // Cannot move to a cell that is occupied.
                if (playerTurn(turn) == 1 && map[outputY][outputX] == 2) {
                    System.out.println("Invalid location!");
                    continue;
                } else if(playerTurn(turn) == 2 && map[outputY][outputX] == 1) {
                    System.out.println("Invalid location!");
                    continue;
                }

                // Get the distance a cell is moving.
                int diff = getCellDiff(inputX, inputY, outputX, outputY);
                if (diff == 1) {
                    map[outputY][outputX] = map[inputY][inputX];
                } else if (diff == 2) {
                    map[outputY][outputX] = map[inputY][inputX];
                    map[inputY][inputX] = 0;
                } else {
                    System.out.println("You tried to move too much!");
                    continue;
                }

                // Infect surrounding cells after moving to the destination coordinates.
                infect(outputX, outputY, map);

                turn++;
                printMap(map);

                //Find the way the player can go.
                int countOfZero = findGameover(turn, map);

                //Game over: If player can't go anywhere, game over.
                if(countOfZero == 0) {
                    String play = "PLAY";
                    showScores(map, countPlayer1Score, countPlayer2Score);
                    winner(countPlayer1Score, countPlayer2Score);
                    endingMessage();
                    String restart = sc.next();
                    if(restart.equalsIgnoreCase(play)) {
                        map = new int[][]{
                                {1, 0, 0, 0, 0, 0, 0, 2},
                                {0, 0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 0},
                                {0, 0, 0, 0, 0, 0, 0, 0},
                                {2, 0, 0, 0, 0, 0, 0, 1}};
                        turn = 1;
                        printMap(map);
                    } else {
                        break;
                    }
                }
            }

        }
    }

    public static void printMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] getMap() {
        int[][] map = {
                {1, 0, 0, 0, 0, 0, 0, 2},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {2, 0, 0, 0, 0, 0, 0, 1}
        };
        return map;
    }

    public static int getCellDiff(int inputX, int inputY, int outputX, int outputY) {
        int diff1;
        int diff2;
        if(outputX - inputX >= 0) {
            diff1 = outputX - inputX;
        } else {
            diff1 = -1 * (outputX - inputX);
        }
        if(outputY - inputY >= 0) {
            diff2 = outputY - inputY;
        } else {
            diff2 = -1 * (outputY - inputY);
        }
        if(diff1 > diff2) {
            return diff1;
        } else {
            return diff2;
        }
    }

    public static int playerTurn(int turn) {
        if(turn % 2 == 1) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void showScores(int[][]map, int countPlayer1Score, int countPlayer2Score) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                if(map[j][i] == 1) {
                    countPlayer1Score++;
                } else if (map[j][i] == 2) {
                    countPlayer2Score++;
                }
            }
        }
        System.out.println("Score " + countPlayer1Score + " vs " + countPlayer2Score);
    }
    public static void winner(int countPlayer1Score, int countPlayer2Score) {
        if(countPlayer1Score > countPlayer2Score) {
            System.out.println("Player1 win");
        } else {
            System.out.println("player2 win");
        }
    }
    public static int countAndMove(int inputX, int inputY, int[][] map) {
        int countMove = 0;
        for (int i = inputX - 2; i <= inputX + 2; i++) {
            for (int j = inputY - 2; j <= inputY + 2; j++) {
                if (i >= 0 && j >= 0 && i < map.length && j < map.length && map[j][i] == 0) {
                    map[j][i] = 5;
                    countMove++;
                }
            }
        }
        return countMove;
    }
    public static int[][] resetMap(int inputX, int inputY, int[][] map) {
        for (int i = inputX - 2; i <= inputX + 2; i++) {
            for (int j = inputY - 2; j <= inputY + 2; j++) {
                if (i >= 0 && j >= 0 && i < map.length && j < map.length && map[j][i] == 5) {
                    map[j][i] = 0;
                }
            }
        }
        return map;
    }
    public static int[][] infect(int outputX, int outputY, int[][] map) {
        for (int i = outputX - 1; i <= outputX + 1; i++) {
            for (int j = outputY - 1; j <= outputY + 1; j++) {
                if (i >= 0 && j >= 0 && i < map.length && j < map.length && map[j][i] != 0) {
                    map[j][i] = map[outputY][outputX];
                }
            }
        }
        return map;
    }
    public static int findGameover(int turn, int[][] map) {
        int countOfZero = 0;
        //Find the way the player can go.
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                if(map[j][i] == playerTurn(turn)) {
                    for (int k = i - 2; k <= i + 2; k++) {
                        for (int l = j - 2; l <= j + 2; l++) {
                            if (k >= 0 && l >= 0 && k < map.length && l < map.length) {
                                if(map[l][k] == 0) {
                                    countOfZero++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return countOfZero;
    }
    public static void endingMessage() {
        System.out.println("Game over \n \"If you want to start again, type (PLAY) or If you want to end, type anything: \"");
    }
}
