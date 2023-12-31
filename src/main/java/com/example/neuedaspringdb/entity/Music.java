package com.example.neuedaspringdb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("music")
public class Music {

    @Id
    private String id;
    private String name;

    private List<String> artists;

    private String genre;

    public Music(String name) {
        this.name = name;
    }

    public Music() {
    }

    public Music(String id, String name, List<String> artists, String genre) {
        this.id = id;
        this.name = name;
        this.artists = artists;
        this.genre = genre;
    }

    public Music(String name, List<String> artists, String genre) {
        this.name = name;
        this.artists = artists;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getArtists() {
        return artists;
    }

    public void setArtists(List<String> artists) {
        this.artists = artists;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", artists=" + artists +
                ", genre='" + genre + '\'' +
                '}';
    }
}