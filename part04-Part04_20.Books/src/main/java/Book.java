/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan
 */
public class Book {
    private String title;
    private int numOfPages;
    private int publicationYear;
    
    public Book(String title, int numOfPages, int publicationYear) {
        this.title = title;
        this.numOfPages = numOfPages;
        this.publicationYear = publicationYear;
    }
    public String getTitle() {
        return this.title;
    }
    public int getNumOfPages() {
        return this.numOfPages;
    }
    public int getPubYear() {
        return this.publicationYear;
    }
    @Override
    public String toString() {
        return this.title + ", " + this.numOfPages + " pages, " + this.publicationYear;
    }
}
