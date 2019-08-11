package june1;

public class mutiTable {
    public static void main(String[] args) {

        for(int i = 2; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                int resultOfTable = i *j;
                System.out.println(i + " x " + j + " = " + resultOfTable);
            }
            System.out.println();
        }
        System.out.println("DONE!");
    }
}