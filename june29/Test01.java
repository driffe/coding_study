package june29;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(startingIntro());
        System.out.println("Hi " + getName());
        System.out.println();
        show_Menu();
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print("Choose the number that you want to see: ");
            int num1 = sc.nextInt();
            if(num1 == 99) {
                System.out.println("Exit a program");
                break;
            } else {
                menu(num1);
            }
        }
    }
    public static String getName() {
        return "SYOH";
    }
    public static void show_Menu() {
        System.out.println(menuName00());
        System.out.println(menuName01());
        System.out.println(menuName02());
        System.out.println(menuName03());
        System.out.println(menuName04());
        System.out.println(menuName05());
        System.out.println(menuName06());
        System.out.println(menuName07());
        System.out.println(menuName08());
        System.out.println(menuName09());
        System.out.println(menuName10());
        System.out.println(menuName11());
        System.out.println(menuName12());
        System.out.println(menuName13());
        System.out.println(menuName14());
        System.out.println(menuName15());
        System.out.println(menuName16());
        System.out.println(menuName17());
        System.out.println(menuName18());
        System.out.println(menuName19());
        System.out.println(menuName20());
        System.out.println(menuName21());
        System.out.println(menuName22());
        System.out.println(menuName99());
    }
    public static String startingIntro() {
        return "Start the program!";
    }
    public static String menuName00() {
        return "0) Show the Menu.";
    }
    public static String menuName01() {
        return "1) Two triangle with number.";
    }
    public static String menuName02() {
        return "2) Two triangle with number in reverse order.";
    }
    public static String menuName03() {
        return "3) Pyramid with star.";
    }
    public static String menuName04() {
        return "4) Reverse and right side triangle with number.";
    }
    public static String menuName05() {
        return "5) Half windmill shape with star.";
    }
    public static String menuName06() {
        return "6) Diamond shape with star.";
    }
    public static String menuName07() {
        return "7) Find Max and Min.";
    }
    public static String menuName08() {
        return "8) Find the Max Value of sum in array.";
    }
    public static String menuName09() {
        return "9) Find that number exist in array.";
    }
    public static String menuName10() {
        return "10) Sum of numbers that you enter.";
    }
    public static String menuName11() {
        return "11) Reverse a given string.";
    }
    public static String menuName12() {
        return "12) Split the given string in half and return a string with the halves in reverse order.";
    }
    public static String menuName13() {
        return "13) Given a string, print all characters in odd index in order.";
    }
    public static String menuName14() {
        return "14) Given two strings, return true if two strings are equal. (ignore case)";
    }
    public static String menuName15() {
        return "15) Given a list of names, return the third name.";
    }
    public static String menuName16() {
        return "16) Given a string, return the string without the last character.";
    }
    public static String menuName17() {
        return "17) Given a noun, return the plural form of the noun. (by adding 's' or 'es')";
    }
    public static String menuName18() {
        return "18) Given a verb, return the past tense of the verb. (by adding 'ed')";
    }
    public static String menuName19() {
        return "19) Given a word, return the number of vowels";
    }
    public static String menuName20() {
        return "20) Given a word with even length, split the word in half and insert \" & \" in-between.";
    }
    public static String menuName21() {
        return "21) Given a sentence, return total number of words in the sentence.";
    }
    public static String menuName22() {
        return "22) Given a sentence, return a sentence with all the words in reverse order.";
    }
    public static String menuName99() {
        return "99) Exit a program.";
    }
    public static void menu(int num1) {
        if(num1 == 0) {
            System.out.println();
            show_Menu();
        } else if(num1 == 1) {
            System.out.println();
            System.out.println(menuName01());
            loop1();
        } else if(num1 == 2) {
            System.out.println();
            System.out.println(menuName02());
            loop2();
        } else if(num1 == 3) {
            System.out.println();
            System.out.println(menuName03());
            loop3();
        } else if(num1 == 4) {
            System.out.println();
            System.out.println(menuName04());
            loop4();
        } else if(num1 == 5) {
            System.out.println();
            System.out.println(menuName05());
            loop5();
        } else if(num1 == 6) {
            System.out.println();
            System.out.println(menuName06());
            loop6();
        }  else if(num1 == 7) {
            System.out.println();
            System.out.println(menuName07());
            loop7();
        } else if(num1 == 8) {
            System.out.println();
            System.out.println(menuName08());
            loop8();
        } else if(num1 == 9) {
            System.out.println();
            System.out.println(menuName09());
            loop9();
        } else if(num1 == 10) {
            System.out.println();
            System.out.println(menuName10());
            loop10();
        } else if(num1 == 11) {
            System.out.println();
            System.out.println(menuName11());
            string1();
        } else if(num1 == 12) {
            System.out.println();
            System.out.println(menuName12());
            string2();
        } else if(num1 == 13) {
            System.out.println();
            System.out.println(menuName13());
            string3();
        } else if(num1 == 14) {
            System.out.println();
            System.out.println(menuName14());
            string4();
        } else if(num1 == 15) {
            System.out.println();
            System.out.println(menuName15());
            string5();
        } else if(num1 == 16) {
            System.out.println();
            System.out.println(menuName16());
            string6();
        } else if(num1 == 17) {
            System.out.println();
            System.out.println(menuName17());
            string7();
        } else if(num1 == 18) {
            System.out.println();
            System.out.println(menuName18());
            string8();
        } else if(num1 == 19) {
            System.out.println();
            System.out.println(menuName19());
            string9();
        } else if(num1 == 20) {
            System.out.println();
            System.out.println(menuName20());
            string10();
        } else if(num1 == 21) {
            System.out.println();
            System.out.println(menuName21());
            string11();
        } else if(num1 == 22) {
            System.out.println();
            System.out.println(menuName22());
            string12();
        } else {
            System.out.println("Error! " + num1 + " is not between 0 and 10.");
        }
    }
    public static void loop1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();
        if(num < 0) {
            System.out.println("Error: This is not positive integer");
        } else {
            int i = 0;
            while(i < num) {
                int j = 0;
                while(j <= i) {
                    System.out.print(j + 1);
                    j++;
                }
                System.out.println();
                i++;
            }
            i = 0;
            while(i < num) {
                int j = 0;
                while(j < num - i - 1) {
                    System.out.print(j + 1);
                    j++;
                }
                System.out.println();
                i++;
            }
        }
    }
    public static void loop2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();
        if(num < 0) {
            System.out.println("Error: This is not positive integer");
        } else {
            int i = 0;
            while(i < num) {
                int j = 0;
                while(j < num - i - 1) {
                    System.out.print(" ");
                    j++;
                }
                int k = i + 1;
                while(k > 0) {
                    System.out.print(k);
                    k--;
                }
                System.out.println();
                i++;
            }
            i = 0;
            while(i < num) {
                int j = 0;
                while(j <= i) {
                    System.out.print(" ");
                    j++;
                }
                int k = num - i - 1;
                while(k > 0) {
                    System.out.print(k);
                    k--;
                }
                System.out.println();
                i++;
            }
        }
    }
    public static void loop3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();
        if(num < 0) {
            System.out.println("Error: This is not positive integer");
        } else {
            int i = 0;
            while(i < num) {
                int j = 0;
                while(j < num - i) {
                    System.out.print(" ");
                    j++;
                }
                int k = 0;
                while(k < i * 2 + 1) {
                    System.out.print("*");
                    k++;
                }
                System.out.println();
                i++;
            }
        }
    }
    public static void loop4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();
        if(num < 0) {
            System.out.println("Error: This is not positive integer");
        } else {
            int i = 0;
            while(i < num) {
                int j = num - i;
                while(j > 0) {
                    System.out.print(j);
                    j--;
                }
                System.out.println();
                i++;
            }
            i = 0;
            while(i < num - 1) {
                int j = i + 2;
                while(j > 0) {
                    System.out.print(j);
                    j--;
                }
                System.out.println();
                i++;
            }
        }
    }
    public static void loop5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();
        if(num < 0) {
            System.out.println("Error: This is not positive integer");
        } else {
            int i = 0;
            while(i < num) {
                int j = 0;
                while(j < i) {
                    System.out.print(" ");
                    j++;
                }
                int k = num - i;
                while(k > 0) {
                    System.out.print("*");
                    k--;
                }
                System.out.println();
                i++;
            }
            i = 0;
            while(i < num) {
                int j = num;
                while(j > 0) {
                    System.out.print(" ");
                    j--;
                }
                int k = 0;
                while(k <= i) {
                    System.out.print("*");
                    k++;
                }
                System.out.println();
                i++;
            }
        }
    }
    public static void loop6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();
        if(num < 0) {
            System.out.println("Error: This is not positive integer");
        } else {
            int i = 0;
            while(i < num) {
                int j = 0;
                while(j < num - i) {
                    System.out.print(" ");
                    j++;
                }
                int k = 0;
                while(k < i * 2 + 1) {
                    System.out.print("*");
                    k++;
                }
                System.out.println();
                i++;
            }
            i = 1;
            while(i < num) {
                int j = 0;
                while(j <= i) {
                    System.out.print(" ");
                    j++;
                }
                int k = (num - i) * 2 - 1;
                while(k > 0) {
                    System.out.print("*");
                    k--;
                }
                System.out.println();
                i++;
            }
        }
    }
    public static void loop7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();
        int max = 0;
        int min = 0;
        if(num < 0) {
            System.out.println("Error: This is not positive integer");
        } else {
            int i = 0;
            while(i < num) {
                int n = sc.nextInt();
                if(i == 0) {
                    max = n;
                    min = n;
                }
                if(max < n) {
                    max = n;
                }
                if(min > n) {
                    min = n;
                }
                i++;
            }
            System.out.println("The max: " + max);
            System.out.println("The min: " + min);
        }
    }
    public static void loop8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for length of array: ");
        int num = sc.nextInt();
        int [] a = new int[num];
        int j = 0;
        while(j < a.length) {
            System.out.print("Enter the number: ");
            int num1 = sc.nextInt();
            a[j] = num1;
            j++;
        }
        int k = 0;
        System.out.print("The array is: ");
        while(k < a.length) {
            System.out.print(a[k] + ", ");
            k++;
        }
        System.out.println();
        int temp = a[0];
        int final_temp = a[0];
        int i = 1;

        while(i < a.length) {
            if(temp + a[i] < a[i]) {
                temp = a[i];
            } else {
                temp = temp + a[i];
            }
            if(final_temp < temp) {
                final_temp = temp;
            } else {
                final_temp = final_temp;
            }
            i++;
        }
        System.out.println("The Max Value of sum of array: " + final_temp);
    }
    public static void loop9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of array: ");
        int num1 = sc.nextInt();
        if(num1 < 0) {
            System.out.println("Error: This is not positive integer");
        } else {
            int [] a = new int[num1];
            int i = 0;
            System.out.println("Enter the number(s) to put into array!");
            while(i < num1) {
                int num2 = sc.nextInt();
                a[i] = num2;
                i++;
            }
            int k = 0;
            System.out.print("The array is { ");
            while(k < a.length) {
                System.out.print(a[k]);
                k++;
                if(k == a.length) {
                    System.out.print(" }");
                } else {
                    System.out.print(", ");
                }
            }
            System.out.println();
            System.out.println("Now time to find number exist.");
            System.out.print("Enter the positive integer: ");
            int num3 = sc.nextInt();
            if(num3 < 0) {
                System.out.print("Error: This is not positive integer");
            }
            System.out.println("You can enter the number " + num3 + " time(s)");
            i = 0;
            while(i < num3){
                boolean found = false;
                int j = 0;
                int num4 = sc.nextInt();
                while(j < a.length) {
                    if(num4 == a[j]) {
                        found = true;
                    }
                    j++;
                }
                if(found) {
                    System.out.println("Found");
                } else {
                    System.out.println("Not found");
                }
                i++;
            }
        }
    }
    public static void loop10() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Enter the positive integer: ");
            int num = sc.nextInt();
            double cal;
            cal = num * (num + 1) / 2;
            if(num == 0) {
                System.out.println("The End!");
                break;
            } else if (num < 0) {
                System.out.print("This is not a positive integer!");
                break;
            }
            System.out.print((int)cal);
            System.out.println();
        }
    }
    public static void string1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String str = sc.nextLine();

        String reversedString = reverse(str);
        System.out.println("The result: " + reversedString);
    }


    // Reverse a given string.
    // input: "abc"
    // output: "cba"
    public static String reverse(String str) {
        String str2 = "";
        // Loop through str in reverse order.
        for (int i = str.length() - 1; i >= 0; i--) {
            // Character.toString is used because concat takes in a string.
            str2 = str2.concat(Character.toString(str.charAt(i)));
        }
        return str2;
    }
    public static void string2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String getStr = sc.nextLine();
        int startingPoint = getStr.length() / 2;

        System.out.println();
        System.out.println("Original String: " + getStr);

        String formerHalf = getStr.substring(startingPoint);
        String latterHalf = getStr.substring(0, startingPoint);
        System.out.println("Result: "+ formerHalf + latterHalf);
    }
    public static void string3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String getStr = sc.nextLine();
        System.out.println();
        System.out.println("Original String: " + getStr);
        System.out.print("Result: ");

        for(int i = 1; i < getStr.length(); i = i + 2) {
            char oddChar = getStr.charAt(i);
            System.out.print(oddChar);
        }
        System.out.println();
    }
    public static void string4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Standard String: ");
        String standardStr = sc.nextLine();
        System.out.print("Enter a comparison target: ");
        String compareStr = sc.nextLine();
        System.out.println();

        boolean result = standardStr.equalsIgnoreCase(compareStr);
        System.out.println("Result: " + result);
    }
    public static void string5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter names: ");
        String getStr = sc.nextLine();
        String nameArr[] = getStr.split(",");
        System.out.println();
        if(nameArr.length > 2) {
            System.out.println("Third name is: " + nameArr[2]);
        } else {
            System.out.println("There is no Third name!");
        }
    }
    public static void string6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String getStr = sc.nextLine();

        String strExceptLast = getStr.substring(0, getStr.length() - 1);
        System.out.print("Result: " + strExceptLast);
    }
    public static void string7() {
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

        String findLast = Character.toString(getStr.charAt(getStr.length() - 1));
        String findTwoLast = getStr.substring(getStr.length() - 2);

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
    public static void string8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Present tense: ");
        String getStr = sc.nextLine();

        String pastTenseAdd = "ed";

        System.out.println("Past Tense: " + getStr.concat(pastTenseAdd));
    }
    public static void string9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String getStr = sc.nextLine();

        String con1 = "a";
        String con2 = "e";
        String con3 = "i";
        String con4 = "o";
        String con5 = "u";
        int count = 0;
        for(int i = 0; i < getStr.length(); i++) {
            if(getStr.contains(con1) || getStr.contains(con2) || getStr.contains(con3) || getStr.contains(con4) || getStr.contains(con5)) {
                count = count + 1;
            }
        }

        System.out.println("The number of vowels: " + count);
    }
    public static void string10() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String getStr = sc.nextLine();

        int halfOfLength = getStr.length() / 2;
        String formerStr = getStr.substring(0,halfOfLength);
        String latterStr = getStr.substring((halfOfLength));

        System.out.println(formerStr + " & " + latterStr);
    }
    public static void string11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any sentence: ");
        String getStr = sc.nextLine();
        String wordArr[] = getStr.split(" ");
        int i = 0;
        for(; i < wordArr.length;) {
            i++;
        }
        System.out.println("The number of words in sentence: " + i);
    }
    public static void string12() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any sentence: ");
        String getStr = sc.nextLine();
        String wordArr[] = getStr.split(" ");

        for(int i = wordArr.length - 1; i >= 0; i--) {
            System.out.print(wordArr[i] + " ");
        }
        System.out.println();
    }
}
