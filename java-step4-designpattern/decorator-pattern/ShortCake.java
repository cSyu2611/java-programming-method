public class ShortCake extends Cake {

    @Override
    public int getPrice() { // 親クラスの価格を得るメソッドをオーバーライド
        return 500;
    }
}
