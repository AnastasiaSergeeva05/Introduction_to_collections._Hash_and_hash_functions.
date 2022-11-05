package food;

import java.util.Objects;
import java.util.Set;

public class Recipie {

    private final String name;
    private final Set<Product> products;


    public Recipie(String name, Set<Product> products) {
        if (name == null || name.isBlank() || products == null ||
                products.size() == 0) {
            throw new IllegalArgumentException("Нет данных о продукте");
        }
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public float getRecipePrice() {
        float sum = 0;
        for (Product product : products) {
            sum += product.getPrice();

        }
        return sum;
    }


    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipie recipie = (Recipie) o;
        return name.equals(recipie.name) && products.equals(recipie.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, products);
    }

    @Override
    public String toString() {
        return "food.Recipie{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}