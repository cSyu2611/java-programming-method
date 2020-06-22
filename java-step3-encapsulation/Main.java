public class Main {
    public static void main(String[] args) {
        // インスタンス化
        Car policeCar = new Car("TOYOTA", "Crown", "Black and white", 2500, 5);

        // police_car.currentSpeed = 10000;
        // System.out.println("現在のパトカーの速度：" + String.valueOf(police_car.currentSpeed));

        ///////////////////////////////////////////////////////////////////
        // => Main.java:6: エラー: currentSpeedはCarでprivateアクセスされます //
        // => Main.java:7: エラー: currentSpeedはCarでprivateアクセスされます //
        ///////////////////////////////////////////////////////////////////

        policeCar.accel();
        policeCar.showCurrentSpeed();

        //////////////////////////////////////////////////////////
        // オブジェクト利用者はオブジェクトを操作するメソッドの仕様のみを //
        // 理解しておけば良い //
        // オブジェクト外から意図しない利用を回避 //
        ////////////////////////////////////////////////////////

        ////////////////////////////////////////////////////////////////////
        // パトカーに必要なサイレンのプロパティやメソッドがCarクラスには含まれていない /
        // 新しくPoliceCarクラスを定義する? //
        // => step4 inheritance //
        ////////////////////////////////////////////////////////////////////
    }
}