public class p39 {

    public static <T extends Comparable<T>> void sortArray(T[] array) {
    int n = array.length;
    boolean swapped;
    
    for (int i = 0; i < n - 1; i++) {
    swapped = false;
    for (int j = 0; j < n - 1 - i; j++) {
    if (array[j].compareTo(array[j + 1]) > 0) {
    T temp = array[j];
    array[j] = array[j + 1];
    array[j + 1] = temp;
    swapped = true;
    }
    }
    if (!swapped) {
    break;
    }
    }
    }
    
    public static void main(String[] args) {
    Product[] products = {
    new Product("Laptop", 1200, 4.5),
    new Product("Phone", 800, 4.3),
    new Product("Headphones", 150, 4.7),
    new Product("Monitor", 300, 4.4)
    };
    
    sortArray(products);
    
    for (Product p : products) {
    System.out.println(p);
    }
    }
    }
    
    class Product implements Comparable<Product> {
    String name;
    double price;
    double rating;
    
    public Product(String name, double price, double rating) {
    this.name = name;
    this.price = price;
    this.rating = rating;
    }
    
    @Override
    public int compareTo(Product other) {
    return Double.compare(this.price, other.price);
    }
    
    @Override
    public String toString() {
    return name + " - $" + price + " - Rating: " + rating;
    }
    }
    