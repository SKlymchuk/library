package Model;

import java.util.ArrayList;

public class Publication {
    private int year;
    private String author;
    private String title;
    private ArrayList<Publication> ref;

    public Publication(String title, int year, String author){
        this.year = year;
        this.author = author;
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Публикация: " + title +
                " \n Год: " + year +
                ", автор: "+ '\'' + author + '\'' +
                ", ссылается: " + ref;
    }
}
