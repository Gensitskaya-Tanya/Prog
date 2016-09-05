package session1;

/**
 * Created by ZaR on 03-Sep-16.
 */
public class Dog extends  Animal {
    private String type;

    public Dog() {

    }

    public Dog(String color, int age, String racion, String type) {
        super(color, age, racion);
        this.type = type;
    }

    @Override
    public void getVoice() {
        System.out.println("gav-gav");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' + super.toString()+
                '}';
    }
}
