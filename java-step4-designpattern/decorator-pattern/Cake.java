public abstract class Cake {
    public abstract int getPrice(); // 価格を得る

    public void show() { // 価格を表示する
        System.out.println(getPrice() + "円");
    }
}
