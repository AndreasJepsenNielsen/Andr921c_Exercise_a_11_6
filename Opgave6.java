import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//opgave 6

public class Opgave6 {
    public static void main(String[] args) {

        List<Integer> a = new LinkedList<>();

        List<Integer> b = new LinkedList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);

        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);

        countUnique(a,b);

    }

    public static void countUnique(List<Integer> list1,List<Integer> list2)
    {
        Set<Integer> set = new HashSet<>(); // Set indeholder ikke duplikates så selvom jeg tilføjer begge lister får jeg kun 1 af hver int

        set.addAll(list1);
        set.addAll(list2);

        System.out.println(set.size()); // udskriver listens længde for at se hvor mange unikke integers der er
    }
}
