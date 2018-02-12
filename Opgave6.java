import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//opgave 6

public class Opgave6 {
    public static void main(String[] args) {

        List<Integer> a = new LinkedList<>();

        a.add(3);
        a.add(7);
        a.add(3);
        a.add(-1);
        a.add(2);
        a.add(3);
        a.add(7);
        a.add(2);
        a.add(15);
        a.add(15);


        countUnique(a);

    }

    public static void countUnique(List<Integer> list1)
    {
        Set<Integer> set = new HashSet<>(); // Set indeholder ikke duplikates så selvom jeg tilføjer listen

        set.addAll(list1);

        System.out.println(set.size()); // udskriver settets længde for at se hvor mange unikke integers der er
    }
}
