import java.util.ArrayList;
import java.util.Arrays;

public class Cat {
    String name;
    int age;
    int disponible;

    public Cat(String name, int age, int disponible) {
        this.name = name;
        this.age = age;
        this.disponible = disponible;
    }

    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(
        1,2,3,4,5
    ));

    public void countCat() {
        for (int cat : nums ) {
            System.out.println(cat);
        }
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
