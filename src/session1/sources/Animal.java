package session1.sources;

public class Animal {
    private String color;
    private int age;
    private String ration;

    public Animal(String color, int age, String ration) {
        this.color = color;
        this.age = age;
        this.ration = ration;
    }

    @Override
    public String toString() {
        return   "color= " + color + " " + ", age= " + age + ", ration= " + ration + " ";
    }

    protected void getVoice(){
        System.out.println("Animal");
    }

    public String getColor() {return color;    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }
}
