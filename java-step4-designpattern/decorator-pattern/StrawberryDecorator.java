public class StrawberryDecorator extends Decorator {

    public StrawberryDecorator(Cake cake) { // コンストラクタで飾り付けの対象を渡す
        super(cake);
    }

    @Override
    public int getPrice() { // 中身の価格に100を加えたもの
        return cake.getPrice() + 100;
    }

}
