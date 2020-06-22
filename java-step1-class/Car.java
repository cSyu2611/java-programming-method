// クラス オブジェクトの設計図
public class Car {
    // プロパティ オブジェクトの属性，値
    public String manufacturer; // 製造メーカ
    public String carName; // 車種
    public String color; // 色
    public int engineCC; // 排気量
    public int currentSpeed; // 現在の速度
    public int capacity; // 乗車定員

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
}

///////////////////////////////////////////////////////////
// クラスがオブジェクトの設計図なら，実際にオブジェクトにするには？ //
// => step2 instance //
///////////////////////////////////////////////////////////