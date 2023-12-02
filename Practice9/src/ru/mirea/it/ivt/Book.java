package ru.mirea.it.ivt;

public class Book implements Comparable<Book>{
    public String title;
    public String Author;
    public int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        Author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public int compareTo(Book obj) {
        return Integer.compare(this.numberOfPages, obj.numberOfPages);
    }

    public String toString(){
        return "Title - " + this.title + ", author is " + this.Author + ", number of pages = " + this.numberOfPages + ";";
    }
}
