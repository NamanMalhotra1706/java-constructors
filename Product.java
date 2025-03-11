public class Product{
    // Instance Variables
    String productName;
    int productPrice;

    // Class variable
    public static int totalProduct = 0;

    // Constructor
    Product(String productName, int productPrice ){
        this.productName = productName;
        this.productPrice = productPrice;
        Product.totalProduct+=1;
    }

    // Methods to display the details of a product
    public void displayProductDetails(){
        System.out.println("Product name: " + this.productName);
        System.out.println("Price of Product: Rs." + productPrice);
    }
    
    //  total number of products created
    public static int displayTotalProducts(){
        return totalProduct;
    }

    public static void main(String[] args) {
        Product p1 = new Product("soap", 100);
        p1.displayProductDetails();

        Product p2 = new Product("Chawal", 40);
        p2.displayProductDetails();

        System.out.println(Product.displayTotalProducts());
    }


}
