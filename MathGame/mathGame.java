package MathGame;

import java.util.Random;
import java.util.Scanner;

public class mathGame {
	public static void main(String[] args) {
		int firstElement = getRandom();
        int secondElement = getRandom();
        int firstHint = changeFirstElement(firstElement, secondElement);
        int secondHint = changeSecondElement(firstElement, secondElement);

        System.out.println("Find answer!");
        System.out.println("? is mystery equation or Nonsense Quiz");
                
        quiz01(firstElement, secondElement, firstHint, secondHint);
        quiz02(firstElement, secondElement, firstHint, secondHint);
	    quiz03(firstElement, secondElement, firstHint, secondHint);
        quiz04(firstElement, secondElement, firstHint, secondHint);
    }
    public static int getRandom() {
        Random ran = new Random();
        int randomInt = ran.nextInt(99) + 1;

        return randomInt;
    }
    public static int changeFirstElement(int firstElement, int secondElement) {
    	int firstHint = getRandom();
    	int secondHint = getRandom();

    	if(firstHint == firstElement && secondHint == secondElement) {
    		firstHint = getRandom();
    		secondHint = getRandom();
    	} else if(firstHint == secondElement && secondHint == firstElement) {
    		firstHint = getRandom();
    		secondHint = getRandom();
    	}
        return firstHint;
    }
    public static int changeSecondElement(int firstElement, int secondElement) {
    	int firstHint = getRandom();
    	int secondHint = getRandom();

    	if(firstHint == firstElement && secondHint == secondElement) {
    		firstHint = getRandom();
    		secondHint = getRandom();
    	} else if(firstHint == secondElement && secondHint == firstElement) {
    		firstHint = getRandom();
    		secondHint = getRandom();
    	}
        return secondHint;
    }
    // (bigger one) / (small one) = (rest) ex) 19 ? 64 = 7
    public static void quizEquation01(int firstElement, int secondElement) {
    	int tempAns = 0;
    	
    	while(true) {
	        if(firstElement < secondElement) {
	        	int temp = firstElement;
	            firstElement = secondElement;
	            secondElement = temp;
	            tempAns = firstElement % secondElement;
	            System.out.println(secondElement + " ? " + firstElement + " = " + tempAns);
	            break;
	        } else {
	            tempAns = firstElement % secondElement;
	            System.out.println(firstElement + " ? " + secondElement + " = " + tempAns);
	            break;
	        }
    	}
    }
    public static void quiz01(int firstElement, int secondElement, int firstHint, int secondHint) {
        int finalAns = 4;
        
        System.out.println("Quiz01!");
        System.out.println();
        
        quizEquation01(firstElement, secondElement);
        
        Scanner sc = new Scanner(System.in);    	
    	
    	while(true) {
    		System.out.print("5" + " ? " + "14" + " = ");
        	int ans = sc.nextInt();	        

        	if(ans == finalAns) {
        		System.out.println("Correct!!");
        		break;
        	} else {
        		System.out.println("Wrong! Here is more hint");
        		quizEquation01(firstHint, secondHint);
        	}
        }
    }
    //sum of time ex) 15 + 3 = 6
    public static void quizEquation02(int firstElement, int secondElement) {
    	int tempAns = 0;
    	int tempFirstElement = firstElement;
    	int tempSecondElement = secondElement;

    	while(true) {
    		if(firstElement > 24) {
    			firstElement = firstElement - 24;       		
    		}
    		if(secondElement > 24) {
    			secondElement = secondElement - 24;
    		}
    		if(firstElement <= 24 && secondElement <= 24) {
    			tempAns = firstElement + secondElement;
    			System.out.println(tempFirstElement + " ? " + tempSecondElement + " = " + tempAns);
    			break;
    		}
    	}
    }
    public static void quiz02(int firstElement, int secondElement, int firstHint, int secondHint) {
    	int finalAns = 9;
    	
    	System.out.println("Quiz02!");
        System.out.println();

    	quizEquation02(firstElement, secondElement);
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		System.out.print("25" + " ? " + "8" + " = ");
    		int ans = sc.nextInt();
    		
    		if(ans == finalAns) {
        		System.out.println("Correct!!");
        		break;
    		} else {
        		System.out.println("Wrong! Here is more hint");
        		quizEquation02(firstHint, secondHint);
    		}
    	}
    }
    //@ ? @ = (sum of two elements)(difference of two elements) ex) 12 ? 36 = 33
    public static void quizEquation03(int firstElement, int secondElement) {
    	int firstAdd = 0;
    	int secondSub = 0;
    	
    	firstAdd = firstElement + secondElement;
    	secondSub = Math.abs(firstElement - secondElement);
    	
    	System.out.println(firstElement + " ? " + secondElement + " = " + firstAdd + "" + secondSub);
    }
    public static void quiz03(int firstElement, int secondElement, int firstHint, int secondHint) {
    	int finalAns = 277;
    	
    	System.out.println("Quiz03!");
    	System.out.println();
    	
    	quizEquation03(firstElement, secondElement);
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		System.out.print("17" + " ? " + "10" + " = ");
    		int ans = sc.nextInt();
    		
    		if(ans == finalAns) {
    			System.out.println("Correct!");
    			break;
    		} else {
    			System.out.println("Wrong! Here is more hint");
    			quizEquation03(firstHint, secondHint);
    		}
    	}
    }
    //(sum of two elements) * (sum of two elements) ex) 33 ? 19 = 60
    public static void quizEquation04(int firstElement, int secondElement) {
    	int firstNumOfDigit = firstElement;
    	int secondNumOfDigit = secondElement;
    	int showForFirstElement = firstElement;
    	int showForSecondElement = secondElement;
    	int firstCalculate = 0;
    	int secondCalculate = 0;
    	int countOfFirst = 0;
    	int countOfSecond = 0;
    	int tempAns;

    	while(firstNumOfDigit > 0) {
    		firstNumOfDigit = firstNumOfDigit / 10;
    		countOfFirst = countOfFirst + 1;
    	}
    	while(secondNumOfDigit > 0) {
    		secondNumOfDigit = secondNumOfDigit / 10;
    		countOfSecond = countOfSecond + 1;
    	}
    	if(countOfFirst == 1) {
    		firstCalculate = firstElement;
    	} else if(countOfFirst > 1) {
    		while(firstElement != 0) {
    			firstCalculate = firstCalculate + firstElement % 10;
    			firstElement = firstElement / 10;
    		}
    	}
    	if(countOfSecond == 1) {
    		secondCalculate = secondElement;
    	} else if(countOfSecond > 1) {
    		while(secondElement != 0) {			
    			secondCalculate = secondCalculate + secondElement % 10;
    			secondElement = secondElement / 10;
    		}
    	}

    	tempAns = firstCalculate * secondCalculate;
    	System.out.println(showForFirstElement + " ? " + showForSecondElement + " = " + tempAns);
    }
    public static void quiz04(int firstElement, int secondElement, int firstHint, int secondHint) {
    	int finalAns = 12;
    	
    	System.out.println("Quiz04!");
    	System.out.println();
    	
    	quizEquation04(firstElement, secondElement);
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
        	System.out.print("11" + " ? " + "24" + " = ");
        	int ans = sc.nextInt();
    		
    		if(ans == finalAns) {
    			System.out.println("Correct!");
    			break;
    		} else {
    			System.out.println("Wrong! Here is more hint");
    			quizEquation04(firstHint, secondHint);
    		}
    	}
    }
    public static void quizEquation05(int firstElement, int secondElement) {
    	
    }
}
