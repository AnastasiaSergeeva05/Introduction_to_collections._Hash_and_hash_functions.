import java.util.Objects;

public class Product {
    private final String name;
    private final float price;
    private final int quanlity;

    private boolean checked;


    public Product(String name, float price, int quanlity) {
        if (name == null || name.isBlank() || price < 0 || quanlity < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
        this.price = price;
        this.quanlity = quanlity;
        this.checked = false;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setChecked() {
        this.checked = true;
    }

    public boolean isChecked() {
        return checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String chekedString = this.isChecked() ? "Да " : "Нет ";
        return String.format("%s, Цена: %s, Колличество: %s, " +
                "Куплен: %s ",this.name,this.price,this.quanlity,chekedString);
    }
}