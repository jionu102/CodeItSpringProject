package Head03_ClassAndObject.example05_car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(2000, "현대", 2000, "똥차");
        car.setAutoDrive(true);
        car.setGear("D");
        car.setTurnSignal("none");
        System.out.println(car.toString());
    }
}
