package Lesson_18;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

abstract class Item {
    private String id;
    private String title;
    private LocalDate publicationDate;
    private int maxCheckoutDays;

    private Item(String id, String title, LocalDate publicationDate, int maxCheckoutDays){
        this.id = id;
        this.title = title;
        this.publicationDate = publicationDate;
        this.maxCheckoutDays = maxCheckoutDays;
    }
    public String getId() { return id; }
    public String getTitle() { return title; }
    public LocalDate getPublicationDate() { return publicationDate; }
    public int getMaxCheckoutDays() { return maxCheckoutDays; }

}
class Book extends Item {
    private String author;
    private int pages;

    public Book(String id, String title, LocalDate publicationDate, String author, int pages) {
        super(id, title, publicationDate, 21);
        this.author = author;
        this.pages = pages;

    }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }
    }

class CD extends Item {
    private String artists;
    private int tracks;

    public CD(String title, LocalDate publicationDate, string artist, int tracks) {
        super(id, title, publicationDate, 14);
        this.artist = artist;
        this.tracks = tracks;
    }
    public String getArtists() { return artist; }
    public int getTracks() { return tracks; }
} 
public class Main {
    
}
