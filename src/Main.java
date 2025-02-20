import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Petr");
        list.add("Sergei");
        list.add("Egor");
        list.add("Mikhail");

        remove(list, 4, 2);

        for (String s : list) {
            System.out.println(s);
        }
    }
    public static void remove(List<String> list, int i,int n) {
        ListIterator<String> iterator = list.listIterator(i);
        if(i<0 || i>list.size() || n<0 ) return;
        for (int j = 0; j < n; j++) {
            if(!iterator.hasNext()) return;
            iterator.next();
            iterator.remove();
        }
    }
}