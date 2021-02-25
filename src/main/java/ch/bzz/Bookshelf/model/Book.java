package ch.bzz.Bookshelf.model;

import java.math.BigDecimal;

public class Book {
    private String bokUUID;
    private String title;
    private String author;
    private Publisher publisher;
    private BigDecimal price;
    private String isbn;

    public String getBokUUID() {
        return bokUUID;
    }

    public void setBokUUID(String bokUUID) {
        this.bokUUID = bokUUID;
    }

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

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
