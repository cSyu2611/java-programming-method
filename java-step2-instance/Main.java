public class Main {
    public static void main(String[] args) {
        //////////////////
        // インスタンス化 //
        //////////////////
        Car policeCar = new Car("TOYOTA", "Crown", "Black and white", 2500, 5);

        policeCar.currentSpeed = 10000;
        System.out.println("現在のパトカーの速度：" + String.valueOf(police_car.currentSpeed));

        /////////////////////////////////////////////////////////////
        // パトカーオブジェクトのプロパティをオブジェクト外部から直接操作可能 //
        // クラス設計者の想定外の値になる可能性有り //
        // step3 encapsulation //
        /////////////////////////////////////////////////////////////
    }
}