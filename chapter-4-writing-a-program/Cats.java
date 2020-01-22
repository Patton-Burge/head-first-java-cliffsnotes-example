import java.util.ArrayList;

class GoodKittyTestDrive {
    public static void main(String[] args) {
        Cat kitty = new Cat();
        kitty.setName("Trippy");
        kitty.setAge(5);
        System.out.println(kitty.getName() + " is " + kitty.getAge() + " years old!");
        kitty.meow();
    }
}

public class Cat {

    private String cat_name;
    private int cat_age;

    public void setName(String name) {
        cat_name = name;

    }

    public void setAge(int age) {
        cat_age = age;

    }

    public String getName() {
        return cat_name;

    }

    public int getAge() {
        return cat_age;

    }

    void meow() {
        System.out.println("MEOW");
    }

}