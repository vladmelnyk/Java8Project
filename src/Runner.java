import java.util.Arrays;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        String[] words = {"test", "lol", "abcde", "XYZ", "123"};
        Arrays.sort(words, (o1, o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(words));

    }
}
