import java.util.List;
import java.util.function.BooleanSupplier;

public class QueueTerminal {
    private List<Person> listOfPersons;

    public Boolean isValid (Person person){
        Predicate<Person> p1 = s -> s.getAge()>18;
        Predicate<Person> p2 = s -> s.getName().length()>0;
        return p1.and(p2).test(person);
    }
}
