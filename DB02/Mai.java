package DB02;

public class Mai {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
        //numbers.add(1, 15);
        //numbers.addFirst(5);
        numbers.removeFirst();
        numbers.removeLast();
//        System.out.println(numbers.get(0));
//        System.out.println(numbers.size());
//        System.out.println(numbers.indexOf(20));
//        System.out.println(numbers);
//        System.out.println(numbers.remove(1));

        System.out.println("ListIterator");

        ArrayList.ListIterator it = numbers.listIterator();

        while(it.hasNext()) {
            int value = (int)it.next();
            System.out.println(value);
        }
        System.out.println(it.hasPrevious());
    }
}
