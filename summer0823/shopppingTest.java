package summer0823;

import java.util.Scanner;

public class shopppingTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Scanner sc = new Scanner(System.in);
        String type = sc.next();

        if(type.equalsIgnoreCase("Computer")) {
            b.buy(new Computer());
        } else if(type.equalsIgnoreCase("Tv")) {
            b.buy(new Tv());
        } else {
            System.out.println("There is no stock");
        }
        System.out.println("Current Money: " + b.money);
        System.out.println("Your Point: " + b.bonusPoint);
    }
}
class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv extends Product {
    Tv() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}
class Computer extends Product {
    Computer() {
        super(50);
    }
    public String toString() {
        return "Comupter";
    }
}
class Buyer {
    int money = 10000;
    int bonusPoint = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("You don't have enough money");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println("You buy " + p);
    }
}