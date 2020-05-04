public class Book {
    private String sku;
    private String author;
    private String title;
    private String description;
    private String price;
    private boolean inStock;

    //default constructor
    Book() {
        this.title = "default title";
        this.author = "default author";
        this.description = "default description";
        this.price = "20.00";
        this.inStock = false;
    }

    //overloaded constructor
    Book(String sku) {
        this.sku = sku;

    public static String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public static boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public static String getDisplayText() {
        return String.format("Author: %s\tTitle: %s\tDescription: %s\n", getAuthor(), getTitle(), getDescription());
    }
    /*Book class called getDisplayText(). It takes no parameters.
    When called it returns a string containing the author, title and description.
    Do not use System.out.print() in your class. Simply return the string and
    let the calling class handle the print statements.
    You can use this method to print your book information to the console or a file or a web page.*/
}
