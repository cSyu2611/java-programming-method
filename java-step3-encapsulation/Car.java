// クラス オブジェクトの設計図
public class Car {
    // プロパティ オブジェクトの属性，値
    private String manufacturer; // 製造メーカ
    private String carName; // 車種
    private String color; // 色
    private int engineCC; // 排気量
    private int currentSpeed; // 現在の速度
    private int capacity; // 乗車定員

    /////////////////////////////////////////////////////
    // アクセス修飾子 private によりクラス外部から参照できない //
    /////////////////////////////////////////////////////

    // コンストラクタ インスタンス化の際に実行されるメソッド
    public Car(String newManufacturer, String newCarName, String newColor, int newEngineCC, int newCapacity) {
        manufacturer = newManufacturer;
        carName = newCarName;
        color = newColor;
        engineCC = newEngineCC;
        currentSpeed = 0;
        capacity = newCapacity;
        System.out.println("Carインスタンスが作成された！");
    }

    // メソッド オブジェクトの処理
    public void drive() {
        // 前進する
    }

    public void reverse() {
        // 後進する
    }

    public void turn(String direction) {
        // 引数方向に曲がる
    }

    public void brake() {
        this.currentSpeed -= 5;
    }

    public void accel() {
        this.currentSpeed += 5;
    }

    public void showCurrentSpeed() {
        System.out.println("現在のパトカーの速度：" + String.valueOf(currentSpeed));
    }
    //////////////////////////////////
    // 速度を確認するためにメソッドを用意 //
    //////////////////////////////////
}