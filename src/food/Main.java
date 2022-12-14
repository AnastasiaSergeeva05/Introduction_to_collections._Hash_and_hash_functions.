package food;

import passport.Passport;
import school.MultiplicationTable;
import school.Task;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product vinograd = new Product("Виноград", 150.0f, 5);

        Product hleb = new Product("Хлеб", 20.0f, 2);

        ProductList productList = new ProductList();
        productList.addProduct(vinograd);
        productList.addProduct(hleb);
        System.out.println(productList);


        Recipie recipie = new Recipie("Рецепт оливье", Set.of(vinograd, hleb));
        System.out.println(recipie);

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);

        Passport passport1 = new Passport(123456,"Ivanov","Ivan","Ivanovich", LocalDate.EPOCH)   ;
        System.out.println(passport1);


        numberRemove();

    }

    private static void numberRemove() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        numbers.removeIf(next -> next % 2 != 0);
        System.out.println(numbers);
    }
}