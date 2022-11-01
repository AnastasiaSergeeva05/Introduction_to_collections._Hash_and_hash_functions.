public class Main {
    public static void main(String[] args) {

        Product vinograd = new Product("Виноград",150.0f,5);

        Product hleb = new Product("Хлеб",20.0f,2);
        ProductList productList = new ProductList();
        productList.addProduct(vinograd);
        productList.addProduct(hleb);
        System.out.println(productList);

        Product vinograd2 = new Product("Виноград",140.0f,7);
        productList.addProduct(vinograd2);


    }
}