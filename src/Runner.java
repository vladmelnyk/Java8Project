public class Runner {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("hello111");
        r.run();
    }
}
