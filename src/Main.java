import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product vinograd = new Product("Виноград", 150.0f, 5);

        Product hleb = new Product("Хлеб", 20.0f, 2);

        ProductList productList = new ProductList();
        productList.addProduct(vinograd);
        productList.addProduct(hleb);
        System.out.println(productList);


       Recipie recipie = new Recipie("Рецепт оливье",Set.of(vinograd,hleb));
        System.out.println(recipie);

    }
}