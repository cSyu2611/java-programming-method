public class BananaDecorator extends Decorator {

    public BananaDecorator(Cake cake) { // コンストラクタで飾り付けの対象を渡す
        super(cake);
    }

    @Override
    public int getPrice() { // 中身の価格に80を加えたもの
        return cake.getPrice() + 80;
    }
}
