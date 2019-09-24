//package virus;
//
//import java.util.Scanner;
// if ((inputX - moveX == 1 || inputX - moveX == -1) || (inputY - moveY == 1 || inputY - moveY == -1)) {
//         map[moveY][moveX] = getType;
//         } else {
//         map[moveY][moveY] = 0;
//         }
//public class newVirus {
//    public static void main(String[] args) {
//        int[][] map =
//                {{1, 0, 0, 0, 0, 0, 0, 2},
//                {0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0},
//                {2, 0, 0, 0, 0, 0, 0, 1},};
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Choose 1 or 2 to move");
//        System.out.print("Enter the X coordinate of what you want to move: ");
//        int moveX = sc.nextInt();
//        System.out.print("Enter the Y coordinate of what you want to move: ");
//        int moveY = sc.nextInt();
//
//        int getType;
//
//        System.out.print("Enter X: ");
//        int inputX = sc.nextInt();
//        System.out.print("Enter Y: ");
//        int inputY = sc.nextInt();
//
//        getType = map[moveY][moveX];
//    }
//}
//if(inputX == 0 && inputY == 0) {
//        if (map[inputY + 1][inputX + 1] != getType && map[inputY + 1][inputX + 1] != 0) {
//        map[inputY + 1][inputX + 1] = getType;
//        }
//        if (map[inputY + 1][inputX] != getType && map[inputY + 1][inputX] != 0) {
//        map[inputY + 1][inputX] = getType;
//        }
//        if (map[inputY][inputX + 1] != getType && map[inputY][inputX + 1] != 0) {
//        map[inputY][inputX + 1] = getType;
//        }
//        if ((inputX - moveX == 1 || inputX - moveX == -1) || (inputY - moveY == 1 || inputY - moveY == -1)) {
//        map[moveY][moveX] = getType;
//        } else {
//        map[moveY][moveY] = 0;
//        }
//        for (int i = 0; i < map.length; i++) {
//        for (int j = 0; j < map[0].length; j++) {
//        System.out.print(map[i][j]);
//        }
//        System.out.println();
//        }
//        } else if (inputX == 0){
//        if (map[inputY + 1][inputX + 1] != getType && map[inputY + 1][inputX + 1] != 0) {
//        map[inputY + 1][inputX + 1] = getType;
//        }
//        if (map[inputY + 1][inputX] != getType && map[inputY + 1][inputX] != 0) {
//        map[inputY + 1][inputX] = getType;
//        }
//        if (map[inputY][inputX + 1] != getType && map[inputY][inputX + 1] != 0) {
//        map[inputY][inputX + 1] = getType;
//        }
//        if (map[inputY + -1][inputX] != getType && map[inputY + -1][inputX] != 0) {
//        map[inputY + -1][inputX] = getType;
//        }
//        if (map[inputY + -1][inputX + 1] != getType && map[inputY + -1][inputX + 1] != 0) {
//        map[inputY + -1][inputX + 1] = getType;
//        }
//        if (!(inputX - moveX == 1 || inputX - moveX == -1)) {
//        map[moveY][moveX] = 0;
//        }
//        if (!(inputY - moveY == 1 || inputY - moveY == -1)) {
//        map[moveY][moveX] = 0;
//        }
//        for (int i = 0; i < map.length; i++) {
//        for (int j = 0; j < map[0].length; j++) {
//        System.out.print(map[i][j]);
//        }
//        System.out.println();
//        }
//        } else if (inputY == 0){
//        if (map[inputY + 1][inputX + 1] != getType && map[inputY + 1][inputX + 1] != 0) {
//        map[inputY + 1][inputX + 1] = getType;
//        }
//        if (map[inputY + 1][inputX] != getType && map[inputY + 1][inputX] != 0) {
//        map[inputY + 1][inputX] = getType;
//        }
//        if (map[inputY][inputX + 1] != getType && map[inputY][inputX + 1] != 0) {
//        map[inputY][inputX + 1] = getType;
//        }
//        if (map[inputY][inputX + -1] != getType && map[inputY][inputX + -1] != 0) {
//        map[inputY][inputX + -1] = getType;
//        }
//        if (map[inputY + 1][inputX + -1] != getType && map[inputY + 1][inputX + -1] != 0) {
//        map[inputY + 1][inputX + -1] = getType;
//        }
//        if (!(inputX - moveX == 1 || inputX - moveX == -1)) {
//        map[moveY][moveX] = 0;
//        }
//        if (!(inputY - moveY == 1 || inputY - moveY == -1)) {
//        map[moveY][moveX] = 0;
//        }
//        for (int i = 0; i < map.length; i++) {
//        for (int j = 0; j < map[0].length; j++) {
//        System.out.print(map[i][j]);
//        }
//        System.out.println();
//        }
//        }else {
//        if (map[inputY + 1][inputX + 1] != getType && map[inputY + 1][inputX + 1] != 0) {
//        map[inputY + 1][inputX + 1] = getType;
//        }
//        if (map[inputY + 1][inputX] != getType && map[inputY + 1][inputX] != 0) {
//        map[inputY + 1][inputX] = getType;
//        }
//        if (map[inputY][inputX + 1] != getType && map[inputY][inputX + 1] != 0) {
//        map[inputY][inputX + 1] = getType;
//        }
//        if (map[inputY + -1][inputX + -1] != getType && map[inputY + -1][inputX + -1] != 0) {
//        map[inputY + -1][inputX + -1] = getType;
//        }
//        if (map[inputY][inputX + -1] != getType && map[inputY][inputX + -1] != 0) {
//        map[inputY][inputX + -1] = getType;
//        }
//        if (map[inputY + -1][inputX] != getType && map[inputY + -1][inputX] != 0) {
//        map[inputY + -1][inputX] = getType;
//        }
//        if (map[inputY + -1][inputX + 1] != getType && map[inputY + -1][inputX + 1] != 0) {
//        map[inputY + -1][inputX + 1] = getType;
//        }
//        if (map[inputY + 1][inputX + -1] != getType && map[inputY + 1][inputX + -1] != 0) {
//        map[inputY + 1][inputX + -1] = getType;
//        }
//        if (!(inputX - moveX == 1 || inputX - moveX == -1)) {
//        map[moveY][moveX] = 0;
//        }
//        if (!(inputY - moveY == 1 || inputY - moveY == -1)) {
//        map[moveY][moveX] = 0;
//        }
//        for (int i = 0; i < map.length; i++) {
//        for (int j = 0; j < map[0].length; j++) {
//        System.out.print(map[i][j]);
//        }
//        System.out.println();
//        }
//        }
//        }