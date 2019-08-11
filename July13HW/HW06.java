package July13HW;

import java.util.Scanner;

public class HW06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Singular noun: ");
        String getStr = sc.nextLine();

        String condition1 = "o";
        String condition2 = "s";
        String condition3 = "x";
        String condition4 = "ch";
        String condition5 = "sh";
        String condition6 = "y";
        String condition7 = "f";
        String condition8 = "fe";

        String firstAdd = "s";
        String secondAdd = "es";
        String thirdAdd = "ies";
        String fourthAdd = "ves";

        //Find last one of str
        String findLast = Character.toString(getStr.charAt(getStr.length() - 1));
        ////FInd last two str
        String findTwoLast = getStr.substring(getStr.length() - 2);
        //According to last word or last two word, print firstAdd or secondAdd or thirdAdd or fourthAdd;
        if(findLast.equalsIgnoreCase(condition1)) {
            System.out.println("Plural noun: " + getStr.concat(secondAdd));
        } else if(findLast.equalsIgnoreCase(condition2)|| findLast.equalsIgnoreCase(condition3)|| findTwoLast.equalsIgnoreCase(condition4)
                ||findTwoLast.equalsIgnoreCase(condition5)) {
            System.out.println("Plural noun: " + getStr.concat(secondAdd));
        } else if(findLast.equalsIgnoreCase(condition6)) {
            System.out.println("Plural noun: " + getStr.substring(0, getStr.length() - 1).concat(thirdAdd));
        } else if(findLast.equalsIgnoreCase(condition7)) {
            System.out.println("Plural noun: " + getStr.substring(0, getStr.length() - 1).concat(fourthAdd));
        } else if(findTwoLast.equalsIgnoreCase(condition8)) {
            System.out.println("Plural noun: " + getStr.substring(0, getStr.length() - 2).concat(fourthAdd));
        } else {
            System.out.println("Plural noun" + getStr.concat(firstAdd));
        }
    }
}
