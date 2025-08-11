package Head03_ClassAndObject.example05_car;

public class Car {
    private int year;           //연식
    private String make;        //제조사
    private double price;       //가격
    private String kind;        //차종
    private String turnSignal;  //방향지시등
    private boolean autoDrive;  //자율주행
    private String gear;        //기어

    public Car(int year, String make, double price, String kind) {
        this.year = year;
        this.make = make;
        this.price = price;
        this.kind = kind;
    }

    public void setAutoDrive(boolean on) {
        if (on) {
            this.autoDrive = true;
            System.out.println("자율 주행을 시작합니다.");
        } else {
            this.autoDrive = false;
            System.out.println("자율 주행을 중단합니다.");
        }
    }

    public void setTurnSignal(String where) {
        if (where.equals("right")) {
            this.turnSignal = "right";
            System.out.println("오른쪽 방향 지시등 점등");
        } else if (where.equals("left")) {
            this.turnSignal = "left";
            System.out.println("왼쪽 방향 지시등 점등");
        } else if (where.equals("leftAndRight")) {
            this.turnSignal = "leftAndRight";
            System.out.println("양쪽 방향 지시등 점등");
        } else {
            this.turnSignal = "none";
            System.out.println("방향 지시등 소등");
        }
    }

    public void setGear(String position) {
        if (position.equals("D")) {
            this.gear = "Drive";
            System.out.println("Drive");
        } else if (position.equals("R")) {
            this.gear = "Reverse";
            System.out.println("Reverse");
        } else if (position.equals("P")) {
            this.gear = "Park";
            System.out.println("Park");
        } else {
            this.gear = "Neutral";
            System.out.println("Neutral");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", price=" + price +
                ", kind='" + kind + '\'' +
                ", turnSignal='" + turnSignal + '\'' +
                ", autoDrive=" + autoDrive +
                ", gear='" + gear + '\'' +
                '}';
    }
}
