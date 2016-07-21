import java.beans.PersistenceDelegate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
//        Runnable runnable1 = () -> System.out.println("firstInstance");
//        Runnable runnable2 = () -> System.out.println("secondInstance");
//        runnable1.run();
//        runnable2.run();
//
//        List<Person> personList = new ArrayList<>();
//        Comparator<Person> comparatorAge = (Person person1, Person person2) -> Integer.compare(person1.getAge(), person2.getAge());
//        Comparator<Person> comparatorName = (o1, o2) -> o1.getName().compareTo(o2.getName());
//
//        Person person1 = new Person();
//        person1.setAge(43);
//        person1.setName("Alex");
//        Person person2 = new Person();
//        person2.setAge(58);
//        person2.setName("Mike");
//        Person person3 = new Person();
//        person3.setAge(17);
//        person3.setName("Bob");
//        personList.add(person1);
//        personList.add(person2);
//        personList.add(person3);
//
//        personList.sort(comparatorAge);
//        System.out.println(personList);
//        personList.sort(comparatorName);
//        System.out.println(personList);
//
//        personList.forEach(System.out::println);
//
//        QueueTerminal queueTerminal = new QueueTerminal();
//        System.out.println(queueTerminal.isValid(person2));
//        Consumer<Person> c = System.out::println;
//        c.accept(person2);
//        Supplier<Person> s = Person::new;
//        System.out.println(s.get());
//
//        Function<String, Integer> length = String::length;
//        System.out.println(length.apply("abcd"));
//        Stream<Integer> numbers = Stream.of(1, 2, 3, 4);
//        String[] words = {"abc", "aEGEGA", "123", "ewewgq", "!@!$@!#!"};
//        Stream<String> wordsStream = Arrays.stream(words);
//        Stream<Double> doubleStream = Stream.generate(Math::random).limit(10);

        Stream<Person> personStream = PersonHelper.getPersons().parallelStream();
        personStream.map((Person pers) -> pers.getAge())
                .filter((Integer age) -> age > 25)
                .flatMapToInt((Integer age) -> IntStream.of(age))
                .average()
                .ifPresent(System.out::println);

        Function<Person, Stream<Person>> flatMapf = p -> p.getFriends().stream();
        PersonHelper.getPersons().stream().flatMap(flatMapf).forEach(System.out::println);
//        String[] words = {"Test", "lol", "abcde", "XYZ", "123"};
//        boolean lower = false;
//        UnaryOperator<String> toLowerCase1 = new UnaryOperator<String>() {
//            @Override
//            public String apply(String s) {
//                return s.toLowerCase();
//            }
//        };
//        UnaryOperator<String> toLowerCase2 = (String s) -> {
//            return s.toLowerCase();
//        };
//        UnaryOperator<String> toLowerCase3 = (String s) -> s.toLowerCase();
//        UnaryOperator<String> toLowerCase4 = (s) -> s.toLowerCase();
//        UnaryOperator<String> toLowerCase5 = s -> s.toLowerCase();
//        UnaryOperator<String> toLowerCase6 = String::toLowerCase;
//
//        UnaryOperator<String> toLowerCase = String::toLowerCase;
//        UnaryOperator<String> toUpperCase = s -> s.toUpperCase();
//        UnaryOperator<String> f = lower ? toLowerCase : toUpperCase;
//        for (int i = 0; i < words.length; i++) {
//            words[i] = f.apply(words[i]);
//        }
//        System.out.println(Arrays.toString(words));

    }
}
