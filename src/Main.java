import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        /*System.out.println(list.indexOf(20));
        list.contains(20);
        list.removeFirst();*/
        System.out.println(list.size());
        var Arr=list.toArray();
        System.out.println(Arrays.toString(Arr));
        System.out.println(list.findMiddle());

    }
}