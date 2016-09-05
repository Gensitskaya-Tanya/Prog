package session1;

/**
 * Created by ZaR on 03-Sep-16.
 */
public class Car {
    public static void main(String[] args) {
//        Car carOne = new Car();
//        carOne.color = "Green";
//        carOne.year = 1992;
//        carOne.weight = 0.2;
//        carOne.weight=0.1;
        Car carTwo = new Car("red", 0.1, 1234);
        System.out.println(carTwo.toString());
    }

    private  String color;
    private double weight;
    private int year;
    private double velosity = 0;

    public Car() {
    }

    public Car(String color, double weight, int year) {
        this.color = color;
        this.weight = weight;
        this.year = year;
    }




    void beep() {
        System.out.println("BEEP-BEEP!!!");
    }

    void acceleration(double a) {
        velosity = velosity + a;
    }

    void deceleration(double b) {
        if (velosity - b >= 0) velosity = velosity - b;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setVelosity(double velosity) {
        this.velosity = velosity;
    }


    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public int getYear() {
        return year;
    }

    public double getVelosity() {
        return velosity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", year=" + year +
                ", velosity=" + velosity +
                '}';
    }

}
