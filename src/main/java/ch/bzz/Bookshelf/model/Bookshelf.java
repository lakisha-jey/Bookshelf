package ch.bzz.Bookshelf.model;

import java.util.HashMap;
import java.util.Map;

public class Bookshelf {
    private Map<String, Book> bookMap = new HashMap<>();

    public Map<String, Book> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<String, Book> bookMap) {
        this.bookMap = bookMap;
    }
}
