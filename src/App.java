import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class App  {


   static int suma(int num1, int num2) {
        return num1 + num2;
    }

    static String sayName(String name) {
        return "Hello " + name;
    }

    public static void main(String[] args) throws Exception {
        Fib fiboo = new Fib();
        fiboo.Fibo();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("What is your name???");
        // String name = sc.nextLine();
        // System.out.println(sayName(name));
        // System.out.println(suma(5,6));

        // Cat blacky = new Cat("Blacky", 3);

        // System.out.println(blacky.age);
        // Array nums = new Array();
        // nums.showNums();
        // System.err.println("-------");
        // MyArrayList();
        // System.err.println("-------");
        // ArrayListForObjects();
        // System.err.println("-------");
        // blacky.countCat();   
        System.err.println("Quieres ver que gatos hay????");
        Scanner sc = new Scanner(System.in);
        String respuesta = sc.nextLine().toLowerCase();

        while (!respuesta.equals("si")) {
            System.err.println("Si, quieres ver a uno, a cual???");
            respuesta = sc.nextLine().toLowerCase();
        }
        
        try {
            if (respuesta.equals("si")) {
                ArrayListForObjects(); 
            } else {
                throw new InvalidException("The fucking user didn't want to see the cats >:(");
            }
        } catch (InvalidException e) {
            System.err.println("Fail: " + e.getMessage());
            System.exit(1);
        }


        ArrayList<Cat> cats = new ArrayList<>(Arrays.asList(
            new Cat("Blacky", 4, 0),
            new Cat("Cuchurrumino", 5,0),
            new Cat("Puchino", 3, 1)
        ));

        System.err.println("A cual te quieres llevar?");
        // int catToTake = sc.nextInt();
        String catToTake = sc.nextLine();

        
        try {
            // if (!cats.contains("a")) {
            //     throw new InvalidExceptionCatsSize("Fuck u, that cat doesnt exist >:((((((");
            // } 
            for (Cat cat : cats ) {
                String catNameToUpperCase = cat.getName().substring(0,1).toUpperCase() + cat.getName().substring(1);
                if (!catNameToUpperCase.equals(cat.getName())) {
                throw new InvalidExceptionCatsSize("Fuck u, that cat doesnt exist >:((((((");
                }
            }
        } catch (InvalidExceptionCatsSize e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
        SearchAndChangeCatStatus(cats, catToTake);
        System.err.println("Perfecto, aqui esta la nueva lista de gatitos ^^");
        ArrayListForObjects();
        
    }

    public static void SearchAndChangeCatStatus(ArrayList<Cat> cats, String catNameToSearch) {
        //     for (Cat cat : cats  ) {
        //         if 
        //    }

            for (Cat cat : cats ) {
                String catNameToUpperCase = cat.getName().substring(0,1).toUpperCase() + cat.getName().substring(1);
                if (catNameToUpperCase.equals(catNameToSearch)) {
                    cat.setDisponible(0);
                    break;
                }
            }

    }

    public static void ArrayListForObjects() {
        // Using ArrayList god
        ArrayList<Cat> cats = new ArrayList<>(Arrays.asList(
            new Cat("Blacky", 4, 0),
            new Cat("Cuchurrumino", 5,0),
            new Cat("Puchino", 3, 1)
        ));

        // Using array buuuu
        // Cat[] cats = {new Cat("Blaky", 3, 0), new Cat("Cuchurrumino", 4, 0)};
        
        // Cat[] newCats = Arrays.copyOf(cats, cats.length + 1);
        // newCats[cats.length] = new Cat("Pichi", 2, 1);
        // cats.size();

        // cats.remove(1);

        int counter = 0;
        for (Cat cat : cats ) {
            System.out.printf("Cat's index: %d, Cat's name: %s, cat's age: %d, availability: %d \n", counter, cat.name, cat.age, cat.disponible);
            counter += 1;
        }
    }

    public static int getCats(ArrayList<Cat> cats) {
        return cats.size() - 1;
    }

    public static void MyArrayList() {
        ArrayList<Integer> numss = new ArrayList<>(Arrays.asList(10,20));
        numss.add(30);

        for (int num : numss) {
            System.out.println(num);
        }
    }

}
