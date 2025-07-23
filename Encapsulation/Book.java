public class Book {
  private String title;
  private String author;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public static void main(String[] args) {
    Book b = new Book();
    b.setAuthor("Kalidas");
    b.setTitle("Shakespeare");
    System.out.println("This book author is : " + b.getAuthor() + " and Title is :" + b.getTitle());
  }
}
