package session1.sources;

public class Car {

    private String color;
    private double weight;
    private int year;
    private double velocity = 0;

    public Car() {
    }

    public Car(String color, double weight, int year) {
        this.color = color;
        this.weight = weight;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", year=" + year +
                ", velocity=" + velocity +
                '}';
    }

    void beep() {
        System.out.println("BEEP-BEEP!!!");
    }

    void acceleration(double a) {
        velocity = velocity + a;
    }

    void deceleration(double b) {
        if (velocity - b >= 0) velocity = velocity - b;
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

    public void setVelocity(double velocity) {
        this.velocity = velocity;
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

    public double getVelocity() {
        return velocity;
    }

}
