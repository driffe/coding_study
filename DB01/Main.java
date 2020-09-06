package DB01;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("Add(value):" + numbers);

        numbers.add(1, 50);
        System.out.println("NewAdd(value):" + numbers);

        numbers.remove(2);
        System.out.println("After remove:" + numbers);
        // 인덱스 값을 가져오기
        System.out.println("Get(2): " + numbers.get(1));
        // 사이즈 값
        System.out.println("Size: " + numbers.size());
        //그 값의 위치
        System.out.println("indexOf(): " + numbers.indexOf(30));

        Iterator it = numbers.iterator();
        //다음 값이 존재하는지를 검사
        while(it.hasNext()) {
            int value = (int) it.next();
            if(value == 30) {
                it.remove();
            }
            System.out.println(value);
        }
        System.out.println(numbers);

        System.out.println("With for loop");
        for(int value : numbers) {
            System.out.println(value);
        }
        System.out.println("With another for loop");
        for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
