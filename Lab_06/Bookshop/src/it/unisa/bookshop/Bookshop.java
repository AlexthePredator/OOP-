package it.unisa.bookshop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Bookshop {

    final private List<Book> bookshop;

    public Bookshop() {
        bookshop = new ArrayList<>();
    }

    public List<Book> findByAuthor(String author) {
        List<Book> list = new ArrayList<>();
        for(Book book : this.bookshop){
            if(book.getAuthor().equalsIgnoreCase(author))
                list.add(book);
        }
        return list;
    }

    public List<Book> findByTitleContent(String titleContent) {
        List<Book> list = new ArrayList<>();
        for(Book book : this.bookshop){
            if(book.getTitle().equalsIgnoreCase(titleContent))
                list.add(book);
        }
        return list;
    }

    public List<Book> findMaxAvailable() {
        List<Book> books = new ArrayList<>();
        int max = this.bookshop.get(0).getNumberOfCopies();
        for(Book b : bookshop){
            if( b.getNumberOfCopies() == max)
                books.add(b);
        }
        return books;
    }

    public List<Book> findBelowAvailability(int threshold) {
        List<Book> books = new ArrayList<>();
        for(Book book : this.bookshop){
            if(book.getNumberOfCopies() < threshold)
                books.add(book);
        }
        return books;
    }

    public List<Book> getBookshop() {
        return bookshop;
    }

    public void readUserDataFromFile(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        while (input.hasNextLine()){
            String type = input.nextLine();
            String title = input.nextLine();
            String author = input.nextLine();
            String editor = input.nextLine();
            int numberCopies = Integer.parseInt(input.nextLine());
            if( type.equals("AudioBook")){
                int length = Integer.parseInt(input.nextLine());
                String format = input.nextLine();
                AudioBook audioBook = new AudioBook(title, author, editor, length, format);
                audioBook.setNumberOfCopies(numberCopies);
                this.bookshop.add(audioBook);
            }
            else{
                Book book = new Book(title, author, editor);
                book.setNumberOfCopies(numberCopies);
                this.bookshop.add(book);
            }
        }
    }
}
