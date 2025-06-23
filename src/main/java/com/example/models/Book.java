package com.example.models;

import java.util.UUID;

public class Book {

  private UUID id;
  private String title;
  private String author;
  private String isbn;
  private String publisher;
  private int publicationYear;
  private String genre;
  private String language;
  private int pages;
  private String description;
  private String coverImageUrl;

  public Book(){};

  public Book(UUID id, String title, String author, String isbn, String publisher,
              int publicationYear, String genre, String language, int pages,
              String description, String coverImageUrl) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.publisher = publisher;
    this.publicationYear = publicationYear;
    this.genre = genre;
    this.language = language;
    this.pages = pages;
    this.description = description;
    this.coverImageUrl = coverImageUrl;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
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

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public int getPublicationYear() {
    return publicationYear;
  }

  public void setPublicationYear(int publicationYear) {
    this.publicationYear = publicationYear;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  @Override
  public String toString() {
    return "Book{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", isbn='" + isbn + '\'' +
            ", publisher='" + publisher + '\'' +
            ", publicationYear=" + publicationYear +
            ", genre='" + genre + '\'' +
            ", language='" + language + '\'' +
            ", pages=" + pages +
            ", description='" + description + '\'' +
            ", coverImageUrl='" + coverImageUrl + '\'' +
            '}';
  }

  
  
}
