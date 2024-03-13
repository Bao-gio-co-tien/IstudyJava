public class Book extends Item{
    @Override
    public void showInfo() {
        System.out.println("Here are some details about this book: ");
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Author: "+ author);
        System.out.println("Genre: " + genre);
        System.out.println("Number of page: " + numberOfPage);
        System.out.println("Price: " + price + "$");
        System.out.println("Description: " + getDescription());
    }

    String author;
    int numberOfPage;
    String genre;

    public void aBook(String name,
                      String description,
                      String ID,
                      float price,
                      String author,
                      int numberOfPage,
                      String genre) {
        super.anItem(name, description, ID, price);
        this.author = author;
        this.numberOfPage =numberOfPage;
        this.genre = genre;
    }
}
