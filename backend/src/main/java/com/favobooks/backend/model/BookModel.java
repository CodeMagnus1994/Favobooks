package com.favobooks.backend.model;

import com.favobooks.backend.enums.BookEnum;
import jakarta.persistence.*;

@Entity
@Table(name="books")
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="main_title")
    private String mainTitle;
    @Column(name="sub_title")
    private String subTitle;
    @Column(name="author")
    private String author;
    @Enumerated(EnumType.STRING)
    @Column(name="genre")
    private BookEnum genre;
    @Column(name="image")
    private String image;

    public BookModel(String mainTitle, String subTitle, String author, BookEnum genre, String image) {
        this.mainTitle = mainTitle;
        this.subTitle = subTitle;
        this.author = author;
        this.genre = genre;
        this.image = image;
    }

    public BookModel() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookEnum getGenre() {
        return genre;
    }

    public void setGenre(BookEnum genre) {
        this.genre = genre;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
