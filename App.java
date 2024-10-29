
public class App {
    public int addition(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("10 + 5 = " + app.addition(10, 5));
    }
}
