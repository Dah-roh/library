 import java.util.*;

public class Library<T> extends Borrowers{
    private String bookTitle;
    private Date time;
    private int numberOfBooks;
    private int sumOfborrowedBooks;
    private int numberOfBooksAvaliable;
    private PriorityQueue<Borrowers> booksBorrowedDetails = new PriorityQueue<Borrowers>(5,new BorrowerComparator());
    private List<T> shelf = new ArrayList<T>(15);
    private Queue borroers = new Queue(15);

    public Queue getBorroers() {
        return borroers;
    }

    public Library(int level, String bookName, String name, Date time) {
        super(level, bookName, name);
        this.time = time;
    }

    public Library(int level, String name, String bookName) {
        super(level, name, bookName);
    }
    Borrowers level = new Borrowers(1,"williams", "lean on me");
    public PriorityQueue<Borrowers> getBooksBorrowedDetails() {
        return booksBorrowedDetails;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public int getSumOfborrowedBooks() {
        return sumOfborrowedBooks;
    }

    public void setSumOfborrowedBooks(int sumOfborrowedBooks) {
        this.sumOfborrowedBooks = sumOfborrowedBooks;
    }

    public int getNumberOfBooksAvaliable() {
        return numberOfBooksAvaliable;
    }

    public void setNumberOfBooksAvaliable(int numberOfBooksAvaliable) {
        this.numberOfBooksAvaliable = numberOfBooksAvaliable;
    }

    public void setBorroers(Queue borroers) {
        this.borroers = borroers;
    }

    public List<T> getShelf() {
        return shelf;
    }

    public void setShelf(List<T> shelf) {
        this.shelf = shelf;
    }


    public List<T> addbooks(T bookTitle){
        shelf.add (bookTitle);
        shelf.add(bookTitle);
        shelf.add(bookTitle);
        return shelf;
    }
    public void setBooksBorrowedDetails(PriorityQueue<Borrowers> booksBorrowedDetails) {
        this.booksBorrowedDetails = booksBorrowedDetails;
    }


    public void lend (String borrowersName, int borrowersLevel, String bookName){

                if(!borroers.isEmpty()) {

                    System.out.println(borroers.size());
                    System.out.println(shelf.size());
                    System.out.println(shelf.remove(borroers.peekFront()));
                    System.out.println(shelf.size());
                    borroers.peekFront();
                    System.out.println(borroers.peekFront());
                    System.out.println(borroers.peekFront().toString()+"has been given");
                    borroers.remove();
                    System.out.println(borroers.size());
        }

        }
    public void lends (String borrowersName, int borrowersLevel, String bookName){

        if(shelf.contains(booksBorrowedDetails.peek())) {
            shelf.remove(booksBorrowedDetails.peek());
            System.out.println(booksBorrowedDetails.peek().getBookName()+ " has been borrowed from the Library by "+booksBorrowedDetails.peek().getName());
            booksBorrowedDetails.poll();
        }

    }


    public void lendingBook ( String bookN, String name, int level, Borrowers borrowr) {
        time = new Date();
        if (shelf.size() == 0) {
            System.out.println("Book Taken");

        } else {
            if (borrowr.getLevel() == level && shelf.toString().contains(bookN) && (borrowr.getLibraryMembers()).toString().contains(name)) {
                booksBorrowedDetails.add(borrowr);
                borroers.insert(borrowr);
                System.out.println(borrowr.getName() + " has requested for " + bookN + " at " + time);
            } else {
                System.out.println("Oops:(  You have no borrowing privileges!!! ");
            }
        }
    }

    public void listBookdt(){

            System.out.println(booksBorrowedDetails);

    }
    public void listBookdt1(){

        System.out.println(borroers);

    }

    }


