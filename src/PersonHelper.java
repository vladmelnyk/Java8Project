import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersonHelper {
    static List<Person> getPersons(){
        Person person1 = new Person("Tom", 55,null, Collections.emptyList());
        Person person2 = new Person("Sasha", 23,person1, Collections.emptyList());
        Person person3 = new Person("Liza", 10, person1, Collections.emptyList());
        Person person4 = new Person("Sarah", 18,person1, Collections.emptyList());
        Person person5 = new Person("Bobby", 45,null, Arrays.asList(person2, person3));
        Person person6 = new Person("Tommy", 25,person5,  Arrays.asList(person2, person3));
        return Arrays.asList(person1, person2, person3, person4, person5, person6);
    }
}
