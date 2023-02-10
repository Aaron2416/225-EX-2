import java.util.Date;

public class Book{
    private String lastName;
    private String firstName;
    private String ISBN;
    private String title;
    private Date puplicationD;
    private int pageNum;

    public Book(String lastName, String firstName, String ISBN,
    String title, Date publicationDate, int pages) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ISBN = ISBN;
        this.title = title;
        this.puplicationD = puplicationD;
        this.pageNum = pageNum;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getISBN() {
        return ISBN; 
    }
    
    public String getTitle() {
        return title;
    }
    
    public Date getPublicationDate() {
        return puplicationD;
    }
    
    public int getPages() {
        return pageNum;
    }
    
    public void printData() { 
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Author: " + firstName + " " + lastName);
        System.out.println("Pages: " + pageNum);
        System.out.println("Date published: " + puplicationD);
        if (pageNum < 10) {
            System.out.println("Number of pages is too small.");
        }
    }
    
    public static void main(String[] args) {
        Date publicationDate = new Date();
        Book book = new Book("Doe", "John", "123456789", "My Book", publicationDate, 20);
        book.printData();
    }
    }