public abstract class Decorator extends Cake {
    protected Cake cake; // この飾り枠がくるんでいる「中身」を指す

    protected Decorator(Cake cake) { // インスタンス生成時に「中身」を引数で指定
        this.cake = cake;
    }
}
