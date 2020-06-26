public class Main {
    public static void main(String[] args) {
        Cake strawberryshortcake = new StrawberryDecorator(new ShortCake());
        strawberryshortcake.show();
    }
}
