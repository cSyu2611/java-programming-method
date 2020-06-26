public class ChocolateCake extends Cake {

    @Override
    public int getPrice() { // 親クラスの価格を得るメソッドをオーバーライド
        return 600;
    }
}
