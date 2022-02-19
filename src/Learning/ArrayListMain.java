package Learning;

public class ArrayListMain {
    public static void main(String[] args) {

        ArrayListAllCode numbers = new ArrayListAllCode();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);


        ArrayListAllCode.ListIterator li = numbers.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
