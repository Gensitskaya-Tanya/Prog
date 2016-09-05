package session1;

/**
 * Created by ZaR on 03-Sep-16.
 */
public class Cat extends Animal {
    private String name;
    private String type;

    public Cat() {
        super();
    }



    public Cat(String color, int age, String racion, String name, String type) {
        super(color, age, racion);
        this.name = name;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    @Override
    public void getVoice() {
        System.out.println("may-may");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cat" + "name='" + name + '\'' +                ", type='" + type +"  "+ super.toString();
    }
}
