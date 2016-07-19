import java.util.Arrays;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Runner {
    public static void main(String[] args) {
        String[] words = {"Test", "lol", "abcde", "XYZ", "123"};
        boolean lower = false;
        UnaryOperator<String> toLowerCase1 = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s.toLowerCase();
            }
        };
        UnaryOperator<String> toLowerCase2 = (String s) -> {
            return s.toLowerCase();
        };
        UnaryOperator<String> toLowerCase3 = (String s) -> s.toLowerCase();
        UnaryOperator<String> toLowerCase4 = (s) -> s.toLowerCase();
        UnaryOperator<String> toLowerCase5 = s -> s.toLowerCase();
        UnaryOperator<String> toLowerCase6 = String::toLowerCase;

        UnaryOperator<String> toLowerCase = String::toLowerCase;
        UnaryOperator<String> toUpperCase = s -> s.toUpperCase();
        UnaryOperator<String> f = lower ? toLowerCase : toUpperCase;
        for (int i = 0; i < words.length; i++) {
            words[i] = f.apply(words[i]);
        }
        System.out.println(Arrays.toString(words));

    }
}
